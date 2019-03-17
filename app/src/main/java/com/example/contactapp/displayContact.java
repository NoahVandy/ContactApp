package com.example.contactapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class displayContact extends AppCompatActivity {

    Button btn_editContactFromDisplayOne, btn_addContactFromDisplayOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_contact);

        btn_editContactFromDisplayOne = findViewById(R.id.btn_editContactFromDisplayOne);
        btn_addContactFromDisplayOne = findViewById(R.id.btn_addContactFromDisplayAll);


        btn_editContactFromDisplayOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToAddContact = new Intent(v.getContext(), addContact.class);
                startActivity(goToAddContact);
            }
        });


        btn_addContactFromDisplayOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToAddContact = new Intent(v.getContext(), addContact.class);
                startActivity(goToAddContact);
            }
        });
    }
}
