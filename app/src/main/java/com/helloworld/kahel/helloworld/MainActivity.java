package com.helloworld.kahel.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit_name;
    Button btn_change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_name = (EditText) findViewById(R.id.edit_name);
        btn_change = (Button) findViewById(R.id.btn_change);


        btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String person_name = edit_name.getText().toString();
                SayGreetings(person_name);
            }
        });
    }

    public void SayGreetings(String name){
        Bundle args = new Bundle();
        args.putString("name", name);
        Intent next = new Intent(this, ResultActivity.class);
        next.putExtras(args);
        startActivity(next);
    }
}
