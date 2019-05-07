package com.example.amingalal.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Create items
    TextView tvnub;
    TextView tvPrice;
    Button order;
    Button btnPlus, btnsub;
    int qu = 0, n = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Continent between xml item & java item
        tvnub = findViewById(R.id.tvnub);
        order = findViewById(R.id.btnOrder);
        tvPrice = findViewById(R.id.tvPrice);
        btnPlus = findViewById(R.id.btnPlus);
        btnsub = findViewById(R.id.btnsub);


        //set click listener to button
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Create Toast mess
                Toast toast = Toast.makeText(getApplicationContext(), "Your order in way ", Toast.LENGTH_LONG);
                toast.show();
            }
        });


        //set click listener to button
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n++;
                tvnub.setText(n + "");
                qu = n * 5;
                tvPrice.setText(qu + "SDG");
            }
        });

        //set click listener to button
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                if (n > 0) {
                    n--;
                    tvnub.setText(n + "");
                } else {

                }

                //
                qu = n * 5;
                tvPrice.setText(qu + "SDG");
            }
        });
    }
}
