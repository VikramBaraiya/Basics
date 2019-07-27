package Yaduvanshi.androidbasics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class GetMessageFromText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_message_from_text);
        Intent i=getIntent();
        String message=i.getStringExtra("messageFromSendMessage");
        EditText et=findViewById(R.id.messageReceived);
        et.setText(message);
       // et.setText("hello there ");

    }
}
