package com.example.vale.cardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Persona persona = (Persona) intent.getSerializableExtra("persona");

        TextView textView = (TextView)findViewById(R.id.myText);
        textView.setText(persona.getNombre());

        Log.d(getClass().getCanonicalName(), "Persona = "+persona.getNombre());


    }
}
