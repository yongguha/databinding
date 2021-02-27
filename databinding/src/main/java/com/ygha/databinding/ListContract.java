package com.ygha.databinding;

public interface ListContract {
    interface View{
        void showToast(String title);
    }
    public interface Presenter{
        void attachView(View v);
        void detachView();
        void load();
        void addEmploye(Employee person);
        void removePerson(Employee person);
    }
}
