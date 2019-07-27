package Yaduvanshi.androidbasics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button DynamicButton,autocompletetextbtn,movieReview,spinbtn,layoutbtn,sendstringbtn;
    String[] contents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  LinearLayout ll=new LinearLayout(this);

        contents=getResources().getStringArray(R.array.content);
        for(int i=0;i<contents.length;i++)
        {
            DynamicButton=new Button(this);
            DynamicButton.setText(contents[i]);
            DynamicButton.setId(i);
            ll.addView(DynamicButton);
        }
*/
        autocompletetextbtn=findViewById(R.id.autoCompleteTextViewbtn);
        autocompletetextbtn.setOnClickListener(this);
        movieReview=findViewById(R.id.movie_review);
        movieReview.setOnClickListener(this);
        spinbtn=findViewById(R.id.spinnerbtn);
        spinbtn.setOnClickListener(this);
        layoutbtn=findViewById(R.id.layoutbtn);
        layoutbtn.setOnClickListener(this);
        sendstringbtn=findViewById(R.id.sendstring);
        sendstringbtn.setOnClickListener(this);
        findViewById(R.id.fragmentxmlbtn).setOnClickListener(this);
        findViewById(R.id.fragmentruntimebtn).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        Intent i;
        switch (id)
        {

            case R.id.spinnerbtn:
                Toast.makeText(this,"you clicked spinner",Toast.LENGTH_SHORT).show();
                i=new Intent(this,SpinnerExample.class);
                startActivity(i);

            case R.id.autoCompleteTextViewbtn:
                Toast.makeText(this,"you clicked autocompletetet view button",Toast.LENGTH_LONG).show();
                i=new Intent(this,Actv.class);
                startActivity(i);
                break;
            case R.id.layoutbtn:
                Toast.makeText(this,"you clicked layout view button",Toast.LENGTH_LONG).show();
                i=new Intent(this,LayoutExample.class);
                startActivity(i);
                break;

            case R.id.sendstring:
                Toast.makeText(this,"you clicked layout view button",Toast.LENGTH_LONG).show();
                i=new Intent(this,SendStringExample.class);
                startActivity(i);
                break;


            case R.id.fragmentxmlbtn:
                Toast.makeText(this,"you clicked layout view button",Toast.LENGTH_LONG).show();
                i=new Intent(this, Fragmentusing.class);
                startActivity(i);
                break;

            case R.id.fragmentruntimebtn:
                Toast.makeText(this,"you clicked fragment runtime button",Toast.LENGTH_LONG).show();
                i=new Intent(this, FragmentRuntime.class);
                startActivity(i);
                break;

        }
    }
}
