package com.commax.myapplication;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Toast;

public class YoutubeItem {

    Drawable image;
    String title;

    public YoutubeItem(Drawable image, String title) {
        this.image = image;
        this.title = title;
    }

    public void onClickListener(View view){
        Toast.makeText(view.getContext(), "Clicked" + title, Toast.LENGTH_LONG).show();
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
