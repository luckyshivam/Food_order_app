package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;

import com.example.foodorderapp.Adapters.MainAdapter;
import com.example.foodorderapp.databinding.ActivityMainBinding;
import com.example.foodorderapp.models.MainModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel>list=new ArrayList<>();
        list.add(new MainModel(R.drawable.burger, "Burger","60","veg creamy aaloo tikki burger"));
        list.add(new MainModel(R.drawable.pizza, "pizza","160","cheese burst pizza with lots of vegetables"));
        list.add(new MainModel(R.drawable.paneer, "paneer","150","sahi paneer with sahi swad"));
        list.add(new MainModel(R.drawable.rice, "Rice","80","fried basmati rice"));

        MainAdapter adapter = new MainAdapter(list,this);
        binding.recyclerview.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);

    }
}