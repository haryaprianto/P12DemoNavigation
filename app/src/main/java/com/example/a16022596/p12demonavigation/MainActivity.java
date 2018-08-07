package com.example.a16022596.p12demonavigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    android.widget.Button btnNewActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                btnNewActivity =
		findViewById(R.id.btnNewActivity);

        btnNewActivity.setOnClickListener(new
		android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                android.content.Intent i = new android.content.Intent(MainActivity.this,
			NewActivity.class);
                startActivity(i);
            }
        });

    }
}
