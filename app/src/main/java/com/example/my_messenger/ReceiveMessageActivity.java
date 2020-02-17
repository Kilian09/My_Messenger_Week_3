package com.example.my_messenger;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);

        Intent intent = getIntent(); // Obtengo el intent que me pasa la 1º pantalla

        String messageText = intent.getStringExtra(EXTRA_MESSAGE); // Obtengo el mensaje que he escrito

        TextView messageView = findViewById(R.id.message);

        messageView.setText(messageText);
    }
}
