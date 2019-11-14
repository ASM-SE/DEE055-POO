
package br.ufpr.ex17guievents;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ExEvents1 extends JFrame implements ActionListener {

    JButton jbt1 = new JButton("Botão 1");
    JPanel jpn1 = new JPanel();
    
    
    public ExEvents1(){

        jpn1.setLayout(null);//Para tratar posicionamento fixo deve ser passado null
        jpn1.setBackground(Color.GREEN);
        
        jbt1.setBounds(10, 10, 100, 100); //setBounds(x, y, largura, altura );
        jbt1.addActionListener(this);
        jpn1.add(jbt1);
        
        add(jpn1);
        setTitle("Exemplo Eventos 1");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JOptionPane.showMessageDialog(null, "Olá Eventos!");
    }
  

    
}
