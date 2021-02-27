package com.commax.myapplication;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class UserBinding {

    @BindingAdapter("imageDrawable")
    public static void bindImageFromRes(ImageView imageView, Drawable drawable){
        imageView.setImageDrawable(drawable);
    }

}
