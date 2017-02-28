package com.example.well.a22;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_x ;
    private  Button btn_add;

    private TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_x = (Button)findViewById(R.id.btn_w);
        tt = (TextView)findViewById(R.id.txt_hh);
        btn_x.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {

                // TODO Auto-generated method stub

                tt.setText("Stay Hungry, Stay Foolish.\n test well is good ");

            }

        });


        btn_add = (Button)findViewById(R.id.btn_add);
        btn_add.setOnClickListener(
                new Button.OnClickListener(){

                    @Override

                    public void onClick(View v) {

                        // TODO Auto-generated method stub

                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this, Add_ww.class);
                        startActivity(intent);
                       // finish();

                    }

                }


        );


    }


}
