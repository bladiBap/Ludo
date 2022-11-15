package view;

import loaders.ResourceLoader;

import javax.swing.*;
import java.awt.*;

public class PanelMenu extends JPanel {
        private static int sizeFond = 35;
        private JLabel labelColores = new JLabel("Colores");
        private JLabel labelImagenColor = new JLabel();
        private JLabel labelColor = new JLabel();
        private JLabel labelNickName = new JLabel("Nickname");
        private JTextField textFieldNickName = new JTextField();
        private JComboBox<String> comboBox = new JComboBox<>();
        private JLabel label = new JLabel();
        public PanelMenu() {
            this.setLayout(null);
            this.setBackground(new Color(128,128,128));
            init();
        }

        public void init(){

            ImageIcon imageIcon = new ImageIcon(ResourceLoader.loadGraphics("LudoMenu.png"));
            label.setBounds(200,-60,500,500);
            Icon aux =  new ImageIcon(imageIcon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
            label.setIcon(aux);
            label.setAlignmentX(CENTER_ALIGNMENT);

            labelColores.setBounds(150, 400, 300, 50);
            labelColores.setFont(new Font("Arial", Font.BOLD, sizeFond));
            labelColores.setForeground(Color.WHITE);

            ImageIcon imagePlayer = new ImageIcon(ResourceLoader.loadGraphics("Color.png"));
            labelImagenColor.setBounds(90,400,50,50);
            Icon aux2 =  new ImageIcon(imagePlayer.getImage().getScaledInstance(labelImagenColor.getWidth(), labelImagenColor.getHeight(), Image.SCALE_DEFAULT));
            labelImagenColor.setIcon(aux2);
            labelImagenColor.setAlignmentX(CENTER_ALIGNMENT);

            labelNickName.setBounds(150, 500, 300, 50);
            labelNickName.setFont(new Font("Arial", Font.BOLD, sizeFond));
            labelNickName.setForeground(Color.WHITE);

            ImageIcon imageColor = new ImageIcon(ResourceLoader.loadGraphics("Nick.png"));
            labelColor.setBounds(90,500,50,50);
            Icon aux3 =  new ImageIcon(imageColor.getImage().getScaledInstance(labelColor.getWidth(), labelColor.getHeight(), Image.SCALE_DEFAULT));
            labelColor.setIcon(aux3);
            labelColor.setAlignmentX(CENTER_ALIGNMENT);

            textFieldNickName.setBounds(400, 500, 400, 60);
            textFieldNickName.setFont(new Font("Arial", Font.BOLD, sizeFond));

            ((JLabel)comboBox.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
            comboBox.setFont(new Font("Arial", Font.BOLD, sizeFond));
            comboBox.addItem("Verde");
            comboBox.addItem("Azul");
            comboBox.addItem("Rojo");
            comboBox.addItem("Amarillo");
            comboBox.setBounds(400,390,200,70);


            this.add(label);
            this.add(comboBox);
            this.add(labelNickName);
            this.add(labelColores);
            this.add(textFieldNickName);
            this.add(labelImagenColor);
            this.add(labelColor);
        }
}
