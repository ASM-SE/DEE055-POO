
package br.ufpr.ex15collections;

import java.util.Iterator;
import java.util.LinkedList;

/*
Este tipo de lista implementa uma “double linked list”, ou seja, uma lista duplamente “linkada”. 
A sua principal diferença entre o ArrayList é na performance entre os métodos add, remove, get e set.

Este tipo de lista possui melhor performance nos métodos add e remove, do que os métodos add e remove do ArrayList, 
em compensação seus métodos get e set possuem uma performance pior do que os do ArrayList. 
*/

public class ExLinkedList {
    
    public static void main(String args[]) {
 
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(3);
        ll.add(2);      
        ll.add(1);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(6);
 
        Iterator iter2 = ll.iterator();
        while(iter2.hasNext()){
            System.out.println(iter2.next());
        }
        System.out.println(ll.get(3));
    }
}
