package com.example.foodrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String s1[], s2[];
    RecyclerView recyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleview);
        s1 = getResources().getStringArray(R.array.foo_list);
        s2 = getResources().getStringArray(R.array.brief_description);

        MyAdapter myAdapter = new MyAdapter(this ,s1,s2);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}