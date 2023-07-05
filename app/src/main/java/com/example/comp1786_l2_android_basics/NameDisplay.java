package com.example.comp1786_l2_android_basics;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class NameDisplay extends AppCompatActivity {
    public static final String NAME = "name";
    TextView nameDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_display);

        nameDisplay = findViewById(R.id.name_display);

        Bundle extras = getIntent().getExtras();

        if (extras == null) {
            nameDisplay.setTextColor(Color.RED);
            nameDisplay.setText("ERROR ...");
            return;
        }

        String name = extras.getString(NAME);

        if (name.trim().isEmpty()) {
            nameDisplay.setTextColor(Color.RED);
            nameDisplay.setText("Name should not be empty");
            return;
        }

        nameDisplay.setTextColor(Color.BLUE);
        nameDisplay.setText("Hello " + name);
    }
}