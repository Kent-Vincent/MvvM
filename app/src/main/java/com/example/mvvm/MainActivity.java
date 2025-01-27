package com.example.mvvm;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<FoodItems> items = new ArrayList<FoodItems>();
        items.add(new FoodItems(R.drawable.burger, "Burger", "P100"));
        items.add(new FoodItems(R.drawable.pizza, "Pizza", "P100"));
        items.add(new FoodItems(R.drawable.fries, "Fries", "P50"));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new FoodAdapter(getApplicationContext(),items));

    }
}