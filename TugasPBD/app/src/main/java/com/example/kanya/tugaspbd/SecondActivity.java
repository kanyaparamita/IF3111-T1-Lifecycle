package com.example.kanya.tugaspbd;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class SecondActivity extends TracerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

} 