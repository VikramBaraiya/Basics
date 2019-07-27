package Yaduvanshi.androidbasics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class SpinnerExample extends AppCompatActivity {

    Spinner spinsub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spinsub=findViewById(R.id.spinnerSubjects);
        List<String> spinnersub=new ArrayList<String>();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,spinnersub);
        spinsub.setAdapter(adapter);

    }
}
