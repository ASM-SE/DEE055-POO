/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08semencapsulamento;

/**
 *
 * @author anderson
 */
class Autor {
    public String nomeAutor;
    public String emailAutor;
    public String cpfAutor;
    
    public void mostrarInformacoes(){
        System.out.println("Nome do Autor: " + this.nomeAutor);
        System.out.println("E-mail Autor: " + this.emailAutor);
        System.out.println("CPF Autor: " + this.cpfAutor + "\n");
        
    }; 
         
}
