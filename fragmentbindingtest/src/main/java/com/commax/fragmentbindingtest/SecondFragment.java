package com.commax.fragmentbindingtest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.commax.fragmentbindingtest.databinding.FragmentMainBinding;
import com.commax.fragmentbindingtest.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    FragmentSecondBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_second,container,false);
        mBinding.setIMainActivity((IMainActivity)getActivity());
        mBinding.setSecondFragment(this);
        return mBinding.getRoot();
    }

    public void bindingTest(View view){
        mBinding.getIMainActivity().setSecondFragment();
    }

}
