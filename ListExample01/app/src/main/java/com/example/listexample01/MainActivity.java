package com.example.listexample01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.list);

        List<String> data = new ArrayList<>();

//        ArrayList<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
//        list.setAdapter(adapter);

        ArrayList<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        list.setAdapter((ListAdapter) adapter);

        data.add("ABCDE");
        data.add("12345");
        data.add("abcde");
        adapter.;

    }
}