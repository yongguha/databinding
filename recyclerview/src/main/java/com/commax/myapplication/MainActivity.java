package com.commax.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DividerItemDecoration;

import android.os.Bundle;

import com.commax.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<YoutubeItem> list;

    RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<>();

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        list.add(new YoutubeItem(getDrawable(R.drawable.image01), getString(R.string.title01)));
        list.add(new YoutubeItem(getDrawable(R.drawable.image02), getString(R.string.title02)));
        list.add(new YoutubeItem(getDrawable(R.drawable.image03), getString(R.string.title03)));
        list.add(new YoutubeItem(getDrawable(R.drawable.image04), getString(R.string.title04)));
        list.add(new YoutubeItem(getDrawable(R.drawable.image05), getString(R.string.title05)));
        list.add(new YoutubeItem(getDrawable(R.drawable.image06), getString(R.string.title06)));
        list.add(new YoutubeItem(getDrawable(R.drawable.image07), getString(R.string.title07)));
        list.add(new YoutubeItem(getDrawable(R.drawable.image08), getString(R.string.title08)));
        list.add(new YoutubeItem(getDrawable(R.drawable.image09), getString(R.string.title09)));
        list.add(new YoutubeItem(getDrawable(R.drawable.image10), getString(R.string.title10)));

        adapter = new RecyclerAdapter(list);

        binding.recyclerView.setAdapter(adapter);
        binding.recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));



    }
}