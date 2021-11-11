package com.example.foodrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView title,description;
    ImageView image;
    String data1,data2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        image = findViewById(R.id.imageView);
        title = findViewById(R.id.textViewtitle);
        description = findViewById(R.id.textViewdiscrption);
        getData();
        setData();

    }
    private void getData(){
        if(getIntent().hasExtra("data1")&&getIntent().hasExtra("data2")){
            data1 =getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");

        }
    }
    private  void setData(){
        title.setText(data1);
        description.setText(data2);
    }
}