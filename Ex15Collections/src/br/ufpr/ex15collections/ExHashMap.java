
package br.ufpr.ex15collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
HashMap não faz absolutamente nenhuma garantia sobre a ordem de iteração. 
Ele pode (e vai) até mudar completamente quando novos elementos são adicionados.
*/

public class ExHashMap {
  
    public static void main(String[] args) {
   
    Map<Integer, String> mapaNomes = new HashMap<>(); 
    mapaNomes.put(1, "João Delfino");
    mapaNomes.put(2, "Maria do Carmo");
    mapaNomes.put(3, "Claudinei Silva");
 
    System.out.println(mapaNomes);
     
    //resgatando o nome da posição 2
    System.out.println(mapaNomes.get(2));
     
    Set<Entry<Integer, String>> set = mapaNomes.entrySet();
    Iterator it = set.iterator();
     
    System.out.println("Código\t\tValor");
     
    //getKey() - recupera a chave do mapa 
    //getValue() - recupera o valor do mapa
 
    while(it.hasNext()){
      Entry<Integer, String> entry = (Entry)it.next();
      System.out.println(entry.getKey() + "\t\t"+entry.getValue());
    }    
    
    
  }
}
