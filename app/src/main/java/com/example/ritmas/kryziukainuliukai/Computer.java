package com.example.ritmas.kryziukainuliukai;
import android.util.Log;

import java.util.Random;



public class Computer extends Game {
    String symbol;
    int image;
    String opp;
    String win;


    public Computer(String symbol, int image) {
        this.symbol = symbol;
        this.image = image;
        this.opp = doubleOpposite();
        this.doubleWinner();


    }

    public String doubleOpposite() {
        if (symbol == "X") {
            opp = "OO";
        } else if (symbol == "O") {
            opp = "XX";
        }
        return opp;
    }

    public String doubleWinner() {
        if (symbol == "X") {
            win = "XX";
        } else if (symbol == "O") {
            win = "OO";
        }
        return opp;
    }


    public void easyTurn() {

        Random random = new Random();
        int a = 0;
        while(a < 9){
            int i = random.nextInt(9);
            if (board[i] == null){
                board[i]= symbol;
                buttonMap.get(i).setBackgroundResource(image);
                buttonMap.get(i).setClickable(false);
                break;
            }
            a++;

        }
    }

    public void hardTurn() {
        Random random = new Random();
        int a = 0;
        if(!offense()) {
            if (!defense()) {
                if (board[4] == null) {
                    board[4] = symbol;
                    buttonMap.get(4).setBackgroundResource(image);
                    buttonMap.get(4).setClickable(false);
                } else {
                    while (a < 9) {
                        int i = random.nextInt(9);
                        if (board[i] == null) {
                            board[i] = symbol;
                            buttonMap.get(i).setBackgroundResource(image);
                            buttonMap.get(i).setClickable(false);
                            break;
                        }
                        a++;

                    }
                }
            }
        }
    }

    public void mediumTurn() {

        Random random = new Random();
        int chance = random.nextInt(10);
        if (chance > 8) {
            easyTurn();
        } else {
            hardTurn();
        }

    }

    public boolean offense() {
        if ((board[0] + board[1]).equals(win) && board[2] == null){
            board[2] = symbol;
            buttonMap.get(2).setBackgroundResource(image);
            buttonMap.get(2).setClickable(false);
            return true;
        } else if ((board[0] + board[2]).equals(win) && board[1] == null){
            board[1]= symbol;
            buttonMap.get(1).setBackgroundResource(image);
            buttonMap.get(1).setClickable(false);
            return true;
        } else if ((board[1] + board[2]).equals(win) && board[0] == null){
            board[0]= symbol;
            buttonMap.get(0).setBackgroundResource(image);
            buttonMap.get(0).setClickable(false);
            return true;
        } else if ((board[3] + board[4]).equals(win) && board[5] == null){
            board[5]= symbol;
            buttonMap.get(5).setBackgroundResource(image);
            buttonMap.get(5).setClickable(false);
            return true;
        } else if ((board[3] + board[5]).equals(win) && board[4] == null){
            board[4]= symbol;
            buttonMap.get(4).setBackgroundResource(image);
            buttonMap.get(4).setClickable(false);
            return true;
        } else if ((board[4] + board[5]).equals(win) && board[3] == null){
            board[3]= symbol;
            buttonMap.get(3).setBackgroundResource(image);
            buttonMap.get(3).setClickable(false);
            return true;
        } else if ((board[6] + board[7]).equals(win) && board[8] == null){
            board[8]= symbol;
            buttonMap.get(8).setBackgroundResource(image);
            buttonMap.get(8).setClickable(false);
            return true;
        } else if ((board[7] + board[8]).equals(win) && board[6] == null){
            board[6]= symbol;
            buttonMap.get(6).setBackgroundResource(image);
            buttonMap.get(6).setClickable(false);
            return true;
        } else if ((board[8] + board[6]).equals(win) && board[7] == null){
            board[7]= symbol;
            buttonMap.get(7).setBackgroundResource(image);
            buttonMap.get(7).setClickable(false);
            return true;
        } else if ((board[0] + board[3]).equals(win) && board[6] == null){
            board[6]= symbol;
            buttonMap.get(6).setBackgroundResource(image);
            buttonMap.get(6).setClickable(false);
            return true;
        } else if ((board[3] + board[6]).equals(win) && board[0] == null){
            board[0]= symbol;
            buttonMap.get(0).setBackgroundResource(image);
            buttonMap.get(0).setClickable(false);
            return true;
        } else if ((board[6] + board[0]).equals(win) && board[3] == null){
            board[3]= symbol;
            buttonMap.get(3).setBackgroundResource(image);
            buttonMap.get(3).setClickable(false);
            return true;
        } else if ((board[1] + board[4]).equals(win) && board[7] == null){
            board[7]= symbol;
            buttonMap.get(7).setBackgroundResource(image);
            buttonMap.get(7).setClickable(false);
            return true;
        } else if ((board[4] + board[7]).equals(win) && board[1] == null){
            board[1]= symbol;
            buttonMap.get(1).setBackgroundResource(image);
            buttonMap.get(1).setClickable(false);
            return true;
        } else if ((board[7] + board[1]).equals(win) && board[4] == null){
            board[4]= symbol;
            buttonMap.get(4).setBackgroundResource(image);
            buttonMap.get(4).setClickable(false);
            return true;
        } else if ((board[2] + board[5]).equals(win) && board[8] == null){
            board[8]= symbol;
            buttonMap.get(8).setBackgroundResource(image);
            buttonMap.get(8).setClickable(false);
            return true;
        } else if ((board[5] + board[8]).equals(win) && board[2] == null){
            board[2]= symbol;
            buttonMap.get(2).setBackgroundResource(image);
            buttonMap.get(2).setClickable(false);
            return true;
        } else if ((board[8] + board[2]).equals(win) && board[5] == null){
            board[5]= symbol;
            buttonMap.get(5).setBackgroundResource(image);
            buttonMap.get(5).setClickable(false);
            return true;
        } else if ((board[0] + board[4]).equals(win) && board[8] == null){
            board[8]= symbol;
            buttonMap.get(8).setBackgroundResource(image);
            buttonMap.get(8).setClickable(false);
            return true;
        } else if ((board[4] + board[8]).equals(win) && board[0] == null){
            board[0]= symbol;
            buttonMap.get(0).setBackgroundResource(image);
            buttonMap.get(0).setClickable(false);
            return true;
        } else if ((board[8] + board[0]).equals(win) && board[4] == null){
            board[4]= symbol;
            buttonMap.get(4).setBackgroundResource(image);
            buttonMap.get(4).setClickable(false);
            return true;
        } else if ((board[2] + board[4]).equals(win) && board[6] == null){
            board[6]= symbol;
            buttonMap.get(6).setBackgroundResource(image);
            buttonMap.get(6).setClickable(false);
            return true;
        } else if ((board[4] + board[6]).equals(win) && board[2] == null){
            board[2]= symbol;
            buttonMap.get(2).setBackgroundResource(image);
            buttonMap.get(2).setClickable(false);
            return true;
        } else if ((board[6] + board[2]).equals(win) && board[4] == null) {
            board[4] = symbol;
            buttonMap.get(4).setBackgroundResource(image);
            buttonMap.get(4).setClickable(false);
            return true;
        } else return false;
    }

    public boolean defense() {
        if ((board[0] + board[1]).equals(opp) && board[2] == null){
            board[2] = symbol;
            buttonMap.get(2).setBackgroundResource(image);
            buttonMap.get(2).setClickable(false);
            return true;
        } else if ((board[0] + board[2]).equals(opp) && board[1] == null){
            board[1]= symbol;
            buttonMap.get(1).setBackgroundResource(image);
            buttonMap.get(1).setClickable(false);
            return true;
        } else if ((board[1] + board[2]).equals(opp) && board[0] == null){
            board[0]= symbol;
            buttonMap.get(0).setBackgroundResource(image);
            buttonMap.get(0).setClickable(false);
            return true;
        } else if ((board[3] + board[4]).equals(opp) && board[5] == null){
            board[5]= symbol;
            buttonMap.get(5).setBackgroundResource(image);
            buttonMap.get(5).setClickable(false);
            return true;
        } else if ((board[3] + board[5]).equals(opp) && board[4] == null){
            board[4]= symbol;
            buttonMap.get(4).setBackgroundResource(image);
            buttonMap.get(4).setClickable(false);
            return true;
        } else if ((board[4] + board[5]).equals(opp) && board[3] == null){
            board[3]= symbol;
            buttonMap.get(3).setBackgroundResource(image);
            buttonMap.get(3).setClickable(false);
            return true;
        } else if ((board[6] + board[7]).equals(opp) && board[8] == null){
            board[8]= symbol;
            buttonMap.get(8).setBackgroundResource(image);
            buttonMap.get(8).setClickable(false);
            return true;
        } else if ((board[7] + board[8]).equals(opp) && board[6] == null){
            board[6]= symbol;
            buttonMap.get(6).setBackgroundResource(image);
            buttonMap.get(6).setClickable(false);
            return true;
        } else if ((board[8] + board[6]).equals(opp) && board[7] == null){
            board[7]= symbol;
            buttonMap.get(7).setBackgroundResource(image);
            buttonMap.get(7).setClickable(false);
            return true;
        } else if ((board[0] + board[3]).equals(opp) && board[6] == null){
            board[6]= symbol;
            buttonMap.get(6).setBackgroundResource(image);
            buttonMap.get(6).setClickable(false);
            return true;
        } else if ((board[3] + board[6]).equals(opp) && board[0] == null){
            board[0]= symbol;
            buttonMap.get(0).setBackgroundResource(image);
            buttonMap.get(0).setClickable(false);
            return true;
        } else if ((board[6] + board[0]).equals(opp) && board[3] == null){
            board[3]= symbol;
            buttonMap.get(3).setBackgroundResource(image);
            buttonMap.get(3).setClickable(false);
            return true;
        } else if ((board[1] + board[4]).equals(opp) && board[7] == null){
            board[7]= symbol;
            buttonMap.get(7).setBackgroundResource(image);
            buttonMap.get(7).setClickable(false);
            return true;
        } else if ((board[4] + board[7]).equals(opp) && board[1] == null){
            board[1]= symbol;
            buttonMap.get(1).setBackgroundResource(image);
            buttonMap.get(1).setClickable(false);
            return true;
        } else if ((board[7] + board[1]).equals(opp) && board[4] == null){
            board[4]= symbol;
            buttonMap.get(4).setBackgroundResource(image);
            buttonMap.get(4).setClickable(false);
            return true;
        } else if ((board[2] + board[5]).equals(opp) && board[8] == null){
            board[8]= symbol;
            buttonMap.get(8).setBackgroundResource(image);
            buttonMap.get(8).setClickable(false);
            return true;
        } else if ((board[5] + board[8]).equals(opp) && board[2] == null){
            board[2]= symbol;
            buttonMap.get(2).setBackgroundResource(image);
            buttonMap.get(2).setClickable(false);
            return true;
        } else if ((board[8] + board[2]).equals(opp) && board[5] == null){
            board[5]= symbol;
            buttonMap.get(5).setBackgroundResource(image);
            buttonMap.get(5).setClickable(false);
            return true;
        } else if ((board[0] + board[4]).equals(opp) && board[8] == null){
            board[8]= symbol;
            buttonMap.get(8).setBackgroundResource(image);
            buttonMap.get(8).setClickable(false);
            return true;
        } else if ((board[4] + board[8]).equals(opp) && board[0] == null){
            board[0]= symbol;
            buttonMap.get(0).setBackgroundResource(image);
            buttonMap.get(0).setClickable(false);
            return true;
        } else if ((board[8] + board[0]).equals(opp) && board[4] == null){
            board[4]= symbol;
            buttonMap.get(4).setBackgroundResource(image);
            buttonMap.get(4).setClickable(false);
            return true;
        } else if ((board[2] + board[4]).equals(opp) && board[6] == null){
            board[6]= symbol;
            buttonMap.get(6).setBackgroundResource(image);
            buttonMap.get(6).setClickable(false);
            return true;
        } else if ((board[4] + board[6]).equals(opp) && board[2] == null){
            board[2]= symbol;
            buttonMap.get(2).setBackgroundResource(image);
            buttonMap.get(2).setClickable(false);
            return true;
        } else if ((board[6] + board[2]).equals(opp) && board[4] == null) {
            board[4] = symbol;
            buttonMap.get(4).setBackgroundResource(image);
            buttonMap.get(4).setClickable(false);
            return true;
        } else return false;
    }






}
