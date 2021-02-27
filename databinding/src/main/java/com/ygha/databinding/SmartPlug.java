package com.ygha.databinding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.ygha.databinding.databinding.DevicePlugBinding;

public class SmartPlug extends LinearLayout {

    DevicePlugBinding binding;
    DeviceInfo mDevicedata;
    Context mContext;
    private View rootView;
    public SmartPlug(DeviceInfo mDevicedata, Context context) {
        super(context);
        this.mDevicedata = mDevicedata;
        this.mContext = context;
        init();
    }

    public void init(){
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (inflater != null) {
            binding = DevicePlugBinding.inflate(inflater);
            binding.setPlug(this);
            if(mDevicedata.getValue())
                binding.deviceImage.setBackgroundResource(R.drawable.ic_smartplug_on);
            else
                binding.deviceImage.setBackgroundResource(R.drawable.ic_smartplug_on);
        }
    }







}
