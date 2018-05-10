package com.example.ishanisrivastava.firstapp;

//import android.annotation.SuppressLint;
import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.TextView;
import java.util.*;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    int cost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        Button button2=findViewById(R.id.button2);
        Button button3=findViewById(R.id.button3);
        Button button4=findViewById(R.id.button4);
        Button button5=findViewById(R.id.button5);
        final TextView money = findViewById(R.id.money);
        final TextView paid = findViewById(R.id.paid);
        //RelativeLayout  rl=new RelativeLayout(this);
      // final  RelativeLayout rel =  findViewById(R.id.rl);
         final ConstraintLayout lLayout=findViewById(R.id.relativeLayout);



        Random r=new Random();
        int n=(r.nextInt(100));
        money.setText(n+"");

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                int m=Integer.parseInt((String) money.getText());
                 cost = Integer.parseInt((String) paid.getText());

                cost = cost+1;
                if(cost<m) paid.setText(cost + "");
                else if(cost==m)
                {
                    paid.setText(cost + "");
                    lLayout.setBackgroundColor(Color.parseColor("#000000"));


                    //rel.setBackgroundColor(Color.GREEN);

                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                int m=Integer.parseInt((String) money.getText());
                cost = Integer.parseInt((String) paid.getText());
                cost = cost + 2;
                if(cost<m)
                paid.setText(cost + "");
                else if(cost==m)
                {
                    paid.setText(cost + "");
                    lLayout.setBackgroundColor(Color.parseColor("#000000"));
                    //rel.setBackgroundColor(Color.GREEN);

                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                int m=Integer.parseInt((String) money.getText());
                cost = Integer.parseInt((String) paid.getText());
                cost = cost +5;
                if(cost<m)
                paid.setText(cost + "");
                else if(cost==m)
                {
                    paid.setText(cost + "");
                    //rel.setBackgroundColor(Color.GREEN);
                    lLayout.setBackgroundColor(Color.parseColor("#000000"));

                }

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                int m=Integer.parseInt((String) money.getText());
                cost = Integer.parseInt((String) paid.getText());
                cost = cost +10;
                if(cost<m)
                    paid.setText(cost + "");
                else if(cost==m)
                {
                    paid.setText(cost + "");
                    lLayout.setBackgroundColor(Color.parseColor("#000000"));
                    //rel.setBackgroundColor(Color.GREEN);

                }

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                paid.setText("0");
            }

            });


        /*RelativeLayout  rl=new RelativeLayout(this);

        Button b1=new Button(this);
        Button b2= new Button(this);
        Button b5=new Button(this);
        Button b10= new Button(this);

        rl.addView(b1);
        rl.addView(b2);
        rl.addView(b5);
        rl.addView(b10);
        setContentView(rl);*/
    }}