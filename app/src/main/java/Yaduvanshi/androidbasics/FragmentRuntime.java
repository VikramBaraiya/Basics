package Yaduvanshi.androidbasics;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class FragmentRuntime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_runtime);
        FrameLayout framel=findViewById(R.id.namefragmentcontainer);
      if(findViewById(R.id.namefragmentcontainer) != null)
      {
          if(savedInstanceState!=null)
          {
              return;
          }
          DisplayName dnfragment=new DisplayName();
          FragmentManager fm=getSupportFragmentManager();
          FragmentTransaction ft=fm.beginTransaction();
          ft.add(R.id.namefragmentcontainer,dnfragment);
          ft.commit();

      }

    }
}
