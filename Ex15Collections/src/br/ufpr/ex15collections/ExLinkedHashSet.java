
package br.ufpr.ex15collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
LinkedHashSet que é um meio termo entre HashSet e TreeSet, ou seja, ela nos proporciona um pouco 
da performance do HashSet e um pouco do poder de ordenação do TreeSet. O LinkedHashSet faz uso 
também do HashTable com linked list, ou seja, temos aqui a seguinte situação: 
Os elementos continuam na ordem que são inseridos, diferente do HashSet que “embaralha” tudo. 
*/
public class ExLinkedHashSet {

    public static void main(String[] args){
        LinkedHashSet<Dog> dset = new LinkedHashSet<>();
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
