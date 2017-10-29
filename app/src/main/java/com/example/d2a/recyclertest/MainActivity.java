package com.example.d2a.recyclertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.d2a.recyclertest.Adapter.MyOwn;

public class MainActivity extends AppCompatActivity {

    MyOwn ad;
    RecyclerView recyclerView;
    String animals[], des[];
    int imageRes[] = {R.drawable.cat, R.drawable.kambing,
            R.drawable.cat, R.drawable.kambing,
            R.drawable.cat, R.drawable.kambing,
            R.drawable.cat, R.drawable.kambing};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.myRecycler);
        animals = getResources().getStringArray(R.array.pet_name);
        des = getResources().getStringArray(R.array.description);

        ad = new MyOwn(this, animals, des, imageRes);
	//create new variable
        recyclerView.setAdapter(ad);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
