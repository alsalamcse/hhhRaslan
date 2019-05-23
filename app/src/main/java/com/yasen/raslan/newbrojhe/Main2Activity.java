package com.yasen.raslan.newbrojhe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main2Activity extends AppCompatActivity {
    private Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        add = (Button) findViewById(R.id.add);
    }

    public void onClick(View V) {
        if (V == add) {
            Intent intent = new Intent(getBaseContext(), page2.class);
            startActivity(intent);

        }
    }
}



