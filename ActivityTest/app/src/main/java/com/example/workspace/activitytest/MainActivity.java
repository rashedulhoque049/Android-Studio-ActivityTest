package com.example.workspace.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText textSearch;
    String passData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        submit = (Button) findViewById(R.id.submit);
        textSearch = (EditText) findViewById(R.id.searchBox);





        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //
                passData = textSearch.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("tag",passData);
                startActivity(intent);
            }
        });

    }
}
