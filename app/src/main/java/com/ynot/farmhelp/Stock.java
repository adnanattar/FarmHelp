package com.ynot.farmhelp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class Stock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock);

       Spinner select_crop =findViewById(R.id.select_city);
       Spinner updated_data=findViewById(R.id.updated_data);

    }
}