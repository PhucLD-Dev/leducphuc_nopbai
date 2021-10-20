package com.example.leducphuc.adapter;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.leducphuc.R;
import com.example.leducphuc.database.ItemEntity;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter{

    Activity activity;
    List<ItemEntity> listItem;

    public ItemAdapter(Activity activity, List<ItemEntity> listItem) {
        this.activity = activity;
        this.listItem = listItem;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = activity.getLayoutInflater().inflate(R.layout.item_user, parent, false);
        ItemHolder holder = new ItemHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ItemHolder vh = (ItemHolder) holder;
        ItemEntity model = listItem.get(position);
        vh.tvID.setText(model.id + "");
        vh.tvEmail.setText(model.email);
        vh.tvDes.setText(model.description);
        vh.tvUser.setText(model.name);
        vh.tvGender.setText(model.gender);
    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }
    public class ItemHolder extends RecyclerView.ViewHolder {

        TextView tvUser, tvID, tvGender,tvEmail,tvDes;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            tvUser = itemView.findViewById(R.id.tvName);
            tvID = itemView.findViewById(R.id.tvId);
            tvGender = itemView.findViewById(R.id.tvSex);
            tvDes = itemView.findViewById(R.id.tvDes);
            tvEmail = itemView.findViewById(R.id.tvEmail);
        }
    }
}
