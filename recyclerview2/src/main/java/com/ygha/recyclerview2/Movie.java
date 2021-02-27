package com.ygha.recyclerview2;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Movie extends BaseObservable {
    private String title, genre, year;
    public Movie(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    @Bindable
    public String getYear() {
        return year;
    }

    @Bindable
    public String getGenre() {
        return genre;
    }

    public void setYear(String year) {
        this.year = year;
        notifyPropertyChanged(BR.year);
    }
    public void setTitle(String name) {
        this.title = name;
        notifyPropertyChanged(BR.title);
    }
    public void setGenre(String genre) {
        this.genre = genre;
        notifyPropertyChanged(BR.genre);
    }
}
