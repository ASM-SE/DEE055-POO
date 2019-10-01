/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t003searchingarraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author anderson
 */
public class T003SearchingArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Livro lvr1 = new Livro();
        lvr1.setNome("Livro 1");
        lvr1.setDescricao("Descricao 1");
        lvr1.setPaginas(32);
        
        //System.out.println("Nome: " +lvr1.getNome() + "\nDescricao: " +lvr1.getDescricao());
        
        Livro lvr2 = new Livro();
        lvr2.setNome("Livro 2");
        lvr2.setDescricao("Descricao 2");
        lvr2.setPaginas(12);        
        
        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(lvr1);
        livros.add(lvr2);
        
        for(Livro l : livros){
            System.out.println(l.getNome());
            System.out.println("Indice: " +livros.indexOf(l));
        }
        
        livros.forEach(l-> System.out.println("Indice: " +livros.indexOf(l)));
        
        
        Livro lvr3 = new Livro();
        lvr3 = buscaLivro("Livro 2", livros);
        System.out.println("Dados do livro retornado buscaLivro: " + lvr3.getNome());
        
        Livro lvr4 = new Livro();
        lvr4 = buscaLivro("Livro 1", livros);
        System.out.println("Dados do livro retornado buscaLivro2: " + lvr4.getNome());        
        
        Livro lvr5 = new Livro();
        lvr5 = buscaLivro("Livro 2", livros);
        System.out.println("Dados do livro retornado buscaLivro3: " + lvr5.getNome());            
    }
    
    public static Livro buscaLivro(String nomeLivro, ArrayList<Livro> arrayLivros){
        for (Livro livro : arrayLivros) {
            if (livro.getNome().equals(nomeLivro)) {
                return livro;
            }
        }
        return null;
    }
    
    
    public static Livro buscaLivro2(String nomeLivro, ArrayList<Livro> arrayLivros){
        Iterator<Livro> iterator = arrayLivros.iterator();
        while (iterator.hasNext()) {
            Livro livro = iterator.next();
            if (livro.getNome().equals(nomeLivro)) {
                return livro;
            }
        }
        return null;
    }    

    
    public static Livro buscaLivro3(String nomeLivro, ArrayList<Livro> arrayLivros){
        Livro livroret = arrayLivros.stream()
                .filter(livro -> nomeLivro.equals(livro.getNome()))
                .findAny()
                .orElse(null);
        if(livroret == null){
            return livroret;
        }
        return null;
    }      
    
}
