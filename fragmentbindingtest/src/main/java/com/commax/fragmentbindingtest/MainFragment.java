package com.commax.fragmentbindingtest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.commax.fragmentbindingtest.databinding.FragmentMainBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainFragment extends Fragment  {
    FragmentMainBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main,container,false);
        mBinding.setIMainActivity((IMainActivity)getActivity());
        mBinding.setMainFragment(this);
        return mBinding.getRoot();
    }

    public void bindingTest(View view){
        mBinding.getIMainActivity().setMainFragment();
    }



}
