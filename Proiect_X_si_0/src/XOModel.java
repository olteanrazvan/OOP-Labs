import javax.swing.*;

public class XOModel {
    String turns;
    boolean over;
    String winner;
    XOModel(){

    }
    public void isWinningMove(String[] moves){
        over = false;
        winner = "none";
        if(moves[0].equals(moves[1]) && moves[0].equals(moves[2]) && moves[0].compareTo("") != 0){
            over = true;
            winner = moves[0];
        }
        if(moves[3].equals(moves[4]) && moves[3].equals(moves[5]) && moves[3].compareTo("") != 0){
            over = true;
            winner = moves[3];
        }
        if(moves[6].equals(moves[7]) && moves[6].equals(moves[8]) && moves[6].compareTo("") != 0){
            over = true;
            winner = moves[6];
        }
        if(moves[0].equals(moves[3]) && moves[0].equals(moves[6]) && moves[0].compareTo("") != 0){
            over = true;
            winner = moves[0];
        }
        if(moves[1].equals(moves[4]) && moves[1].equals(moves[7]) && moves[1].compareTo("") != 0){
            over = true;
            winner = moves[1];
        }
        if(moves[2].equals(moves[5]) && moves[2].equals(moves[8]) && moves[2].compareTo("") != 0){
            over = true;
            winner = moves[2];
        }
        if(moves[0].equals(moves[4]) && moves[0].equals(moves[8]) && moves[0].compareTo("") != 0){
            over = true;
            winner = moves[0];
        }
        if(moves[2].equals(moves[4]) && moves[2].equals(moves[6]) && moves[2].compareTo("") != 0){
            over = true;
            winner = moves[2];
        }
    }
    public void incrementString(String turns){
        Integer i = Integer.parseInt(turns);
        i++;
        this.turns = String.valueOf(i);
    }
    public void setValue(){
        turns = "1";
        over = false;
    }
}
