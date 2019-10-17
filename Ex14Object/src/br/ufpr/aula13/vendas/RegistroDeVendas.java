
package br.ufpr.aula13.vendas;

import br.ufpr.aula13.compra.CarrinhoDeCompras;
import br.ufpr.aula13.produto.Autor;
import br.ufpr.aula13.produto.LivroFisico;
import br.ufpr.aula13.produto.Revista;


public class RegistroDeVendas {
    
    public static void main(String[] args){
        
        Autor autor = new Autor();
        autor.setNome("George R. Martin");
        
        LivroFisico livrofisico = new LivroFisico(autor);
        livrofisico.setNome("Guerra dos Tronos");
        livrofisico.setValor(59.10);
        
        Revista revista = new Revista();
        revista.setNome("Rostos");
        revista.setValor(10.99);
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.adiciona(livrofisico);
        carrinho.adiciona(revista);
        
        System.out.println("Total R$ " + String.format("%.2f",carrinho.getTotal()));
        
    }
}
