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
        /**
         * Agreguamos un {@link android.text.TextWatcher} a {@link #firstNameEditText} para
         * saber cuando se cambia el nombre de la persona en el formulario
         */
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

    /**
     * Actualiza el titulo del ActionBar
     */
    private void updateTitle(String name) {
        getActionBar().setTitle("Hola " + name);
    }
}
