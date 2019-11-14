/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.ex17guievents;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author anderson
 */
public class Ex17GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new ExEvents1();
        //new ExEvents2();
        //new ExEvents3();
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Impossível Carregar Look and Feel");
        }
        
        new ExEvents4();
        
        //new ExEventsSala();//New e nome da classe
        

    }

}
