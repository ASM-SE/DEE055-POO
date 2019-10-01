package t002scanner;

import java.util.Scanner;

public class Livro {

    private String nome;
    private String Descricao;
    private int Paginas;

    public void incluirLivro(Scanner s) {
        System.out.println("Entre com o nome:");
        this.setNome(s.nextLine());
        System.out.println("Nome:" + this.getNome());
    }
    
    public void incluirDescricao(Scanner s){
        System.out.println("Entre com a descricao:");
        this.setDescricao(s.nextLine());
        System.out.println("Descricao:" + this.getDescricao());        
    }
    
    public void incluirPaginas(Scanner s){
        System.out.println("Entre com a quantidade de páginas:");
        this.setPaginas(s.nextInt());
        s.nextLine();
        System.out.println("Paginas:" + this.getPaginas());        
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

}
