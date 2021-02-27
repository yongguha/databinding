package com.commax.sample;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.commax.sample.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    public String btnString="";
    public String text="TEST";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setActivity(this);
        btnString="버튼";
        binding.idTextView.setText("1");
        binding.textViewTest.setText("2");
    }

    public void onButtonClick(View view){
        binding.idTextView.setText("3");
        binding.textViewTest.setText("4");

        btnString="스트링";
        //binding.invalidateAll(); //? 이게 있어야 TEST2가 찍힌다. 즉, 업데이트가 된다.
        //이렇게 하려면 observable을 해야 한다.

    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
