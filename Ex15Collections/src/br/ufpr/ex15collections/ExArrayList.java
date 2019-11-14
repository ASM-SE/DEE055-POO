package br.ufpr.ex15collections;

import java.util.ArrayList;
import java.util.Iterator;

/*
Este tipo de lista é implementado como um Array que é dimensionado dinamicamente, ou seja, sempre que é necessário o seu tamanho 
aumenta em 50% do tamanho da lista, significa que se você tiver uma lista de tamanho igual a 10 e ela “encher”, 
seu tamanho aumentará para 15 automaticamente.

Além disso a ArrayList permite que elementos sejam acessados diretamente pelos métodos get() e set(), e 
adicionados através de add() e remove().

ArrayList não remove os elementos duplicados, e ainda podemos acessar qualquer elemento diretamente através do seu index.

Fonte: https://www.devmedia.com.br/diferenca-entre-arraylist-vector-e-linkedlist-em-java/29162
*/


public class ExArrayList {

    public static void main(String args[]) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(2);
        al.add(1);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(6);

        Iterator iter1 = al.iterator();
        while (iter1.hasNext()) {
            System.out.println(iter1.next());
        }

        System.out.println(al.get(2));

    }
}
