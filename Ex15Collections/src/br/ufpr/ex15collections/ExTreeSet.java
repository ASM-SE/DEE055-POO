
package br.ufpr.ex15collections;

import java.util.Iterator;
import java.util.TreeSet;

/*
Por implementar SortedSet o TreeSet oferece mais alguns métodos como: first(), last(), headSet(), tailSet() e etc.

*/

public class ExTreeSet {
    
    public static void main(String[] args){
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(12);
        tree.add(63);
        tree.add(34);
        tree.add(45);

        Iterator<Integer> iterator = tree.iterator();
        System.out.print("Dados na Tree set: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
    
/*
Temos ainda uma característica a discutir sobre o TreeSet. Veja que funciona normalmente para valores primitivos, como é o caso dos inteiros. 
Mas se tivéssemos trabalhando com Objetos, como ele saberia como ordenar esses objetos ? Por qual propriedade ele iria ordenar ?    
*/

}
