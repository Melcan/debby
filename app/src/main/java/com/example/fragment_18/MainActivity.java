package com.example.fragment_18;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button btnfirstfragment , btnsecondfragment ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnfirstfragment = (Button) findViewById(R.id.firstfragment);
        btnsecondfragment = (Button) findViewById(R.id.secondfragment);

        btnfirstfragment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                loadFragment(new firstfragment());
            }
        });

        btnsecondfragment.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                loadFragment(new secondfragment());
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout, fragment);
        fragmentTransaction.commit();
    }
}