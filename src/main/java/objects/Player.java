package objects;

import javax.swing.*;

public class Player {

    private String nickName;
    private String color;
    private  Piece [] piecesList = new Piece[4];
    public Player(String nickName, String color, JPanel panel) {
        this.nickName = nickName;
        this.color = color;
        initPiece(panel);
    }

    public void initPiece (JPanel panel){
        int x = 0;
        int y = 0;
        String pathImage = "";

        switch (color){
            case "red":
                x = 120;
                y = 120;
                pathImage = "LudoRojo.png";
                break;
            case "blue":
                x = 120;
                y = 660;
                pathImage = "LudoAzul.png";
                break;
            case "green":
                x = 660;
                y = 120;
                pathImage = "LudoVerde.png";
                break;
            case "yellow":
                x = 660;
                y = 660;
                pathImage = "LudoAmarillo.png";
                break;
        }


        int pos = 0;

        for ( int i = x; i <= x+60; i+=60) {
            for (int j = y; j <= y+60; j+=60) {
                System.out.println(i + " " + j+"ij");
                piecesList[pos] = new Piece(i,j,pathImage, panel);
                pos++;
            }
        }

    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
