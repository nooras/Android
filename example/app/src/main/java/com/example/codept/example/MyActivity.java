package com.example.codept.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Button b1add =(Button) findViewById(R.id.btnadd);
        Button b2sub =(Button) findViewById(R.id.btnsub);
        Button b3mul =(Button) findViewById(R.id.btnmul);
        Button b4div =(Button) findViewById(R.id.btndiv);
    }
    public void add(View V)
    {
        int res;
        TextView a=(TextView) findViewById(R.id.number1);
        TextView b=(TextView) findViewById(R.id.number2);
        int c =new Integer(a.getText().toString());
        int d =new Integer(b.getText().toString());
        res=c+d;
        Toast.makeText(getApplicationContext(),"The result is:"+res, Toast.LENGTH_SHORT).show();
    }
    public void sub(View V)
    {
        int res;
        TextView a=(TextView) findViewById(R.id.number1);
        TextView b=(TextView) findViewById(R.id.number2);
        int c =new Integer(a.getText().toString());
        int d =new Integer(b.getText().toString());
        res=c-d;
        Toast.makeText(getApplicationContext(),"The result is:"+res, Toast.LENGTH_SHORT).show();
    }
    public void mul(View V)
    {
        int res;
        TextView a=(TextView) findViewById(R.id.number1);
        TextView b=(TextView) findViewById(R.id.number2);
        int c =new Integer(a.getText().toString());
        int d =new Integer(b.getText().toString());
        res=c*d;
        Toast.makeText(getApplicationContext(),"The result is:"+res, Toast.LENGTH_SHORT).show();
    }
    public void div(View V)
    {
        int res;
        TextView a=(TextView) findViewById(R.id.number1);
        TextView b=(TextView) findViewById(R.id.number2);
        int c =new Integer(a.getText().toString());
        int d =new Integer(b.getText().toString());
        res=c/d;
        Toast.makeText(getApplicationContext(),"The result is:"+res, Toast.LENGTH_SHORT).show();
    }
}

