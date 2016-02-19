package com.helloworld.kahel.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView txt_greetings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        txt_greetings = (TextView) findViewById(R.id.txt_greetings);

        String name = getIntent().getStringExtra("name");
        txt_greetings.setText("Hello".concat(name));
    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
