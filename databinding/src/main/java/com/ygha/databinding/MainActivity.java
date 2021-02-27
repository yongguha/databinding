package com.ygha.databinding;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    DeviceInfo deviceInfo;

    ArrayList<DeviceInfo> deviceInfos;

    SmartPlug smartPlug;
    SmartPlug smartPlug2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        deviceInfos = new ArrayList<>();
        deviceInfos.add(new DeviceInfo(false, 200));
        deviceInfos.add(new DeviceInfo(true, 100));

        smartPlug = new SmartPlug(deviceInfos.get(0), this);
        smartPlug2 = new SmartPlug(deviceInfos.get(1), this);




    }
}
