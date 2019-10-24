/*
Comparable vs Comparator
The following two lists summarize the differences between the two interfaces.

Java Comparable
    must define o1.compareTo(o2)
    used to implement natural ordering of objects
    we must modify the class whose instances we want to sort
    it's in the same class
    only one implementation
    implemented frequently in the API by: String, Wrapper classes, Date, Calendar

Java Comparator
    must define compare(o1, o2)
    multiple ways of comparing two instances of a type - e.g. compare people by age, name
    we can provide comparators for classes that we do not control
    we can have multiple implementations of comparators
    meant to be implemented to sort instances of third-party classes

Fonte: http://zetcode.com/java/comparablecomparator/
 */
package exercicioaula1401;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author anderson
 */
public class ExercicioAula1401 {

    /**
     * @param args the command line arguments
     */
    static Comparator<Pessoa> comparaIdade() {
        return new Comparator<Pessoa>() {

            @Override
            public int compare(Pessoa pessoa, Pessoa outraPessoa) {
               // return pessoa.getIdade() - outraPessoa.getIdade();
                return Integer.compare(pessoa.getIdade(), outraPessoa.getIdade());
            }

        };
    }
    
    static Comparator<Pessoa> comparaNome() {
        return new Comparator<Pessoa>() {

            @Override
            public int compare(Pessoa pessoa, Pessoa outraPessoa) {
                return pessoa.getNome().charAt(0) - outraPessoa.getNome().charAt(0);
            }

        };
    }
    
    public static void main(String[] args) {
        //Cria array list pessoa
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        char sin;
        
        //Identifica como o filtro deve ser realizado
        System.out.println("Deseja filtrar por nome (1) ou idade (2)?");
        sin = s.next().charAt(0);      
        
        //Instancia e povoa a primeira pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Carlos");
        pessoa1.setIdade(32);
        
        //Instancia e povoa a segunda pessoa
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Izabel");
        pessoa2.setIdade(21);
        
        //Instancia e povoa a terceira pessoa
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Ademir");
        pessoa3.setIdade(34);        
        
        //Adiciona objetos no ArrayList
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        
        //Compara utilizando Comparator - necessario utilizar para permitir a criaçao de dois metodos de comparaçao
        if(sin == '1'){
            Collections.sort(pessoas, comparaNome());
        }else if(sin == '2'){
            Collections.sort(pessoas, comparaIdade());
        }
        
        //Imprime as pessoas considerando a ordem do sort
        System.out.println("Saida do comparator: ");
        for(Pessoa p : pessoas){
            System.out.println("Nome: " +p.getNome()+ " Idade: " + p.getIdade());
        }
        
        //Compara utilizando Comparable - somente ordenara de acordo com a implementaçao do metodo na clase de origem - somente uma implementaçao
        //O que nao permitira variar entre atributos de ordenaçao diferentes.
        System.out.println("\nSaida do comparable (Filtro atual por idade): ");
        Collections.sort(pessoas);
        for(Pessoa p : pessoas){
            System.out.println("Nome: " +p.getNome()+ " Idade: " + p.getIdade());
        }
        
    }

}

class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private int idade;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.idade - outraPessoa.getIdade();
        //return this.nome.charAt(0) - outraPessoa.getNome().charAt(0);
    }
    

       
    

}


