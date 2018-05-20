package com.example.dell.myapplication;

import android.app.Fragment;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    View view;
    Button bt1, bt2, bt5, bt10, button;
    TextView showValue;
    EditText amountEnter;
    int x = 0;
    LinearLayout ff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showValue = (TextView) findViewById(R.id.result);
        amountEnter = (EditText) findViewById(R.id.enter_amount);
        ff = (LinearLayout) findViewById(R.id.linearLayout);
        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.gray);
    }

    public void onclick1(View view) {
        x = x + 1;
        showValue.setText(String.valueOf(x));
        int amt;
        amt = Integer.parseInt(amountEnter.getText().toString());
        if (amt==x) {
            view= this.getWindow().getDecorView();
            view.setBackgroundResource(R.color.pink);}
    }

    public void onclick2(View a) {
        x = x + 2;
        showValue.setText(String.valueOf(x));
        int amt;
        amt = Integer.parseInt(amountEnter.getText().toString());
                if (amt==x) {
                    view= this.getWindow().getDecorView();
                    view.setBackgroundResource(R.color.pink);}
    }

    public void onclick5(View b) {
        x = x + 5;
        showValue.setText(String.valueOf(x));
        int amt;
        amt = Integer.parseInt(amountEnter.getText().toString());
            if (amt==x) {
                view= this.getWindow().getDecorView();
                view.setBackgroundResource(R.color.pink);}
    }

    public void onclick10(View c) {
        x = x + 10;
        showValue.setText(String.valueOf(x));
        int amt;
        amt = Integer.parseInt(amountEnter.getText().toString());
            if (amt==x) {
                view= this.getWindow().getDecorView();
                view.setBackgroundResource(R.color.pink);}
    }

    public void onclickreset(View d) {
        x = 0;
        showValue.setText(String.valueOf(x));
    }


        }

    /*private Button bt1, bt2, bt5, bt10;
    private TextView result;
    private EditText enter_amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int x=0;

    private void onclick1(View a) {
        if (a.getId() == R.id.bt1) {
            x = x + 1;
        }
    }
     private void onclick2(View view){
            if (view.getId() == R.id.bt2) {
                x = x + 2;
            }
        }
        private void onclick5(View v){
            if (v.getId() == R.id.bt5) {
                x = x + 5;
            }
        }
        private void onclick10(View c){
         if (c.getId() == R.id.bt10){
             x=x+10;
         }
        }
        EditText a1 = (EditText)findViewById(R.id.enter_amount);
        int amount;
        amount = Integer.parseInt(a1.getText().toString());
        TextView t = (TextView)findViewById(R.id.result);
        t.setText(" "+x);*/
    /*private void init() {
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt5 = (Button) findViewById(R.id.bt5);
        bt10 = (Button) findViewById(R.id.bt10);
        enter_amount = (EditText) findViewById(R.id.enter_amount);
        result = (TextView) findViewById(R.id.result);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int total, x = 0;
        String amount = enter_amount.getText().toString();
        total = Integer.parseInt(amount);
        while (x <= total) {
            switch(onCreateView().getId()) {
                case R.id.bt1:
                    x = x + 1;
                case R.id.bt2:
                    x = x + 2;
                case R.id.bt5:
                    x = x + 5;
                case R.id.bt10:
                    x = x + 10;

            }
            result.setText(String.valueOf(x));*/