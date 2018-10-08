package com.example.ritmas.kryziukainuliukai;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v4.util.TimeUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class Game extends AppCompatActivity {


    static Map<Integer, View> buttonMap = new HashMap<>();
    static Player player1 = new Player("X", R.drawable.xgreen);
    static Player player2 = new Player("O", R.drawable.circle);
    static Computer andr1 = new Computer("O", R.drawable.circle);
    static Computer andr2 = new Computer("X", R.drawable.xgreen);
    static String[] board;
    static int countX;
    static int countO;
    static int mode = 2;
    static Results res = new Results();
    static GameTools tools = new GameTools();
    static int buttonCount = 1;
    private Button reset;
    final Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
        Bundle gameMode = getIntent().getExtras();
        if(gameMode != null)
            mode = gameMode.getInt("key");

        reset = findViewById(R.id.button0);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetClicked();
            }
        });


        board = new String[9];
        countO = 0;
        countX = 0;
        mapViews();


    }

    public void resetClicked() {
        board = new String[9];
        for(Map.Entry<Integer, View> entry : buttonMap.entrySet()) {
            entry.getValue().setBackgroundResource(R.drawable.empty);
            entry.getValue().setClickable(true);
        }
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
    static void gameMessage(Context context, String winner) {


        CharSequence text = "Žaidimo rezultatas: " + winner;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
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

    public void buttonPress(View gameBoard) {
        View pressedButton = findViewById(gameBoard.getId());

       Context context = getApplicationContext();


        if (mode == 0) {
            player1.turn(pressedButton);
            res.checkWinner();


            if (res.checkWinner()== null) {
                //handler.postDelayed(turnAfterDelay, 200);
                andr1.turn();
                res.checkWinner();
            }


        } else if(mode == 1) {
            if (buttonCount == 1) {
                player1.turn(pressedButton);
                buttonCount = 2;
            } else {
                player2.turn(pressedButton);
                buttonCount = 1;
            }
        } else if(mode == 2) {
          while (res.checkWinner() == null) {
                andr2.turn();
                if(res.checkWinner() == null) {
                    andr1.turn();
                    res.checkWinner();
                }
           }
        }


        if(res.checkWinner() != null) {


            gameMessage(context, res.checkWinner());

            for(Map.Entry<Integer, View> entry : buttonMap.entrySet()) {
                entry.getValue().setClickable(false);
            }

            updateCounter(res.checkWinner());

        }
    }

    public void onBackPressed() {
        finish();
        startActivity(new Intent(Game.this, MainActivity.class));
    }

    public void mainMenu(View v) {
        finish();
        startActivity(new Intent(Game.this, MainActivity.class));
    }
    private Runnable turnAfterDelay = new Runnable() {
        @Override
        public void run() {
            andr1.turn();
        }
    };




}




