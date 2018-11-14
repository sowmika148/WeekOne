package com.example.stammana.weekone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        TextView textView = (TextView)findViewById(R.id.welcomeMessage);
        EditText editText = (EditText)findViewById(R.id.userName);
        textView.setText("Hello " + editText.getText().toString());
    }
}
