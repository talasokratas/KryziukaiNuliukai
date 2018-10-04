package com.example.ritmas.kryziukainuliukai;

import java.util.Arrays;

public class Results extends Game {

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
                    winnerCombo(i, R.drawable.xwon);
                    return "laimėjo X";
                } else if (line.equals("OOO")) {
                    winnerCombo(i, R.drawable.circlewon);
                    return "laimėjo O";
                }

            }
            if (!Arrays.asList(board).contains(null)) {
            return "Lygiosios";
            } else return null;
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
}
