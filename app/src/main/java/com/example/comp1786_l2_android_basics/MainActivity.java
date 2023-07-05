package com.example.comp1786_l2_android_basics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView courseName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        courseName = findViewById(R.id.course_name);
        courseName.setText(R.string.course_name); // Get value of course_name in strings.xml
    }
}