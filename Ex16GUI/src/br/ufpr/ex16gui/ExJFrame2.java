
package br.ufpr.ex16gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ExJFrame2 {
    
    public void chamaJFrame(){
        JFrame frame = new JFrame("HelloWorldSwing");
        
        frame.setTitle("Título do JFrame");
        frame.setLocation(100, 150);
        
        JTextField textField = new JTextField();//Adiciona campo texto
        textField.setPreferredSize(new Dimension(200, 24)); //Configura as dimensões do campo
                
        JLabel label = new JLabel("Nome");//Adiciona label
        label.setPreferredSize(new Dimension(200, 24)); //Configura as dimensões da área do label
        
        JPanel painel1=new JPanel();//Adiciona painel - recebe os demais componentes
        painel1.setBackground(Color.GREEN);
  
        frame.add(painel1); //Adiciona painel no frame
        painel1.add(label);
        painel1.add(textField);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Configura a ação do botão X
        frame.setPreferredSize(new Dimension(400, 300));
        frame.pack();  //pack() faz com que a janela seja ajustada para o tamanho preferido de todos os seus subcomponentes.
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
