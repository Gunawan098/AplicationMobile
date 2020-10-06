package com.example.aplicationmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView viewText;
    private EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewText = findViewById(R.id.view_text);
        inputText = findViewById(R.id.input_text);
    }

    public void tampilkanInputan(View view) {
        String text = inputText.getText().toString();

        viewText.setText("Nama Anda : " +text);
    }
}