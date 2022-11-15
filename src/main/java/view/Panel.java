package view;

import loaders.ResourceLoader;
import objects.Piece;
import objects.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.ServerSocket;

public class Panel extends JPanel{

    private Player testPlayer1 = new Player("asd","red", this);
    private Player testPlayer2 = new Player("asd","blue", this);
    private Player testPlayer3 = new Player("asd","yellow", this);
    private Player testPlayer4 = new Player("asd","green", this);

    private JButton button = new JButton("asd");
    public static final int WIDTH = 898;
    public static final int HEIGHT = 898;

    public ServerSocket serverSocket;

    public Panel() {
        this.setLayout(null);

    }

    public static void main(String[] args) {

        //new Frame(WIDTH, HEIGHT, new Panel());
        new Frame(WIDTH, HEIGHT, new PanelMenu());
        //new Frame(WIDTH, HEIGHT, new PanelCreate());
    }


    @Override
    public void paint(Graphics g) {
        BufferedImage fondo  = ResourceLoader.loadGraphics("FondoLudo.png");
        g.drawImage(fondo, 0,0,this.getWidth(),this.getHeight(), null);
        setOpaque(false);
        super.paint(g);
    }

    public void resize(){
        Graphics g = getGraphics();
        BufferedImage fondo  = ResourceLoader.loadGraphics("FondoLudo.png");
        g.drawImage(fondo.getScaledInstance(getWidth(), getHeight(), BufferedImage.SCALE_DEFAULT), 0, 0, null);
        this.repaint();
    }
}
