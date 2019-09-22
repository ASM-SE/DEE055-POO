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
public class Livros {
    public String nome;
    public String descricao;
    public double valor;
    public String isbn; //Classificação de livros - código - todo livro tem

    Autor autor = new Autor();
    
    public void mostrarInformacoes(){
        System.out.println("Nome livro: " + this.nome); //sempre usar this.
        System.out.println("Descrição do livro: " + this.descricao); //sempre usar this.
        System.out.println("Valor: " + String.format("%.2f",this.valor)); 
        System.out.println("ISBN: " + this.isbn); //sempre usar this.
       
        autor.mostrarInformacoes();
    };  
    
}
