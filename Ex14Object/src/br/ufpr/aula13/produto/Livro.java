
package br.ufpr.aula13.produto;


public abstract class Livro implements Produto {
    private String nome;
    private double valor;
    private Autor autor;

    
    public Livro(Autor autor){
        this.autor = autor;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
