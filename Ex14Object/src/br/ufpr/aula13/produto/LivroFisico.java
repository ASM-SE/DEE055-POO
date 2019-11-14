
package br.ufpr.aula13.produto;


public class LivroFisico extends Livro implements Promocional {
    
    public LivroFisico(Autor autor){
        super(autor);
    }

    @Override //Sobrescrito - polimorfismo... Aqui eu coloco algo no corpo do método... Tenho que colocar!! Obrigatoriamente!
    public boolean aplicaDescontoDe(double porcentagem) {
        return false;
    }

}
