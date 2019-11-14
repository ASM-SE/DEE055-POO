/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.exercicioaula1402.main;

import br.ufpr.exercicioaula1402.collection.ColecaoList;
import br.ufpr.exercicioaula1402.collection.ColecaoSet;
import br.ufpr.exercicioaula1402.collection.ColecaoMap;
import br.ufpr.exercicioaula1402.pessoa.Pessoa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

/**
 *
 * @author anderson
 */
public class ExercicioAula1402 {

    /**
     * @param args the command line arguments
     */
    public static int montaMenu() {
        Scanner s = new Scanner(System.in);
        int sin = 0;
        
        System.out.println("List");
        System.out.println("1 - ArrayList");
        System.out.println("2 - LinkedList");
        System.out.println("3 - Vector");

        System.out.println("\nSet");
        System.out.println("4 - HashSet");
        System.out.println("5 - LinkedHashSet");
        System.out.println("6 - TreeSet");

        System.out.println("\nMap");
        System.out.println("7 - HashMap");
        System.out.println("8 - HashTable");
        System.out.println("9 - TreeMap");
        System.out.println("0 - Sair");

        System.out.println("\nEntre com a opçao:");
        sin = s.nextInt();
        s.nextLine();
        int submenu = 0;
        switch (sin) {
            case 1:

                //ArrayList
                ColecaoList al = new ColecaoList();
                List<Pessoa> alpessoas = new ArrayList<>();
                al.cadastrarPessoa(alpessoas, questionaQuantidade(s), s);
                submenu = montaSubMenu(s);
                while(submenu != 8){
                    al.selecionaOrdenacao(alpessoas, submenu, s);
                    submenu = montaSubMenu(s);
                }

                return submenu;

            case 2:

                //LinkedList
                ColecaoList ll = new ColecaoList();
                List<Pessoa> llpessoas = new LinkedList<>();
                llpessoas = ll.cadastrarPessoa(llpessoas, questionaQuantidade(s), s);
                submenu = montaSubMenu(s);
                while(submenu != 8){
                    ll.selecionaOrdenacao(llpessoas, submenu, s);
                    submenu = montaSubMenu(s);
                }

                return submenu;

            case 3:

                //Vector
                ColecaoList vc = new ColecaoList();
                List<Pessoa> vpessoas = new Vector();
                vc.cadastrarPessoa(vpessoas, questionaQuantidade(s), s);

                break;

            case 4:

                //HashSet
                ColecaoSet hs = new ColecaoSet();
                Set<Pessoa> hspessoas = new HashSet<>();
                hs.cadastrarPessoa(hspessoas, questionaQuantidade(s), s);

                break;

            case 5:

                //LinkedHashSet
                ColecaoSet lh = new ColecaoSet();
                Set<Pessoa> lhpessoas = new LinkedHashSet<>();
                lh.cadastrarPessoa(lhpessoas, questionaQuantidade(s), s);

                break;

            case 6:

                //TreeSet
                ColecaoSet ts = new ColecaoSet();
                Set<Pessoa> tspessoas = new TreeSet<>();
                ts.cadastrarPessoa(tspessoas, questionaQuantidade(s), s);

                break;

            case 7:

                //HashMap
                ColecaoMap hm = new ColecaoMap();
                Map<Integer, Pessoa> hmpessoas = new HashMap<>();
                hm.cadastrarPessoa(hmpessoas, questionaQuantidade(s), s);

                break;

            case 8:

                //HashTable
                ColecaoMap ht = new ColecaoMap();
                Map<Integer, Pessoa> htpessoas = new Hashtable<>();
                ht.cadastrarPessoa(htpessoas, questionaQuantidade(s), s);
                
                break;

            case 9:

                //TreeMap
                ColecaoMap tm = new ColecaoMap();
                Map<Integer, Pessoa> tmpessoas = new TreeMap<>();
                tm.cadastrarPessoa(tmpessoas, questionaQuantidade(s), s);
                break;

            case 0:
                return submenu;
        }

        s.close();
        return submenu;
    }

    public static Pessoa cadastraPessoa(Scanner s) {

        String nome;
        char sexo;
        int idade;

        System.out.println("Entre com o nome: ");
        nome = s.nextLine();
        System.out.println("Entre com a idade: ");
        idade = s.nextInt();
        s.nextLine();
        System.out.println("Entre com o sexo (M/F): ");
        sexo = s.nextLine().charAt(0);

        return new Pessoa(nome, idade, sexo);
    }

    public static int questionaQuantidade(Scanner s) {
        int total = 0;
        System.out.println("Quantas pessoas deseja cadastrar?");
        total = s.nextInt();
        s.nextLine();

        return total;
    }
    
    public static int montaSubMenu(Scanner s){
        int ordem = 0;
        while(ordem == 0){
            System.out.println("Escolha uma opçao: ");
            //if(List){} else if(Set){} else if(Map){}
            System.out.println("1 - Incluir nova Pessoa.");
            System.out.println("2 - Ordenar por Idade (Crescente).");
            System.out.println("3 - Ordenar por Idade (Decrescente).");
            System.out.println("4 - Ordenar por Nome (Crescente).");
            System.out.println("5 - Ordenar por Nome (Decrescente).");
            System.out.println("6 - Ordenar por Sexo (Crescente).");
            System.out.println("7 - Ordenar por Sexo (Decrescente).");        
            System.out.println("8 - Voltar ao menu principal.");
            ordem = s.nextInt();
            s.nextLine();
        }
        return ordem;
    }

    public static void main(String[] args) {
        int menu = montaMenu();
        while(menu != 0){
            menu = montaMenu();
        }
        
    }

}
