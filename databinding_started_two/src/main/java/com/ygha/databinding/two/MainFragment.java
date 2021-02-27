package com.ygha.databinding.two;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.ygha.databinding.two.adapters.ProductAdapter;
import com.ygha.databinding.two.databinding.FragmentMainBinding;
import com.ygha.databinding.two.models.Product;
import com.ygha.databinding.two.util.Products;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {


    FragmentMainBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //mBinding = FragmentMainBinding.inflate(inflater);
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main,container,false);
        mBinding.swipeRefreshLayout.setOnRefreshListener(this);
        setupProductsList();
        return mBinding.getRoot();
    }

    private void setupProductsList(){
        Products products = new Products();
        List<Product> productList = new ArrayList<>();
        productList.addAll(Arrays.asList(products.PRODUCTS));
        mBinding.setProducts(productList);
    }

    @Override
    public void onRefresh() {
        Products products = new Products();
        List<Product> productList = new ArrayList<>();
        productList.addAll(Arrays.asList(products.PRODUCTS));
        ((ProductAdapter)mBinding.recyclervView.getAdapter()).refreshList(productList);
        onItemLoadComplete();
    }

    void onItemLoadComplete(){
        (mBinding.recyclervView.getAdapter()).notifyDataSetChanged();
        mBinding.swipeRefreshLayout.setRefreshing(false);
    }




}
