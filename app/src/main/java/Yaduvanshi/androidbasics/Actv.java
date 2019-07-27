package Yaduvanshi.androidbasics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Actv extends AppCompatActivity {
AutoCompleteTextView actv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actv);
        String[] subjects={"c","c++","java","Python","py","php",".net","sql","sqllite"};
        actv=findViewById(R.id.actvSubjects);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,subjects);
        actv.setAdapter(adapter);
        actv.setThreshold(1);


    }
}
