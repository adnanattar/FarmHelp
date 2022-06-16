package com.ynot.farmhelp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.StorageReference;

public class MyFarm extends AppCompatActivity {

    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userId;
    StorageReference storageReference;
    FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_farm);

        EditText fname = findViewById(R.id.fullName);
        EditText email= findViewById(R.id.email);
        EditText phone = findViewById(R.id.phone);

        Spinner select_crop= findViewById(R.id.select_crop);
        Spinner select_city= findViewById(R.id.select_city);
        Spinner select_market= findViewById(R.id.select_market);
        Spinner  select_soil = findViewById(R.id.select_soil);
       Spinner select_area=findViewById(R.id.select_area);
        EditText area=findViewById(R.id.area);
        EditText farm_location=findViewById(R.id.farm_location);
        EditText password=findViewById(R.id.password);

        Button submit=findViewById(R.id.registerBtn);


    }
}