
package br.ufpr.ex16gui;

import javax.swing.JOptionPane;


public class ExJOptionPane {
    
    public void chamaJOptionPaneNomeSobrenome(){
        
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String sobreNome = JOptionPane.showInputDialog("Digite o sobrenome: ");

        String nomeCompleto = nome + " " + sobreNome;

        JOptionPane.showMessageDialog(null, "Nome Completo: " + nomeCompleto, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void chamaJOptionPaneCalculaMedia(){
        float nota1, nota2, calculaMedia;
         
        nota1 = Float.parseFloat(JOptionPane.showInputDialog ("Digite a primeira nota"));
        nota2 = Float.parseFloat (JOptionPane.showInputDialog("Digite a segunda nota"));
        calculaMedia = (nota1 + nota2) / 2;
         
        JOptionPane.showMessageDialog(null, "Resultado da Média = "+ calculaMedia,"Resultado", JOptionPane.WARNING_MESSAGE);
    }


}
