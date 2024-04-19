package com.example.varbal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Method to navigate to the next activity
    public void navigateToNextPage(View view) {
        Intent intent = new Intent(this, Onbourding1.class);
        startActivity(intent);
    }
}
