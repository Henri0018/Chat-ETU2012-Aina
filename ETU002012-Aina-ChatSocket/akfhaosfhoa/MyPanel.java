import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class MyPanel extends JPanel {


	 Dimension SCREEN_SIZE= new Dimension(700,500);
   JTextField texte_input=new JTextField();
   JLabel titre=new JLabel("");
   JButton envoyer=new JButton("Envoyer");
   JPanel message_panel=new JPanel();
   Client client;
   int lastm=10;
    MyPanel(Client c){
      client=c;
      setLayout(null);
      add(message_panel);
      message_panel.setBounds(70,150,450,300);
      add(titre);
      titre.setBounds(100,10,100,20);
      add(texte_input);
      texte_input.setBounds(70,40, 300, 80);
      add(envoyer);
      envoyer.setBounds(450,60, 80, 30);

    	setPreferredSize(SCREEN_SIZE);
      setBackground(new Color(121,154,178));
      
    }

 
}