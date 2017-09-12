package com.jacquan.a1button_and_textfields;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.view.MenuItem;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    public void clickFunction (View view) {

        EditText myTextField = (EditText) findViewById(R.id.textField);

        Log.i("TextField Value", myTextField.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
