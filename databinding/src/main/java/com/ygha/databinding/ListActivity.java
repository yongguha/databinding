package com.ygha.databinding;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.ygha.databinding.databinding.ActivityListBinding;

public class ListActivity extends AppCompatActivity implements ListContract.Presenter{


    ActivityListBinding mBinding;
    EmployeeAdapter mEmployeeAdatper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_list);
        mBinding.reckyclerView.setLayoutManager(new LinearLayoutManager(this));
        mEmployeeAdatper = new EmployeeAdapter();
        mBinding.reckyclerView.setAdapter(mEmployeeAdatper);
    }

    @Override
    public void attachView(ListContract.View v) {

    }

    @Override
    public void detachView() {

    }

    @Override
    public void load() {

    }

    @Override
    public void addEmploye(Employee person) {

    }

    @Override
    public void removePerson(Employee person) {

    }
}
