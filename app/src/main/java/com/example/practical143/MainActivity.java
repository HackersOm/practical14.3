package com.example.practical143;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    String btnCollection [] = {"btn1","btn2","btn3","btn4","btn5","btn6","btn7","btn8","btn9","btn10","btn11","btn12","btn13","btn14","btn15"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView grid = (GridView) findViewById(R.id.gridView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.custombutton,btnCollection);
        grid.setAdapter(adapter);

        

    }

}