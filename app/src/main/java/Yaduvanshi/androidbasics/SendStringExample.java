package Yaduvanshi.androidbasics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SendStringExample extends AppCompatActivity implements View.OnClickListener {
Button sendMessage;
EditText mess;
String Message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_string_example);
        sendMessage=findViewById(R.id.sendmessage);
        mess=findViewById(R.id.messageED);
        Message=mess.getText().toString();
        sendMessage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.sendmessage)
        {
            Toast.makeText(this,Message,Toast.LENGTH_SHORT).show();
            Intent i=new Intent(this,GetMessageFromText.class);
            i.putExtra("messageFromSendMessage",Message);
            startActivity(i);

        }
    }
}
