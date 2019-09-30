package com.miss.tugasdicodingandroidpemula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Item_About extends AppCompatActivity {


    ImageView imageView;
    TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item__about);

        imageView = findViewById(R.id.ivFoto);
        textView1 = findViewById(R.id.tvDeskripsiDeveloper);
        textView2 = findViewById(R.id.tvNamaDeveloper);


    }
}
