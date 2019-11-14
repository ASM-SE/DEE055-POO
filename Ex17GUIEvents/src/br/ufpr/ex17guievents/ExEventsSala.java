
package br.ufpr.ex17guievents;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ExEventsSala extends JFrame implements ActionListener{

    JButton jbt1 = new JButton("Diga Olá!");
    JButton jbt2 = new JButton("Diga Adeus!");
    JButton jbt3 = new JButton("Input");
    JTextField jtext1 = new JTextField(10);
    String input = "";
        
    public ExEventsSala(){
        
        setLayout(new FlowLayout());
        setSize(250, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        jbt1.addActionListener(this);
        jbt2.addActionListener(this);
        jbt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Olá! " + jtext1.getText());
            }
        });
        jtext1.addActionListener(this);
        
        
        add(jbt1);
        add(jbt2);
        
        add(jbt3);
        add(jtext1);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == jbt2){
            System.exit(0);            
        }
        if(ae.getSource() == jbt1){
            JOptionPane.showMessageDialog(null, "Vixi!");
        }
        if(ae.getSource() == jtext1){
            input = jtext1.getText();
        }

        

    }
    
}
