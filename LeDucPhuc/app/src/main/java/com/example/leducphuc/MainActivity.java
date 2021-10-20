package com.example.leducphuc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.leducphuc.database.AppDatabase;
import com.example.leducphuc.database.ItemEntity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edUser, edDes, edEmail;
    Spinner spinner;
    CheckBox ckAgree;
    Button btRegister;
    String gender = "Gripe";
    AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = AppDatabase.getAppDatabase(this);

        ckAgree = findViewById(R.id.ck);
        edUser = findViewById(R.id.edName);
        edDes = findViewById(R.id.edDes);
        edEmail = findViewById(R.id.edEmail);
        spinner = findViewById(R.id.spinner);
        btRegister = findViewById(R.id.btRegister);
        btRegister.setOnClickListener(this);

        String[] listGender = {"Gripe", "HomeWork", "Unknow"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, listGender);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("TAG", "onItemSelected: "+listGender[i]);
                gender = listGender[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }



    private void onRegister() {
        if (!validate()) {
            return;
        }
        ItemEntity item = new ItemEntity();
        item.name = edUser.getText().toString();
        item.description = edDes.getText().toString();
        item.email = edEmail.getText().toString();
        item.gender = gender;
        long id = db.itemDao().insertItem(item);
        if (id > 0) {
            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
        }
        goToListUser();
    }


    private void goToListUser() {
        Intent intent = new Intent(this, ListItemAct.class);
        startActivity(intent);
    }

    private boolean validate() {
        String mes = null;
        if (edUser.getText().toString().trim().isEmpty()) {
            mes = "Chưa nhập username";
        }else if (edDes.getText().toString().trim().isEmpty()) {
            mes = "Chưa nhập giới thiệu";
        }else if (edEmail.getText().toString().trim().isEmpty()) {
            mes = "Chưa nhập Email";
        }        else if (!ckAgree.isChecked()) {
            mes = "Bạn phải đồng ý điều khoản sử dụng";
        }
        if (mes != null) {
            Toast.makeText(this, mes, Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btRegister:
                onRegister();
                break;
            default:
                break;
        }
    }
}