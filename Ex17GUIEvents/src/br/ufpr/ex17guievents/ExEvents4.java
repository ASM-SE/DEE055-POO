
package br.ufpr.ex17guievents;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class ExEvents4 extends JFrame implements ActionListener{

    JButton jbt1 = new JButton("Limpar");
    JButton jbt2 = new JButton("Calcular");
    
    JTextField jtx1 = new JTextField(30);
    JTextField jtx2 = new JTextField(30);
    JTextArea jtxa1 =new JTextArea();
    
    JLabel jlb1 = new JLabel("Peso");
    JLabel jlb2 = new JLabel("Altura");
    JLabel jlb3 = new JLabel("Resultado");
    
    JPanel jpn1 = new JPanel();
    
    String altura = "";
    String peso = "";
    
    public ExEvents4(){

        
        jpn1.setLayout(null);
        
        jlb1.setBounds(20, 10, 150, 30);
        jtx1.setBounds(100, 10, 280, 30);
        jtx1.addActionListener(this);
        
        jlb2.setBounds(20, 50, 150, 30);
        jtx2.setBounds(100, 50, 280, 30);
        jtx2.addActionListener(this);
        
        jbt1.setBounds(20, 90, 175, 30);
        jbt1.addActionListener(this);
        jbt2.setBounds(205, 90, 175, 30);
        jbt2.addActionListener(this);
                
        jlb3.setBounds(20, 130, 100, 30);
        
        jtxa1.setBounds(20, 170, 360, 230);
                
        jpn1.add(jbt1);
        jpn1.add(jbt2);
        jpn1.add(jtx1);
        jpn1.add(jtx2);
        jpn1.add(jtxa1);
        jpn1.add(jlb1);
        jpn1.add(jlb2);
        jpn1.add(jlb3);
        
        add(jpn1);
        setTitle("Cálculo do IMC");
        setSize(400, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jbt1){
            
            //Limpa os campos
            JTextField temp = null;
            JTextArea tempa = null;
                for (Component c : jpn1.getComponents()) {
                    if (c.getClass().toString().contains("javax.swing.JTextField")) {
                        temp = (JTextField) c;
                        temp.setText("");
                    }else if(c.getClass().toString().contains("javax.swing.JTextArea")){
                        tempa = (JTextArea) c;
                        tempa.setText("");
                    }
                }
                
        }
        if(e.getSource() == jbt2){
            String t = calculaIMC(Double.parseDouble(jtx1.getText()),Double.parseDouble(jtx2.getText()));
            jtxa1.setText(t);   
        }
        if(e.getSource() == jtx1){
            altura = jtx1.getText();
        }
        if(e.getSource() == jtx2){
            peso = jtx2.getText();
        }
    }
    
    
    public String calculaIMC(double peso, double altura){
        System.out.println(peso);
        double imc = peso / (altura*altura);
        String resultado = "";
        if (imc <= 18.5) {
           resultado = "Abaixo do peso normal.";
        }
        if (18.5 < imc && imc <= 25) {
           resultado = "Peso normal!";
        }
        if (25 < imc && imc <= 30){
           resultado = "Acima do peso normal!";
        }
        if (imc > 30) {
           resultado = "Obesidade!";
        }
        Math.pow(2,3);

        return new DecimalFormat("#.##").format(imc) + " " +resultado;

    }

}
