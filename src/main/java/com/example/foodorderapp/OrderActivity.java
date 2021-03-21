package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.foodorderapp.Adapters.OrdersAdapter;
import com.example.foodorderapp.databinding.ActivityOrderBinding;
import com.example.foodorderapp.models.OrdersModel;

import java.util.ArrayList;
import java.util.Set;

public class OrderActivity extends AppCompatActivity {
    ActivityOrderBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding= ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<OrdersModel> list = new ArrayList<>();
        list.add(new OrdersModel(R.drawable.burger,"Burger","60","001"));
        list.add(new OrdersModel(R.drawable.burger,"Burger","60","001"));
        list.add(new OrdersModel(R.drawable.burger,"Burger","60","001"));
        list.add(new OrdersModel(R.drawable.burger,"Burger","60","001"));
        list.add(new OrdersModel(R.drawable.burger,"Burger","60","001"));

        OrdersAdapter adapter = new OrdersAdapter(list,this);
        binding.ordersRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        binding.ordersRecyclerView.setLayoutManager(layoutManager);
    }
}