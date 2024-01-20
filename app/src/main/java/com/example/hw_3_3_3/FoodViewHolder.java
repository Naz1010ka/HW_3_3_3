package com.example.hw_3_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodViewHolder extends RecyclerView.ViewHolder {

    private TextView tvFoods;

    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);
        tvFoods = itemView.findViewById(R.id.tv_food);
    }
    public void bind(String foodList){
        tvFoods.setText(foodList);
    }
}
