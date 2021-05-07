package com.example.bagus_eri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvData = findViewById(R.id.tv_data);

        Intent dataIntent = getIntent();

        String data = dataIntent.getStringExtra("data");

        if (data.equals("")) {
            data = "Tidak ada data yang di kirimkan";
        }

        tvData.setText(data);
    }
}