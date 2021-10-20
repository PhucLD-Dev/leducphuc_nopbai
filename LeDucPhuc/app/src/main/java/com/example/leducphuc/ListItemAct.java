package com.example.leducphuc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.leducphuc.adapter.ItemAdapter;
import com.example.leducphuc.database.AppDatabase;
import com.example.leducphuc.database.ItemEntity;

import java.util.List;

public class ListItemAct extends AppCompatActivity {

    RecyclerView rvItem;
    AppDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item);

        db = AppDatabase.getAppDatabase(this);
        List<ItemEntity> list = db.itemDao().getAllItem();

        ItemAdapter adapter = new ItemAdapter(this, list);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        rvItem = findViewById(R.id.rvItem);
        rvItem.setLayoutManager(layoutManager);
        rvItem.setAdapter(adapter);
    }
}