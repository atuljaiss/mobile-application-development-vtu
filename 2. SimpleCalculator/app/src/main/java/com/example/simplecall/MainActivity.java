package com.example.simplecall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1  = (EditText) findViewById(R.id.editTextTextPersonName);
        e2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        tv  = (TextView) findViewById(R.id.textView);
    }
    public void add(View V){
        int a1=Integer.parseInt(e1.getText().toString());
        int a2=Integer.parseInt(e2.getText().toString());
        int res=a1+a2;
        tv.setText(""+res);
    }
    public void sub(View V){
        int a1=Integer.parseInt(e1.getText().toString());
        int a2=Integer.parseInt(e2.getText().toString());
        int res=a1-a2;
        tv.setText(""+res);
    }
    public void mul(View V){
        int a1=Integer.parseInt(e1.getText().toString());
        int a2=Integer.parseInt(e2.getText().toString());
        int res=a1*a2;
        tv.setText(""+res);
    }
    public void div(View V){
        float a1=Integer.parseInt(e1.getText().toString());
        float a2=Integer.parseInt(e2.getText().toString());
        float res=a1/a2;
        tv.setText(""+res);
    }
}