package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText editTextTo;
    private EditText resultMessage;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        resultMessage = findViewById(R.id.result_message);
        editTextTo = findViewById(R.id.editTextTo);

        String result = getIntent().getStringExtra(MainActivity.KEY_FOR_ACTIVITY);

        editTextTo.setText(result);

        String resulMessage = getIntent().getStringExtra(MainActivity.KEY_FOR_MESSAGE);
        resultMessage.setText(resulMessage);

    }
}