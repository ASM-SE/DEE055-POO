
package br.ufpr.exercicioaula1402.collection;

import static br.ufpr.exercicioaula1402.main.ExercicioAula1402.cadastraPessoa;
import br.ufpr.exercicioaula1402.pessoa.Pessoa;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class ColecaoSet implements IColecaoSet {

    @Override
    public Set<Pessoa> ordenaString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<Pessoa> ordenaInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<Pessoa> ordenaChar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<Pessoa> cadastrarPessoa(Set<Pessoa> pessoas, int total, Scanner s) {
        for(int i=0; i < total; i++){
            pessoas.add(cadastraPessoa(s));
        }

        
        Iterator<Pessoa> iterator = pessoas.iterator();
  
        while (iterator.hasNext()) {
            System.out.print("Pessoa: " +iterator.next().getNome()+ "\n");
        }
        return pessoas;
    }

}
