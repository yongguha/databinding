package com.commax.fragmentbindingtest;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentTransaction;

import com.commax.fragmentbindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements IMainActivity{

    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //init();
    }

    private void init(){

        MainFragment fragment = new MainFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_container, fragment, getString(R.string.fragment_main));
        transaction.commit();
    }

    @Override
    public void setMainFragment() {

        Toast.makeText(MainActivity.this, "call from MainFragment", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setSecondFragment() {
        Toast.makeText(MainActivity.this, "call from SecondFragment", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void another() {

    }
}
