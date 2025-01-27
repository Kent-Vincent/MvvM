package com.example.mvvm;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodViewHolder extends RecyclerView.ViewHolder {


    ImageView imageView;
    TextView foodName, foodPrice;


    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        foodName = itemView.findViewById(R.id.foodName);
        foodPrice = itemView.findViewById(R.id.foodPrice);
    }
}
