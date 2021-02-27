package com.ygha.databinding.two.databinding;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.ygha.databinding.two.adapters.ProductAdapter;
import com.ygha.databinding.two.models.Product;

import java.util.List;

public class MainFragmentBindingAdapter {

    private static final int NUM_COLUMS = 4;
    @BindingAdapter("productsList")
    public static void setProductList(RecyclerView view, List<Product> products){
        if(products==null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = view.getLayoutManager();
        //GridLayoutManager gridLayoutManager = new GridLayoutManager(view.getContext(), 3);
        //gridLayoutManager.setMeasuredDimension();
        if(layoutManager==null){
            view.setLayoutManager(new GridLayoutManager(view.getContext(), NUM_COLUMS));
        }
        ProductAdapter adapter =(ProductAdapter) view.getAdapter();
        if(adapter==null){
            adapter = new ProductAdapter(view.getContext(), products);
            view.setAdapter(adapter);
        }
    }
}
