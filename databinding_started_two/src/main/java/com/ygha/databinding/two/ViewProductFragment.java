package com.ygha.databinding.two;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ygha.databinding.two.databinding.FragmentViewProductBinding;
import com.ygha.databinding.two.models.Product;
import com.ygha.databinding.two.models.ProductViewModel;


/**
 * Created by User on 2/6/2018.
 */

public class ViewProductFragment extends Fragment {

    private static final String TAG = "ViewProductFragment";

    // Data binding
    FragmentViewProductBinding mBinding;

    private Product mProduct;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = this.getArguments();
        if(bundle!=null){
            mProduct = bundle.getParcelable("intent_product");
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = FragmentViewProductBinding.inflate(inflater);
        mBinding.setIMainActivity((IMainActivity)getActivity());

        ProductViewModel productView = new ProductViewModel();
        productView.setProduct(mProduct);
        productView.setQuantity(1);
        mBinding.setProductView(productView);


        return mBinding.getRoot();
    }

}














