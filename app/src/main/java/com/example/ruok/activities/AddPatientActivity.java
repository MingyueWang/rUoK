package com.example.ruok.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ruok.R;
public class AddPatientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_patient);
    }

    /**
     * save info and go to care provider page
     * @param view
     */
    public void save(View view){
        Intent intent = new Intent(this, CareProviderActivity.class);
        startActivity(intent);
    }
}
