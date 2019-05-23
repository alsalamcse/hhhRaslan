package com.yasen.raslan.newbrojhe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class page2 extends AppCompatActivity {
    private Button save;
    private EditText kind,color,GB,ramat,mph,price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        save=(Button)findViewById(R.id.save);
        kind=(EditText)findViewById(R.id.kind);
        color=(EditText)findViewById(R.id.color);
        GB=(EditText)findViewById(R.id.GB);
        mph=(EditText)findViewById(R.id.mph);
        price=(EditText)findViewById(R.id.price);
        ramat=(EditText)findViewById(R.id.ramat);
    }
    public void onClick1(View V) {
        if (V == save) {
            Intent intent = new Intent(getBaseContext(),Main2Activity.class);
            startActivity(intent);
        }
    }
}
