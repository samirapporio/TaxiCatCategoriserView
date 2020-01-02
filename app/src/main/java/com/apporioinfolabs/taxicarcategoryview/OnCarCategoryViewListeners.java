package com.apporioinfolabs.taxicarcategoryview;

import com.apporioinfolabs.carcategoryview.CarCategoryView;
import com.apporioinfolabs.carcategoryview.utils.Logs;

public class OnCarCategoryViewListeners implements CarCategoryView.OnCarcategoryViewListeners {
    @Override
    public void onElementSelect(String data) {
        Logs.i("*********  ->  ",""+data);
    }
}
