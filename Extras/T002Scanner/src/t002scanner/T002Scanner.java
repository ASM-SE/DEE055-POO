/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t002scanner;

import java.util.Scanner;

/**
 *
 * @author anderson
 */
public class T002Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        Scanner s = new Scanner(System.in);
        Livro livro = new Livro();
        System.out.println("Entre com um número inteiro:");
        i = s.nextInt();
        s.nextLine();
        
        livro.incluirLivro(s);
        livro.incluirPaginas(s);
        livro.incluirDescricao(s);
        
        s.close();
        
    }
    
}
