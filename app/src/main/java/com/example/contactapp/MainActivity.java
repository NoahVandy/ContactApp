package com.example.contactapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btn_displayAll, btn_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_displayAll = findViewById(R.id.btn_displayAll);
        btn_search = findViewById(R.id.btn_search);


        btn_displayAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToDisplayAll = new Intent(v.getContext(), displayAll.class);
                startActivity(goToDisplayAll);
            }
        });
    }


}
