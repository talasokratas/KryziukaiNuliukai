package com.example.ritmas.kryziukainuliukai;

import android.view.View;

import java.util.Map;

public class Player extends Game{

    String symbol;
    int image;

    public Player(String symbol, int image) {
        this.symbol = symbol;
        this.image = image;
    }

    public void turn(View button) {

       button.setBackgroundResource(image);
        button.setClickable(false);

        for (Map.Entry<Integer, View> entry : buttonMap.entrySet()) {
            if (entry.getValue().equals(button)) {
                board[entry.getKey()] = symbol;
            }

        }

    }
}