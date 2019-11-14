
package br.ufpr.ex15collections;

import java.util.SortedMap;
import java.util.TreeMap;


/*
TreeMap irá iterar de acordo com a "ordenação natural" das chaves de acordo com o método compareTo() 
(ou um Comparator fornecido externamente). 
Além disso, ele implementa a interface SortedMap , que contém métodos que dependem dessa ordem de classificação.
*/

public class ExTreeMap {

    public static void main(String[] args){
        SortedMap sm = new TreeMap();
        sm.put("map", "TreeMap");
        sm.put("schildt", "Java2");
        sm.put("mathew", "Hyden");
        sm.put("schildt", "Java2s");
        System.out.println(sm.keySet()); 
        System.out.println(sm.values());
    }
}
