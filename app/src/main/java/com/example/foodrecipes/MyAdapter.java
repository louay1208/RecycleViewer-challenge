package com.example.foodrecipes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyviewHolder> {

    String data1[], data2[];
    Context context;
    public MyAdapter(Context ct, String s1[],String s2[]){
        context = ct;
        data1 = s1;
        data2 = s2;

    }
    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.my_row,parent,false);
        return new MyviewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {
        holder.mytext1.setText(data1[position]);
        holder.mytext2.setText(data2[position]);
        holder.mainLayout.setOnClickListener(view -> {
            Intent intent = new Intent(context,SecondActivity.class);
            intent.putExtra("data1",data1[position]);
            intent.putExtra("data2",data2[position]);

        });

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {

        TextView mytext1,mytext2;
        ConstraintLayout mainLayout;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            mytext1 = itemView.findViewById(R.id.tItle);
            mytext2 = itemView.findViewById(R.id.description);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
