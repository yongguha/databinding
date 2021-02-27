package com.ygha.databinding.two.models;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.ygha.databinding.two.BR;
import com.ygha.databinding.two.models.Product;

public class ProductViewModel extends BaseObservable {

    private Product product;
    private int quantity;
    public boolean imageVisibility = false;

    @Bindable
    public boolean isImageVisibility() {
        return imageVisibility;
    }



    @Bindable
    public Product getProduct() {
        return product;
    }

    @Bindable
    public int getQuantity() {
        return quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
        notifyPropertyChanged(BR.product);
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        notifyPropertyChanged(BR.quantity);
    }

    public void setImageVisibility(boolean imageVisibility) {
        this.imageVisibility = imageVisibility;
        notifyPropertyChanged(BR.imageVisibility);
    }

    public RequestListener getCustomRequestListener(){
        return new RequestListener() {
            @Override
            public boolean onLoadFailed(GlideException e, Object model, Target target, boolean isFirstResource) {
                return false;
            }

            @Override
            public boolean onResourceReady(Object resource, Object model, Target target, DataSource dataSource, boolean isFirstResource) {
                setImageVisibility(true);
                return false;
            }
        };
    }
}
