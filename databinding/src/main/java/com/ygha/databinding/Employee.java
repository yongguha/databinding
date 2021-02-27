package com.ygha.databinding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.ObservableArrayMap;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.library.baseAdapters.BR;

public class Employee implements Observable {

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {

    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {

    }

    private String mLastName;
    private String mFirstName;

    public ObservableArrayMap<String, String> user = new ObservableArrayMap<>();
    private String mAvatar;

    public ObservableBoolean isFired = new ObservableBoolean();

    public Employee(String mLastName, String mFirstName, boolean fired) {
        this.mLastName = mLastName;
        this.mFirstName = mFirstName;
        isFired.set(fired);
    }

    @Bindable
    public String getLastName() {
        return mLastName;
    }

    public void setFirstName(String firstName){
        mFirstName = firstName;
    }

    @Bindable
    public String getFirstName() {
        return mFirstName;
    }

    @Bindable
    public String getmAvatar() {
        return mAvatar;
    }

    public void setmAvatar(String mAvatar) {
        this.mAvatar = mAvatar;
    }
}
