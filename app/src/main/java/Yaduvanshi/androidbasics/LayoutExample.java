package Yaduvanshi.androidbasics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.VideoView;

public class LayoutExample extends AppCompatActivity {

    Button play;
    VideoView trailer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_example);
        play=findViewById(R.id.playtrailer);
        trailer=findViewById(R.id.trailer);
        String videpath="android.resource://Yaduvanshi.androidbasics/";
    }
}
