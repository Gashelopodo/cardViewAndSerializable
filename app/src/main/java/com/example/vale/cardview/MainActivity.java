package com.example.vale.cardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Persona persona = new Persona("Mario", 29);
        Intent intent = new Intent(this, Main2Activity.class);

        intent.putExtra("persona", persona);

        startActivity(intent);

    }
}
