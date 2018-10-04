package com.example.ritmas.kryziukainuliukai;

import java.util.Random;

public class Computer extends Game {
    String symbol;
    int image;

    public Computer(String symbol, int image) {
        this.symbol = symbol;
        this.image = image;
    }

    public void turn() {
        Random random = new Random();
        int a = 0;
        while(a < 9){
            int i = random.nextInt(8);
            if (board[i] == null){
                board[i]= symbol;
                buttonMap.get(i).setBackgroundResource(image);
                buttonMap.get(i).setClickable(false);
                break;
            }
            a++;
        }
    }

}
