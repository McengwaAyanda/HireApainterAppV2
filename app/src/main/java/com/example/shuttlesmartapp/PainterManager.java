package com.example.shuttlesmartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PainterManager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painter_manager);

        // Declare our buttons and assign them to the layout by ID

        Button btnCreatePainter = findViewById(R.id.btnCreatePainter);
        Button btnReadPainter = findViewById(R.id.btnReadPainter);
        Button btnUpdatePainter = findViewById(R.id.btnUpdatePainter);
        Button btnDeletePainter = findViewById(R.id.btnDeletePainter);
        Button btnGetAllPainters = findViewById(R.id.btnGetAllPainters);

        btnCreatePainter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code to execute after clicking button;
            }
        });

        btnReadPainter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code to execute after clicking button;
            }
        });

        btnUpdatePainter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code to execute after clicking button;
            }
        });

        btnDeletePainter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code to execute after clicking button;
            }
        });

        btnGetAllPainters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code to execute after clicking button;
            }
        });
    }
}