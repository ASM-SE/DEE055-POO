
package br.ufpr.exercicioaula1402.collection;

import static br.ufpr.exercicioaula1402.main.ExercicioAula1402.cadastraPessoa;
import br.ufpr.exercicioaula1402.pessoa.Pessoa;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class ColecaoList implements IColecaoList {
    
    static Comparator<Pessoa> comparaIdade() {
        return new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa pessoa, Pessoa outraPessoa) {
                return pessoa.getIdade() - outraPessoa.getIdade();
            }
        };
    }
    
    static Comparator<Pessoa> comparaNome() {
        return new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa pessoa, Pessoa outraPessoa) {
                return pessoa.getNome().compareTo(outraPessoa.getNome());
            }
        };
    }    
    
    static Comparator<Pessoa> comparaSexo() {
        return new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa pessoa, Pessoa outraPessoa) {
                return pessoa.getSexo() - outraPessoa.getSexo();
            }
        };
    }     

    @Override
    public List<Pessoa> ordenaString(List<Pessoa> pessoas, int tipo) {
        comparaNome();
        return pessoas;
    }

    @Override
    public List<Pessoa> ordenaInt(List<Pessoa> pessoas, int tipo) {
        comparaIdade();  
        return pessoas;
    }

    @Override
    public List<Pessoa> ordenaChar(List<Pessoa> pessoas, int tipo) {
        comparaSexo();
        return pessoas;
    }

    @Override
    public List<Pessoa> cadastrarPessoa(List<Pessoa> pessoas,int total, Scanner s) {
        for (int i = 0; i < total; i++) {
            pessoas.add(cadastraPessoa(s));
        }
        for(Pessoa p : pessoas){
            System.out.println("Pessoa: " +p.getNome());
        }
        return pessoas;
    }

    @Override
    public List<Pessoa> selecionaOrdenacao(List<Pessoa> pessoas, int tipo, Scanner s) {
        switch(tipo){
            case 1: //Incluir pessoa
                this.cadastrarPessoa(pessoas, 1, s);
                return pessoas;
            case 2://Ordena por idade
                Collections.sort(this.ordenaInt(pessoas, tipo));
                this.imprimeLista(pessoas);
            break;
            case 3:
                Collections.reverse(this.ordenaInt(pessoas, tipo));
                this.imprimeLista(pessoas);
            break;
            case 4: //Ordena por nome
                Collections.sort(this.ordenaString(pessoas, tipo));
                this.imprimeLista(pessoas);
            break;
            case 5:
                Collections.reverse(this.ordenaString(pessoas, tipo));
                this.imprimeLista(pessoas);
            break;
            case 6: //Ordena por sexo
                Collections.sort(this.ordenaChar(pessoas, tipo));
                this.imprimeLista(pessoas);
            break;
            case 7: 
                Collections.reverse(this.ordenaChar(pessoas, tipo));
                this.imprimeLista(pessoas);                
            break;
            case 8:
            return pessoas;
        }
        return pessoas;
    }

    @Override
    public void imprimeLista(List<Pessoa> pessoas) {
        for (Pessoa p : pessoas) {
            System.out.println("Nome: " + p.getNome() + " Idade: " + p.getIdade() + " Sexo: " +p.getSexo());
        }

    }

}
