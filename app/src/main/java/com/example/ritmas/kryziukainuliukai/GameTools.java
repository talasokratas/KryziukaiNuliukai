package com.example.ritmas.kryziukainuliukai;

import android.content.Context;

import android.widget.TextView;
import android.widget.Toast;



public class GameTools extends Game {

    public void mapViews() {

        buttonMap.put(0, findViewById(R.id.imageButton0));
        buttonMap.put(1, findViewById(R.id.imageButton1));
        buttonMap.put(2, findViewById(R.id.imageButton2));
        buttonMap.put(3, findViewById(R.id.imageButton3));
        buttonMap.put(4, findViewById(R.id.imageButton4));
        buttonMap.put(5, findViewById(R.id.imageButton5));
        buttonMap.put(6, findViewById(R.id.imageButton6));
        buttonMap.put(7, findViewById(R.id.imageButton7));
        buttonMap.put(8, findViewById(R.id.imageButton8));

    }

    static void gameMessage(Context context, String winner) {


        CharSequence text = "Žaidimo rezultatas: " + winner;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void updateCounter(String winner) {
        if(winner == "laimėjo X") {
            countX++;
        }
        if(winner == "laimėjo O") {
            countO++;
        }
        TextView textViewX = findViewById(R.id.countxView);
        TextView textViewO = findViewById(R.id.countoView);
        textViewX.setText(" " + countX);
        textViewO.setText(" " + countO);

    }



}
