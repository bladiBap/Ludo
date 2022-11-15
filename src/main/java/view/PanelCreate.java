package view;

import loaders.ResourceLoader;

import javax.swing.*;
import java.awt.*;

public class PanelCreate extends JPanel {
    private static int sizeFond = 35;
    private JButton unirse = new JButton("Unirse");
    private JButton crear = new JButton("Crear Partida");

    private JLabel imageCrear = new JLabel();
    private JLabel imageUnirse = new JLabel();
    private JLabel label = new JLabel();
    public PanelCreate() {
        this.setLayout(null);
        this.setBackground(new Color(128,128,128));
        init();
    }

    public void init(){

        ImageIcon imageIcon = new ImageIcon(ResourceLoader.loadGraphics("LudoMenu.png"));
        label.setBounds(200,-60,500,500);
        Icon aux =  new ImageIcon(imageIcon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(aux);

        crear.setBounds(300, 400, 300, 50);
        crear.setFont(new Font("Arial", Font.BOLD, sizeFond));

        unirse.setBounds(300, 600, 300, 50);
        unirse.setFont(new Font("Arial", Font.BOLD, sizeFond));

        ImageIcon imagePlayer = new ImageIcon(ResourceLoader.loadGraphics("Crear.png"));
        imageCrear.setBounds(90,375,100,100);
        Icon aux2 =  new ImageIcon(imagePlayer.getImage().getScaledInstance(imageCrear.getWidth(), imageCrear.getHeight(), Image.SCALE_DEFAULT));
        imageCrear.setIcon(aux2);
        imageCrear.setAlignmentX(CENTER_ALIGNMENT);

        ImageIcon imageColor = new ImageIcon(ResourceLoader.loadGraphics("Unirse.png"));
        imageUnirse.setBounds(90,575,100,100);
        Icon aux3 =  new ImageIcon(imageColor.getImage().getScaledInstance(imageUnirse.getWidth(), imageUnirse.getHeight(), Image.SCALE_DEFAULT));
        imageUnirse.setIcon(aux3);
        imageUnirse.setAlignmentX(CENTER_ALIGNMENT);

        this.add(label);
        this.add(unirse);
        this.add(crear);
        this.add(imageCrear);
        this.add(imageUnirse);
    }
}
