package com.suatcanolcer.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    boolean isTrue = true;

    public void changeImage(View view){
        switchImage();
    }

    private void switchImage() {
        ImageView imageView = findViewById(R.id.imageView);
        if (isTrue) {
            imageView.setImageResource(R.drawable.images22);
        } else {
            imageView.setImageResource(R.drawable.image11);
        }
        isTrue = !isTrue;
    }
}