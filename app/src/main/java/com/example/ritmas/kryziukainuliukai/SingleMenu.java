package com.example.ritmas.kryziukainuliukai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SingleMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_player_menu);

    }

    public void StartSingle(View v) {
        Intent intent = new Intent(SingleMenu.this, Game.class);
        Bundle gameMode = new Bundle();
        if (v.getId() == R.id.button0) {
            gameMode.putInt("mode", 0);
            gameMode.putInt("level",0);
        } else if (v.getId() == R.id.button1) {
            gameMode.putInt("mode", 0);
            gameMode.putInt("level",1);
        } else if (v.getId() == R.id.button2) {
            gameMode.putInt("mode", 0);
            gameMode.putInt("level",2);
        } else if(v.getId() == R.id.button3) {
            gameMode.putInt("mode", 0);
            gameMode.putInt("level",3);
        }
        intent.putExtras(gameMode);
        startActivity(intent);
        finish();
    }

    public void onBackPressed() {
        finish();
        startActivity(new Intent(SingleMenu.this, MainActivity.class));
    }


}
