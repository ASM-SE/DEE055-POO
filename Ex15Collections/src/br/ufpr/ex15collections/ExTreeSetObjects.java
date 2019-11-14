
package br.ufpr.ex15collections;

import java.util.Iterator;
import java.util.TreeSet;

/*
Implementar a interface Comparable, que obrigatoriamente nos fara implementar o método “compareTo”. 
É por meio deste método que diremos como o TreeSet deve ordenar nosso Objeto em questão.
*/

public class ExTreeSetObjects {
    public static void main(String[] args) {
        TreeSet<Cat> dset = new TreeSet<>();
        dset.add(new Cat(2));
        dset.add(new Cat(1));
        dset.add(new Cat(3));
  
        Iterator<Cat> iterator = dset.iterator();
  
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}


class Cat implements Comparable<Cat>{
    int size;
  
    public Cat(int s) {
        size = s;
    }
  
    @Override
    public String toString() {
        return size + "";
    }
  
    @Override
    public int compareTo(Cat o) {
            return size - o.size;
    }
}

/*
    É importante salientar uma questão muito importante, nenhuma das implementações da interface Set são thread-safe, ou seja, 
    se você está usando múltiplas threads para acessar o mesmo Set você deve sincronizar esses acessos externamente, pois como dissemos, 
    o Set não o fará. Esse é um ponto fraco para aplicações que trabalham com frequência com múltiplas threads, 
    pois você teria que ficar sincronizando os acessos ao seu Set para garantir a consistência dos dados, porém levando em 
    consideração a rapidez do HashSet ou mesmo a unicidade de elementos do 
    Set como um todo, você deve ponderar se vale a pena deixar de usar o Set por falta de sincronismo nativo.    
*/    