package com.example.crossfire.mywechatautoreplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcomeButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.FullscreenTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_button);
        Button button = (Button)this.findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(welcomeButton.this,MainActivity.class);
                startActivity(intent);
                welcomeButton.this.finish();
            }
        });
    }
}