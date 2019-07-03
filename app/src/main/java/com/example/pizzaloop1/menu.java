package com.example.pizzaloop1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class menu extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;

    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        productList = new ArrayList<>();

        recyclerView =  findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList.add(
                new Product(
                        1,
                        "vegetable pizza",
                        "fresh vegetable",
                        4.3,
                        750,
                        R.mipmap.pizza1));

        productList.add(
                new Product(
                        1,
                        "chicken pizza",
                        "chiken",
                        4.3,
                        1100,
                        R.mipmap.pizza2));

        productList.add(
                new Product(
                        1,
                        "seafood pizza",
                        "seafood",
                        4.3,
                        1200,
                        R.mipmap.pizza3));

        adapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(adapter);
    }
}
