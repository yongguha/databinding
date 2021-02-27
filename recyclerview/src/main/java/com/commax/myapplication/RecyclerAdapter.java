package com.commax.myapplication;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.commax.myapplication.databinding.ListItemBinding;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    ArrayList<YoutubeItem> myYoutubeItems;

    YoutubeItem item;

    public RecyclerAdapter(ArrayList<YoutubeItem> items) {
        myYoutubeItems = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListItemBinding binding = ListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        item = myYoutubeItems.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return myYoutubeItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ListItemBinding binding;

        ViewHolder(ListItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(YoutubeItem yItem){
            item = yItem;
            binding.setVariable(BR.youtubeItem, item);
        }

    }
}
