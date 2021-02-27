package com.ygha.recyclerview2;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;

import com.ygha.recyclerview2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ObservableArrayList<Movie> movieList;
    private MovieAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mAdapter = new MovieAdapter();
        movieList = new ObservableArrayList<>();
        binding.recyclerView.setAdapter(mAdapter);
        binding.setMovieList(movieList);

        prepareMovieData();
    }

    private void prepareMovieData() {
        movieList.add(new Movie("Mad Max: Fury Road", "Action & Adventure", "2015"));
        movieList.add(new Movie("Inside Out", "Animation, Kids & Family", "2015"));
        movieList.add(new Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015"));
        movieList.add(new Movie("Shaun the Sheep", "Animation", "2015"));
    }
}
