
package br.ufpr.ex16gui;

import java.awt.Dimension;
import javax.swing.*;

public class ExJFrame1 {

    public void chamaJFrame(){
        JFrame frame = new JFrame("HelloWorldSwing");
        
        JLabel label = new JLabel("Hello World");
        frame.setTitle("Título do JFrame");
        frame.getContentPane().add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setPreferredSize(new Dimension(400, 300));
        frame.pack();  //pack() faz com que a janela seja ajustada para o tamanho preferido de todos os seus subcomponentes.
        frame.setLocationRelativeTo(null); //coloca a tela centralizada
       
        frame.setVisible(true);
    }
}
