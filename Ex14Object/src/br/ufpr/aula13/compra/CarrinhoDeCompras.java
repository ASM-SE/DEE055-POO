
package br.ufpr.aula13.compra;

import br.ufpr.aula13.produto.LivroFisico;
import br.ufpr.aula13.produto.Revista;


public class CarrinhoDeCompras {

    private double total;
    
    public void adiciona(LivroFisico livrofisico) {
        System.out.println("Adicionando: " + livrofisico);
        livrofisico.aplicaDescontoDe(0.05);
        total += livrofisico.getValor();
    }
    
    public void adiciona(Revista revista) {
        System.out.println("Adicionando: " + revista);
        revista.aplicaDescontoDe(0.05);
        total += revista.getValor();
    }
    
    public double getTotal(){
        return total;
    }
    
}
