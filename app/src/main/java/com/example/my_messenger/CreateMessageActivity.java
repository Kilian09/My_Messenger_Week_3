package com.example.my_messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);

        send = findViewById(R.id.send);


    }

    //Call onSendMessage() when the button is clicked
     public void onSendMessage(View view){
         EditText messageView =  findViewById(R.id.message);
         String messageText = messageView.getText().toString();
         Intent intent = new Intent(this,ReceiveMessageActivity.class);
         intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageText);
         startActivity(intent);
     }
}
