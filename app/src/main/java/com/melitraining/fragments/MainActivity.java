package com.melitraining.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText firstNameEditText;

    private String firstName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNameEditText = (EditText) findViewById(R.id.first_name);
        firstNameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                updateTitle(editable.toString());
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        firstNameEditText.setText(firstName);
    }

    private void updateTitle(String name) {
        getActionBar().setTitle("Hola " + name);
    }
}
