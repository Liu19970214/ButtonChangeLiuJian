package com.example.administrator.buttonchangeliujian;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton btn1;
    private ImageButton btn2;
    private ImageButton btn3;
    private ImageButton btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (ImageButton) findViewById(R.id.imageButton1);
        btn2 = (ImageButton) findViewById(R.id.imageButton2);
        btn3 = (ImageButton) findViewById(R.id.imageButton3);
        btn4 = (ImageButton) findViewById(R.id.imageButton4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn1.setImageResource(R.drawable.tab_item_home_normal);
                btn2.setImageResource(R.drawable.tab_item_category_focus);
                btn3.setImageResource(R.drawable.tab_item_cart_focus);
                btn4.setImageResource(R.drawable.tab_item_personal_focus);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn1.setImageResource(R.drawable.tab_item_home_focus);
                btn2.setImageResource(R.drawable.tab_item_category_normal);
                btn3.setImageResource(R.drawable.tab_item_cart_focus);
                btn4.setImageResource(R.drawable.tab_item_personal_focus);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn1.setImageResource(R.drawable.tab_item_home_focus);
                btn2.setImageResource(R.drawable.tab_item_category_focus);
                btn3.setImageResource(R.drawable.tab_item_cart_normal);
                btn4.setImageResource(R.drawable.tab_item_personal_focus);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn1.setImageResource(R.drawable.tab_item_home_focus);
                btn2.setImageResource(R.drawable.tab_item_category_focus);
                btn3.setImageResource(R.drawable.tab_item_cart_focus);
                btn4.setImageResource(R.drawable.tab_item_personal_normal);

            }
        });
    }

}
