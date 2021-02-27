package com.ygha.databinding.databinding;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ygha.databinding.adapter.ProductsAdapter;
import com.ygha.databinding.models.Product;

import java.util.List;



/**
 * Created by User on 2/6/2018.
 */

public class MainFragmentBindingAdapters {

    private static final int NUM_COLUMNS = 2;

    @BindingAdapter("productsList")
    public static void setProductsList(RecyclerView view, List<Product> products){
        if(products == null){
            return;
        }
        RecyclerView.LayoutManager layoutManager = view.getLayoutManager();
        if(layoutManager == null){
            view.setLayoutManager(new GridLayoutManager(view.getContext(), NUM_COLUMNS));
        }
        ProductsAdapter adapter = (ProductsAdapter) view.getAdapter();
        if(adapter == null){
            adapter = new ProductsAdapter(view.getContext(),products);
            view.setAdapter(adapter);
        }
    }


}













