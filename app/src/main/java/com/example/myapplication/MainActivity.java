package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Declaring widgets
    TextView textView;
    Button btn;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //instantiating / creating widgets by Id
        textView = findViewById(R.id.textViewy);
        btn = findViewById(R.id.btn);
        editText = findViewById(R.id.editText1);

        // Adding the Functionality

        btn.setOnClickListener(view -> {
            String name = editText.getText().toString();

            // displaying the entered name
            Toast.makeText(MainActivity.this, "Hello " + name, Toast.LENGTH_LONG).show();
        });

    }
}