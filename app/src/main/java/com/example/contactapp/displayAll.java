package com.example.contactapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class displayAll extends AppCompatActivity {


    Button btn_addContactFromDisplayAll, btn_editContactFromDisplayAll;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_all);



        btn_addContactFromDisplayAll = findViewById(R.id.btn_addContactFromDisplayAll);
        btn_editContactFromDisplayAll = findViewById(R.id.btn_editContactFromDisplayAll);

        btn_addContactFromDisplayAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToAddContact = new Intent(v.getContext(), addContact.class);
                startActivity(goToAddContact);
            }
        });

        btn_editContactFromDisplayAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToAddContact = new Intent(v.getContext(), displayContact.class);
                startActivity(goToAddContact);
            }
        });
    }
}
