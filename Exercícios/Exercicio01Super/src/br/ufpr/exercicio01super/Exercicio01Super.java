
package br.ufpr.exercicio01super;

import br.ufpr.exercicio01super.publicacao.EBook;


public class Exercicio01Super {

    public static void main(String[] args) {
        
        //Na instanciação do método abaixo, exige-se a passagem de parâmetros para o método construtor de EBook que por sua vez herda tal necessidade de sua classe pai Publicacao
        EBook ebook = new EBook("Harry Potter e a Criança Amaldiçoada", "2016", "Rocco");
        
        ebook.listaPublicacao();
    }
    
    
}
