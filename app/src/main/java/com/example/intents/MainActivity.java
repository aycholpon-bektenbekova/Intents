package com.example.intents;

import static com.example.intents.R.id.button_send;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button_send;
    private EditText editText;
    private EditText textMessage;

    static String KEY_FOR_ACTIVITY = "key";
    static String KEY_FOR_MESSAGE;
    private EditText messageFrom;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageFrom = findViewById(R.id.message_from);
        textMessage = findViewById(R.id.message);

        editText = findViewById(R.id.email_address);

        button_send = (findViewById(R.id.button_send));
        button_send.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("IntentReset")
            @Override
            public void onClick(View view) {
                Intent email = new Intent(Intent.ACTION_SENDTO);
                email.setData(Uri.parse("mailto: your.email@gmail.com"));
                email.setType("message/rfc228");
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"test@gmail.com"});
                email.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                email.putExtra(Intent.EXTRA_TEXT, "My email message");
                startActivity(email);


            }
        });

    }

}