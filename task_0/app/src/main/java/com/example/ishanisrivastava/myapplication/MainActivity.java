package com.example.ishanisrivastava.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int cost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button1=findViewById(R.id.button1);
        Button button2=findViewById(R.id.button2);
        Button button5=findViewById(R.id.button5);
        Button button10=findViewById(R.id.button10);
        Button reset=findViewById(R.id.reset);
        final TextView money = findViewById(R.id.money);
        final TextView paid = findViewById(R.id.paid);

        final RelativeLayout rel =  findViewById(R.id.main_layout);

        Random r=new Random();
        int n=(r.nextInt(100));
        System.out.print(n);
        money.setText(String.valueOf(n));

        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                int m=Integer.parseInt((String) money.getText());
                cost = Integer.parseInt((String) paid.getText());

                cost = cost+1;
                if(cost<m) paid.setText(String.valueOf(cost ));
                else if(cost==m)
                {
                    paid.setText(String.valueOf(cost));
                    rel.setBackgroundColor(Color.parseColor("green"));



                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                int m=Integer.parseInt((String) money.getText());
                cost = Integer.parseInt((String) paid.getText());
                cost = cost + 2;
                if(cost<m)
                    paid.setText(String.valueOf(cost));
                else if(cost==m)
                {
                    paid.setText(String.valueOf(cost) );
                    rel.setBackgroundColor(Color.parseColor("green"));

                }

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int m=Integer.parseInt((String) money.getText());
                cost = Integer.parseInt((String) paid.getText());
                cost = cost +5;
                if(cost<m)
                    paid.setText(String.valueOf(cost));
                else if(cost==m)
                {
                    paid.setText(String.valueOf(cost));

                    rel.setBackgroundColor(Color.parseColor("green"));

                }

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int m=Integer.parseInt((String) money.getText());
                cost = Integer.parseInt((String) paid.getText());
                cost = cost +10;
                if(cost<m)
                    paid.setText(String.valueOf(cost));
                else if(cost==m)
                {
                    paid.setText(String.valueOf(cost));
                    rel.setBackgroundColor(Color.parseColor("green"));


                }
            }});
        reset.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                paid.setText("0");
                rel.setBackgroundColor(Color.parseColor("white"));

            }

        });



    }
}
