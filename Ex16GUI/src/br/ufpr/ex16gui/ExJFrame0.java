
package br.ufpr.ex16gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ExJFrame0 {
    public void chamaFrame(){
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        frame.getContentPane().add(BorderLayout.NORTH, button1);
        frame.getContentPane().add(BorderLayout.SOUTH, button2);
        frame.setVisible(true);
   }
}
