package com.helloworld.kahel.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView list_names;
    AdapterNames adapterNames;

    String[] names = {"World","Test","Maynard","Name3","Name4","Name5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_names = (ListView) findViewById(R.id.list_names);
        adapterNames = new AdapterNames(getBaseContext(), names);
        list_names.setAdapter(adapterNames);

        adapterNames.notifyDataSetChanged();

        list_names.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                Bundle args = new Bundle();
                args.putString("name", names[position]);
                args.putBoolean("exists", true);
                args.getInt("test", 500);
                intent.putExtras(args);
                startActivity(intent);
            }
        });
    }
}
