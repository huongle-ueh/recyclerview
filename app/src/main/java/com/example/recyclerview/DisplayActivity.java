package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    ImageView image;
    TextView title, content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        image = findViewById(R.id.dspl_image);
        title = findViewById(R.id.dspl_title);
        content = findViewById(R.id.dspl_content);

        image.setImageResource(getIntent().getIntExtra("image", 0));
        title.setText(getIntent().getStringExtra("title"));
        content.setText(getIntent().getStringExtra("content"));
    }
}