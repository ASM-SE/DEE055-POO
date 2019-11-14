
package br.ufpr.ex15collections;

import java.util.Hashtable;

/*
Trabalha com algoritmo hash para conversão das chaves e um mecanismo de pesquisa de valores, sendo que 
tem seus métodos sincronizados (thread-safe) que permitem checar acessos concorrentes e armazenagem. 
Também possui uma eficiente pesquisa de elementos baseados em chave-valor, mas não aceita valores nulos.
*/


public class ExHashTable {

  public static void main(String[] args) {
     
    Cliente c1 = new Cliente("754.856.869-88","Valdinei Santos");
    Cliente c2 = new Cliente("828.929.222.12","Claire Moura");
    Cliente c3 = new Cliente("156.565.556-88","Vagner Seller");
     
    Hashtable<Integer, Cliente> ht = new Hashtable<>();
    ht.put(1, c1);
    ht.put(2, c2);
    ht.put(3, c3);
     
    System.out.println("CPF \t\t Cliente");
    for (int i = 1; i <= ht.size(); i++) {
      System.out.println(ht.get(i));
    }
  }
}
 
class Cliente{
  public String cpf;
  public String nome;
   
  public Cliente(String cpf, String nome) {
    this.cpf = cpf;
    this.nome = nome; 
  }
   
  @Override
  public String toString() {
    return cpf + " | " + nome;
  }
}