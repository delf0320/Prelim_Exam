package com.boston.firstexam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE_CUSTOMER = "com.boston.firstexam.MESSAGE1";
    public static final String EXTRA_MESSAGE_BURGER = "com.boston.firstexam.MESSAGE2";
    public static final String EXTRA_MESSAGE_CONTACT = "com.boston.firstexam.MESSAGE3";
    public static final String EXTRA_MESSAGE_ADDRESS = "com.boston.firstexam.MESSAGE4";
    public static final String EXTRA_MESSAGE_ADDONS = "com.boston.firstexam.MESSAGE5";
    public static final String EXTRA_MESSAGE_SUBMIT = "com.boston.firstexam.MESSAGE6";
    public static final String EXTRA_MESSAGE_CLEAR = "com.boston.firstexam.MESSAGE7";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void send(View view) {
        Intent i = new Intent(this, com.boston.firstexam.DisplayMesssage.class);

        EditText et_1 = (EditText) findViewById(R.id.txt1);
        EditText et_2 = (EditText) findViewById(R.id.txt2);
        EditText et_3 = (EditText) findViewById(R.id.txt3);
        EditText et_4 = (EditText) findViewById(R.id.txt4);
        EditText et_5 = (EditText) findViewById(R.id.txt5);

        String et01 = et_1.getText().toString();
        String et02 = et_2.getText().toString();
        String et03 = et_3.getText().toString();
        String et04 = et_4.getText().toString();
        String et05 = et_5.getText().toString();


        i.putExtra(EXTRA_MESSAGE_CUSTOMER,et01);
        i.putExtra(EXTRA_MESSAGE_BURGER,et02);
        i.putExtra(EXTRA_MESSAGE_CONTACT,et03);
        i.putExtra(EXTRA_MESSAGE_ADDRESS,et04);
        i.putExtra(EXTRA_MESSAGE_ADDONS ,et05);

        Log.d(EXTRA_MESSAGE_SUBMIT, "send: Submit order is clicked!");

        startActivity(i);



    }
    public void Clear(View view){

        EditText et_1 = (EditText) findViewById(R.id.txt1);
        EditText et_2 = (EditText) findViewById(R.id.txt2);
        EditText et_3 = (EditText) findViewById(R.id.txt3);
        EditText et_4 = (EditText) findViewById(R.id.txt4);
        EditText et_5 = (EditText) findViewById(R.id.txt5);

        et_1.setText("");
        et_2.setText("");
        et_3.setText("");
        et_4.setText("");
        et_5.setText("");

        Log.d(EXTRA_MESSAGE_CLEAR, "clear: Clear is clicked!");

    }
}
