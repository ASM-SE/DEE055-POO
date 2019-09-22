
//Sem utilização de encapsulamento em Autor e Livros
package aula08semencapsulamento;

/**
 *
 * @author anderson
 */
public class Aula08Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livros livro1 = new Livros();
        Livros livro2 = new Livros();
        
        livro1.nome = "Livro 1";
        livro1.descricao = "Bla bla bla!";
        livro1.isbn = "82374923874923749238";
        livro1.valor = 2.34;
        livro1.autor.nomeAutor = "Cristiano";
        livro1.autor.emailAutor = "asdkfasdfj@gmail.com";
        livro1.autor.cpfAutor = "934923482394823";
        
        livro2.nome = "Livro 2";
        livro2.descricao = "Bla bla bla!";
        livro2.isbn = "82374923874923749238";
        livro2.valor = 3.40;
        livro2.autor.nomeAutor = "Anderson";
        livro2.autor.emailAutor = "asdkfasdfj@gmail.com";
        livro2.autor.cpfAutor = "934923482394823";     
        
        livro1.mostrarInformacoes();
        livro2.mostrarInformacoes();
    } 
    
}
