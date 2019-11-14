
package br.ufpr.exercicioaula1402.collection;

import static br.ufpr.exercicioaula1402.main.ExercicioAula1402.cadastraPessoa;
import br.ufpr.exercicioaula1402.pessoa.Pessoa;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class ColecaoMap implements IColecaoMap{

    @Override
    public Map<Integer, Pessoa> ordenaString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<Integer, Pessoa> ordenaInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<Integer, Pessoa> ordenaChar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<Integer, Pessoa> cadastrarPessoa(Map<Integer, Pessoa> pessoas, int total, Scanner s) {
        for(int i = 0; i < total; i++){
            pessoas.put(i, cadastraPessoa(s));
        }
        Set<Entry<Integer, Pessoa>> set = pessoas.entrySet();
        Iterator it = set.iterator();

        System.out.println("Código\t\tNome");
        while(it.hasNext()){
          Entry<Integer, Pessoa> entry = (Entry)it.next();
          System.out.println(entry.getKey() + "\t\t"+entry.getValue().getNome());
        }
        return pessoas;
    }
    

}
