
package br.ufpr.ex15collections;

import java.util.Iterator;
import java.util.Vector;

/*
Primeiramente vamos falar sobre o fato de Vector ser sincronizado e o ArrayList não. Significa dizer que se você 
possui uma aplicação que precisa ser thread-safe em determinado ponto, use Vector e você estará garantido.

Leia mais sobre thread-safe em: https://www.devmedia.com.br/thread-safe-java-entendendo-o-conceito-e-usando-em-sua-aplicacao/28858

Outro ponto importante é a alocação dinâmica do Vector, que é diferente do ArrayList. Lembra que falamos 
que o ArrayList aumenta 50% do seu tamanho quando a lista está cheia ? O Vector aumenta o dobro, ou seja, se você tem uma lista de 10 elementos cheia, essa lista aumentará para 20, com 10 posições vazias. Mas isso não é ruim ? Depende do que você precisar, se você está precisando aumentar a quantidade de elementos com muita frequência, então o ideal é usar o Vector que aumenta o dobro e você ficará com muito mais espaço do que no 
ArrayList que precisará ficar aumentando com mais frequência, diminuindo assim a performance da sua aplicação.

*/

public class ExVector {
    
    public static void main(String args[]) {                 
         
        Vector al = new Vector();
        al.add(3);
        al.add(2);              
        al.add(1);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(6);
 
        Iterator iter1 = al.iterator();
        while(iter1.hasNext()){
                System.out.println(iter1.next());
        }
         
        System.out.println(al.get(2));
         
    }
}
