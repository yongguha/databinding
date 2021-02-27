package com.ygha.recyclerview2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ygha.recyclerview2.databinding.ItemMovieListBinding;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {

    private List<Movie> moviesList;

    MovieAdapter() {
        this.moviesList = new ArrayList<>();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemMovieListBinding binding = ItemMovieListBinding.
                inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movie movie = moviesList.get(position);
        holder.binding.setMovie(movie);
    }

    void setItem(List<Movie> movie) {
        if (movie == null) {
            return;
        }
        this.moviesList = movie;
        notifyDataSetChanged();

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ItemMovieListBinding binding;

        MyViewHolder(ItemMovieListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
