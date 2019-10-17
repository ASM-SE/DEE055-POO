
package br.ufpr.aula13.produto;


public class LivroFisico extends Livro implements Promocional {
    
    public LivroFisico(Autor autor){
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        return false;
    }

}
