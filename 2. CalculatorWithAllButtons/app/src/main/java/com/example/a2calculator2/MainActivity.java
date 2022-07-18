package com.example.a2calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    int ip1,ip2;
    Button add,sub,mul,div,result,clear;
    boolean a = false;
    boolean s=false;
    boolean m=false;
    boolean d=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1  = findViewById(R.id.EditText);
        add = findViewById(R.id.add);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        sub = findViewById(R.id.sub);
        result = findViewById(R.id.result);
        clear = findViewById(R.id.clearBtn);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ip1 = Integer.parseInt(e1.getText().toString());
                e1.setText("");
                a =true;
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ip1 = Integer.parseInt(e1.getText().toString());
                e1.setText("");
                 s=true;
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ip1 = Integer.parseInt(e1.getText().toString());
                e1.setText("");
                 m=true;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ip1 = Integer.parseInt(e1.getText().toString());
                e1.setText("");
                d =true;
            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(a||s||d||m){
                    ip2 = Integer.parseInt(e1.getText().toString());
                    if(a)
                        e1.setText(""+(ip1+ip2));
                    else if(s)
                        e1.setText(""+(ip1-ip2));
                    else if(m)
                        e1.setText(""+(ip1*ip2));
                    else
                        e1.setText(""+(ip1/ip2));

                    a=false;s=false;d=false;m=false;
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
            }
        });
    }
    public void inputNumber(View V){
        Button btn=(Button)V;
        String digit=btn.getText().toString();
        String temp1 = e1.getText().toString();
        String eq=temp1+digit;

        e1.setText(eq);
    }

}