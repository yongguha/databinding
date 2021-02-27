package com.ygha.recyclerview2;

import androidx.databinding.BindingAdapter;
import androidx.databinding.ObservableArrayList;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterBindings {
    @BindingAdapter("bind:item")
    public static void bindItem(RecyclerView recyclerView, ObservableArrayList<Movie> movie) {
        MovieAdapter adapter = (MovieAdapter) recyclerView.getAdapter();
        if (adapter != null) {
            adapter.setItem(movie);
        }
    }
}
