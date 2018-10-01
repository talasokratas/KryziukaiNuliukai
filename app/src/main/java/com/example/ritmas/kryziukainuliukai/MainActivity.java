package com.example.ritmas.kryziukainuliukai;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class MainActivity extends AppCompatActivity {


    static String[] board;
    static String turn;
    static Map<Integer, View> buttonMap = new HashMap<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        board = new String[9];

        mapViews();


    }

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



    public void buttonPress(View v) {
        switch (v.getId()) {
            case R.id.imageButton0:
                findViewById(R.id.imageButton0).setBackgroundResource(R.drawable.xgreen);
                findViewById(R.id.imageButton0).setClickable(false);
                board[0] = "X";
                break;
            case R.id.imageButton1:
                findViewById(R.id.imageButton1).setBackgroundResource(R.drawable.xgreen);
                findViewById(R.id.imageButton1).setClickable(false);
                board[1] = "X";
                break;
            case R.id.imageButton2:
                findViewById(R.id.imageButton2).setBackgroundResource(R.drawable.xgreen);
                findViewById(R.id.imageButton2).setClickable(false);
                board[2] = "X";
                break;
            case R.id.imageButton3:
                findViewById(R.id.imageButton3).setBackgroundResource(R.drawable.xgreen);
                findViewById(R.id.imageButton3).setClickable(false);
                board[3] = "X";
                break;
            case R.id.imageButton4:
                findViewById(R.id.imageButton4).setBackgroundResource(R.drawable.xgreen);
                findViewById(R.id.imageButton4).setClickable(false);
                board[4] = "X";
                break;
            case R.id.imageButton5:
                findViewById(R.id.imageButton5).setBackgroundResource(R.drawable.xgreen);
                findViewById(R.id.imageButton5).setClickable(false);
                board[5] = "X";
                break;
            case R.id.imageButton6:
                findViewById(R.id.imageButton6).setBackgroundResource(R.drawable.xgreen);
                findViewById(R.id.imageButton6).setClickable(false);
                board[6] = "X";
                break;
            case R.id.imageButton7:
                findViewById(R.id.imageButton7).setBackgroundResource(R.drawable.xgreen);
                findViewById(R.id.imageButton7).setClickable(false);
                board[7] = "X";
                break;
            case R.id.imageButton8:
                findViewById(R.id.imageButton8).setBackgroundResource(R.drawable.xgreen);
                findViewById(R.id.imageButton8).setClickable(false);
                board[8] = "X";
                break;
        }





        checkWinner();
        androidTurn();
        checkWinner();




    }

    static String checkWinner() {
        for (int i = 0; i < 8; i++) {
            String line = null;
            switch (i) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            if (line.equals("XXX")) {
                winnerCombo(i,R.drawable.xwon);
                return "X";
            } else if (line.equals("OOO")) {
                winnerCombo(i,R.drawable.circlewon);
                return "O";
            }
        }

        return null;
    }

    static void winnerCombo(int i, int resource) {
        switch (i) {
            case 0:
                buttonMap.get(0).setBackgroundResource(resource);
                buttonMap.get(1).setBackgroundResource(resource);
                buttonMap.get(2).setBackgroundResource(resource);
                break;
            case 1:
                buttonMap.get(3).setBackgroundResource(resource);
                buttonMap.get(4).setBackgroundResource(resource);
                buttonMap.get(5).setBackgroundResource(resource);
                break;
            case 2:
                buttonMap.get(6).setBackgroundResource(resource);
                buttonMap.get(7).setBackgroundResource(resource);
                buttonMap.get(8).setBackgroundResource(resource);
                break;
            case 3:
                buttonMap.get(0).setBackgroundResource(resource);
                buttonMap.get(3).setBackgroundResource(resource);
                buttonMap.get(6).setBackgroundResource(resource);
                break;
            case 4:
                buttonMap.get(1).setBackgroundResource(resource);
                buttonMap.get(4).setBackgroundResource(resource);
                buttonMap.get(7).setBackgroundResource(resource);
                break;
            case 5:
                buttonMap.get(2).setBackgroundResource(resource);
                buttonMap.get(5).setBackgroundResource(resource);
                buttonMap.get(8).setBackgroundResource(resource);
                break;
            case 6:
                buttonMap.get(0).setBackgroundResource(resource);
                buttonMap.get(4).setBackgroundResource(resource);
                buttonMap.get(8).setBackgroundResource(resource);
                break;
            case 7:
                buttonMap.get(2).setBackgroundResource(resource);
                buttonMap.get(4).setBackgroundResource(resource);
                buttonMap.get(6).setBackgroundResource(resource);
                break;
        }
    }

    public void androidTurn() {
        Random random = new Random();
        int a = 0;
        while(a < 9){
            int i = random.nextInt(8);
            if (board[i] == null){
              board[i]= "O";
              buttonMap.get(i).setBackgroundResource(R.drawable.circle);
              buttonMap.get(i).setClickable(false);
              break;
          }
          a++;
        }
    }

    public void reset(View v) {
        board = new String[9];
        for(int i = 0; i < 9; i++) {
            buttonMap.get(i).setBackgroundResource(R.drawable.empty);
            buttonMap.get(i).setClickable(true);
        }
    }

}

