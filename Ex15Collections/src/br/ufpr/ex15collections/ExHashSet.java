
package br.ufpr.ex15collections;

import java.util.HashSet;
import java.util.Iterator;

/*
O HashSet é o mais rápido de todos, este usa HashTable e seus elementos não são ordenados.

Ou seja, a garantia de continuidade na ordem dos elementos inseridos é zero, ou seja, 
esse tipo de estrutura é indicada se você precisa apenas garantir a 
alta performance sem se importar com a ordem com que os elementos estão ordenados.
*/
public class ExHashSet {

    public static void main(String[] args){
        HashSet<Dog> dset = new HashSet<>();
        dset.add(new Dog(2));
        dset.add(new Dog(1));
        dset.add(new Dog(3));
        dset.add(new Dog(5));
        dset.add(new Dog(4));
        Iterator<Dog> iterator = dset.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        
    }
    
}


class Dog {
    int size;
  
    public Dog(int s) {
        size = s;
    }
  
    @Override
    public String toString() {
        return size + "";
    }
}