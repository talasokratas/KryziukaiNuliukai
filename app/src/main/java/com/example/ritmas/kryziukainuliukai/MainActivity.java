package com.example.ritmas.kryziukainuliukai;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

        public void Start(View v) {
            Intent intent = new Intent(MainActivity.this, Game.class);
            Bundle gameMode = new Bundle();
            if (v.getId() == R.id.button0) {
                gameMode.putInt("key", 0);
            } else if (v.getId() == R.id.button1) {
                gameMode.putInt("key", 1);
            } else if (v.getId() == R.id.button2) {
                gameMode.putInt("key", 2);
            } else gameMode.putInt("key", 0);

            intent.putExtras(gameMode);
            startActivity(intent);
            finish();
        }
    }




