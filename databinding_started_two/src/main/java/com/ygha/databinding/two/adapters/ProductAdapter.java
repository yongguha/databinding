package com.ygha.databinding.two.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;


import com.ygha.databinding.two.IMainActivity;
import com.ygha.databinding.two.R;
import com.ygha.databinding.two.databinding.ProductItemBinding;
import com.ygha.databinding.two.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.BindingHolder> {

    private List<Product> mProducts = new ArrayList<>();
    private Context mContext;
    //IMainActivity mIMainActivity;

    public ProductAdapter(Context mContext, List<Product> mProducts) {
        this.mProducts = mProducts;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public BindingHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ProductItemBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(mContext), R.layout.product_item, parent, false);
        return new BindingHolder(binding.getRoot());
    }
    @Override
    public void onBindViewHolder(@NonNull BindingHolder holder, int position) {
        Product product = mProducts.get(position);
        holder.binding.setProduct(product);
        holder.binding.setIMainActivity((IMainActivity)mContext);
        //holder.binding.setVariable(BR.product, product);
        holder.binding.executePendingBindings();
    }

    public void refreshList(List<Product> products){
        mProducts.clear();
        mProducts.addAll(products);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mProducts.size();
    }

    public class BindingHolder extends RecyclerView.ViewHolder{
        ProductItemBinding binding;
        public BindingHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
}
