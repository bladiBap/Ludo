package objects;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Piece extends JLabel {
    private static final int size = 60;
    private int posX;
    private int posY;
    private String path;

    public Piece(int posX, int posY, String path, JPanel panel) {
        System.out.println(posX + " " + posY);
        this.posX = posX;
        this.posY = posY;
        this.path = path;
        this.addListener();
        drawPiece(panel);
    }

    public void drawPiece (JPanel panel){
        this.setBounds(posX, posY,size,size);
        panel.add(this);
        this.setText("color");
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setVerticalAlignment(SwingConstants.CENTER);
    }

    private void addListener (){
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("asd");
            }
        });
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }




}
