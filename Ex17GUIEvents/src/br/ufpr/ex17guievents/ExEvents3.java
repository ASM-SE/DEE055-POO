
package br.ufpr.ex17guievents;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ExEvents3 extends JFrame implements ActionListener {

    JButton jbt1 = new JButton("Botão 1");
    JButton jbt2 = new JButton("Botão 2");
    JButton jbt3 = new JButton("Botão 3");
    JButton jbt4 = new JButton("Botão 4");
    JPanel jpn1 = new JPanel();
    Font fonte = new Font("Courier New", Font.ITALIC, 12);
    
    
    public ExEvents3(){
       
        setTitle("Exemplo Eventos 3");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        //Por padrão JFrame instancia um BorderLayout
        
        //Para dimensionar os componentes em um layout, usa-se o Dimension
        jbt1.setPreferredSize(new Dimension(100, 100));
        
        //Altera a fonte do componente
        jbt1.setFont(fonte);
        jbt1.setForeground(Color.red);
        
        //jbt2.setBounds(0, 0, 100, 100); setBounds não funcionárá se o layout não foi null (setLayout(null))
        add(BorderLayout.SOUTH,jbt3);
        add(BorderLayout.NORTH,jbt2);
        
        jpn1.setLayout(null);
        
        //jpn1.setPreferredSize(new Dimension(100, 300)); Não funcionará pois está em um Layout no JFrame
        jpn1.setBackground(Color.yellow);
        jbt1.setBounds(50, 50, 100, 100);//Funciona pois o painel não possui layout (setLayout(null))
        jpn1.add(jbt1);
        
        int width = 100, height = 200;
        //Posiciona botão no centro da tela considerando o tamanho do JFrame: width (largura)/2-width do botão/2, height (altura)/2-height do botão/2, width do botão,height do botão
        jbt4.setBounds( 800/2-width/2, 
                        600/2-height/2,
                        width, height);
        jpn1.add(jbt4);
        
        add(BorderLayout.CENTER,jpn1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //todo
    }
  

    
}
