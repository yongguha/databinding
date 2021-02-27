package com.ygha.databinding.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {
    String name;
    int age;
    String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    protected Student(Parcel parcel){
        name = parcel.readString();
        age = parcel.readInt();
        address = parcel.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel parcel) {
            return new Student(parcel);
        }

        @Override
        public Student[] newArray(int i) {
            return new Student[i];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeString(name);
        parcel.writeInt(age);
        parcel.writeString(address);

    }
}
