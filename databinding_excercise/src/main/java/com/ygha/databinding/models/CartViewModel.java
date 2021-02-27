package com.ygha.databinding.models;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.ygha.databinding.BR;
import com.ygha.databinding.util.BigDecimalUtil;
import com.ygha.databinding.util.Prices;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * Created by User on 2/9/2018.
 */

public class CartViewModel extends BaseObservable {

    private static final String TAG = "CartViewModel";

    private List<CartItem> carts = new ArrayList<>();
    private boolean isCartVisible;


    @Bindable
    public boolean isCartVisible() {
        return isCartVisible;
    }

    @Bindable
    public List<CartItem> getCarts() {
        return carts;
    }

    public void setCartVisible(boolean cartVisible) {
        isCartVisible = cartVisible;
        notifyPropertyChanged(BR.cartVisible);
    }

    public void setCarts(List<CartItem> cart) {
        Log.d(TAG, "setCart: updating cart.");
        this.carts = cart;
        notifyPropertyChanged(BR.carts);
    }

    public String getProductQuantitiesString(){
        int totalItems = 0;
        for(CartItem cartItem : carts){
            totalItems += cartItem.getQuantity();
        }

        String s = "";
        if(totalItems > 1){
            s = "items";
        }
        else{
            s = "item";
        }
        return ("( " + String.valueOf(totalItems) + " " + s + "): ");
    }

    public String getTotalCostString(){
        double totalCost = 0;
        for(CartItem cartItem : carts){
            int productQuantity = cartItem.getQuantity();

            double cost = productQuantity * (Prices.getPrices().get(String.valueOf(cartItem.getProduct().getSerial_number()))).doubleValue();
            totalCost += cost;
        }

        return "$" + BigDecimalUtil.getValue(new BigDecimal(totalCost));
    }

}



























