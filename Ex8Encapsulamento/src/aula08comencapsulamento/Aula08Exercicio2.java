package aula08comencapsulamento;

public class Aula08Exercicio2 {

    public static void main(String[] args) {

        AutorEncapsulado autor1 = new AutorEncapsulado();
        autor1.setNomeAutor("Stephen King");
        autor1.setCpfAutor("000.000.000-00");

        AutorEncapsulado autor2 = new AutorEncapsulado();
        autor2.setNomeAutor("J.K. Rowling");
        autor1.setCpfAutor("000.000.111-11");

        //Instacia livro já indicando o autor (vide método construtor na classde LivroEncapsulado
        LivroEncapsulado livro1 = new LivroEncapsulado(autor1);
        livro1.setNomeLivro("It");
        livro1.setIsbn("1234567891");
        livro1.setValor(45.90f);

        LivroEncapsulado livro2 = new LivroEncapsulado(null);
        livro1.setNomeLivro("Morte Súbita");
        livro1.setIsbn("1234567894");
        livro1.setValor(1.99f);

        livro1.mostrarInformacoes();
        livro2.mostrarInformacoes();
    }

}
