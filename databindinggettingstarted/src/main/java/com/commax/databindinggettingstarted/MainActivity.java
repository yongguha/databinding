package com.commax.databindinggettingstarted;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.commax.databindinggettingstarted.databinding.ActivityMainBinding;
import com.commax.databindinggettingstarted.models.Product;
import com.commax.databindinggettingstarted.util.Products;

public class MainActivity extends AppCompatActivity implements IMainActivity{

    //data binding
    ActivityMainBinding mBinding;

    //vars
    private Product mProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        Products products = new Products();
        mProduct = products.PRODUCTS[0];

        mBinding.setProduct(mProduct);
        mBinding.setQuantity(1);
        mBinding.setIMainActivity((IMainActivity)this);
       // mBinding.setTestUrl("https://i.redd.it/g5acbfi5hkm01.jpg");

    }

    @Override
    public void inflateQuantityDialog() {
        ChooseQuantityDialog dialog = new ChooseQuantityDialog();
        dialog.show(getSupportFragmentManager(),getString(R.string.dialog_choose_quantity));
    }

    @Override
    public void setQuantity(int quantity) {
        mBinding.setQuantity(quantity);
    }
}
