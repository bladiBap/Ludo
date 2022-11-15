package view;

import loaders.ResourceLoader;
import objects.Sound;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.ServerSocket;

public class Frame extends JFrame implements MouseListener {

    private ImageIcon icono = new ImageIcon(ResourceLoader.loadGraphics("IconoLudo.jpg"));
    private Sound audioDado = new Sound(ResourceLoader.loadSounds("PrestamelaAMi.wav"));
    private Sound audioPaso = new Sound(ResourceLoader.loadSounds("SonidoPaso.wav"));

    public Frame(int width, int height, Panel panel) {
        try {
            //esto es para hacer lo de sockets pero aun no hice nda de eso xd
            panel.serverSocket = new ServerSocket(9999);

        } catch (IOException e){
            System.exit(0);
        }

        this.setTitle("Ludo | Proyecto");
        this.pack();
        this.setSize(width + this.getInsets().left + this.getInsets().right, height + this.getInsets().top + this.getInsets().bottom);
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(width, height));
        this.setIconImage(icono.getImage());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(panel);
        this.addMouseListener(this);
        this.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent componentEvent) {
               panel.resize();
            }
        });
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //this.audioPaso.play();
        //this.audioDado.play();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
