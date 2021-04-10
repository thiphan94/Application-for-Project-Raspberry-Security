package com.example.rpi_l3mime;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

import java.util.List;

public class MyAdapter extends FirebaseRecyclerAdapter<ListData,MyAdapter.myviewholder>{
    private List<ListData>listData;

    public MyAdapter(@NonNull FirebaseRecyclerOptions<ListData> options) {
        super(options);
    }
    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull ListData model)
    {
        holder.date.setText(model.getDate());
        holder.name.setText(model.getName());
        holder.time.setText(model.getTime());
    }


    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_data,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        TextView date,name,time;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            date=(TextView)itemView.findViewById(R.id.date);
            name=(TextView)itemView.findViewById(R.id.name);
            time=(TextView)itemView.findViewById(R.id.time);
        }
    }
}
