package com.apporioinfolabs.taxicarcategoryview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.apporioinfolabs.carcategoryview.CarCategoryView;

public class MainActivity extends AppCompatActivity {

    CarCategoryView carCategoryView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carCategoryView = findViewById(R.id.car_category_view);
        carCategoryView.initialiseListeners(new OnCarCategoryViewListeners());
        carCategoryView.setTextValue("Some value goes here ");

    }
}
