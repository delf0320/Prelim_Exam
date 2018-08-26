package com.boston.firstexam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.boston.firstexam.MainActivity.EXTRA_MESSAGE_ADDONS;
import static com.boston.firstexam.MainActivity.EXTRA_MESSAGE_ADDRESS;
import static com.boston.firstexam.MainActivity.EXTRA_MESSAGE_BURGER;
import static com.boston.firstexam.MainActivity.EXTRA_MESSAGE_CONTACT;
import static com.boston.firstexam.MainActivity.EXTRA_MESSAGE_CUSTOMER;

public class DisplayMesssage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_messsage);

        Intent i = getIntent();

        String dmet01 = i.getStringExtra(EXTRA_MESSAGE_CUSTOMER);
        String dmet02 = i.getStringExtra(EXTRA_MESSAGE_BURGER);
        String dmet03 = i.getStringExtra(EXTRA_MESSAGE_CONTACT);
        String dmet04 = i.getStringExtra(EXTRA_MESSAGE_ADDRESS);
        String dmet05 = i.getStringExtra(EXTRA_MESSAGE_ADDONS);


        TextView tv_et01 = (TextView) findViewById(R.id.tv1);
        TextView tv_et02 = (TextView) findViewById(R.id.tv2);
        TextView tv_et03 = (TextView) findViewById(R.id.tv3);
        TextView tv_et04 = (TextView) findViewById(R.id.tv4);
        TextView tv_et05 = (TextView) findViewById(R.id.tv5);

        tv_et01.setText("Customer's Name: " + dmet01.toString() + "\n");
        tv_et02.setText("Burger Name: " + dmet02.toString() + "\n");
        tv_et03.setText("Contact: " + dmet03.toString() + "\n");
        tv_et04.setText("Address: " + dmet04.toString() + "\n");
        tv_et05.setText("Add-Ons: " + "\n" + "     " + dmet05.toString());



    }


}
