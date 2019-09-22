
package br.ufpr.exercicio01super.publicacao;


public class Publicacao {
    String nome;
    String ano;
    String editora;
    
    public Publicacao(String nome, String ano, String editora){
        this.nome = nome;
        this.ano = ano;
        this.editora = editora;
    }
    
    public void listaPublicacao(){
        System.out.println("Nome: " +this.nome+ " Ano: " +this.ano+ " Editora: " +this.editora);
    }
}
