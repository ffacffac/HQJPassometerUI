package com.hw.passometerui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hw.passometerui.view.MyPassometView;

public class Main2Activity extends AppCompatActivity {

    private Button btnAdd;
    private MyPassometView pView;
    private int addText = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pView = (MyPassometView) findViewById(R.id.view_passomet_view);
        btnAdd = (Button) findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText += 5;
                if (addText > 60) {
                    addText = 0;
                }
                pView.setText(addText);
            }
        });
    }
}
