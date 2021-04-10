package com.example.rpi_l3mime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class Today extends AppCompatActivity {

    List<ListData> listData;
    RecyclerView rv;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today);

        rv=(RecyclerView)findViewById(R.id.recyclerview);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));



        final DatabaseReference nm= FirebaseDatabase.getInstance().getReference("users");
        nm.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                listData=new ArrayList<>();
                for (DataSnapshot list : dataSnapshot.getChildren()){
                    listData.add(list.getValue(ListData.class));

                }
                adapter=new MyAdapter(listData);
                rv.setAdapter(adapter);

                }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                String error = databaseError.toString();
                Toast.makeText(Today.this, "Error : " + error, Toast.LENGTH_LONG).show();
            }
        });

    }
}