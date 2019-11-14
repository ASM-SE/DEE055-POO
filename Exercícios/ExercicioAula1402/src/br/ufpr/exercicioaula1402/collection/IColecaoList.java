/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.exercicioaula1402.collection;

import br.ufpr.exercicioaula1402.pessoa.Pessoa;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author anderson
 */
public interface IColecaoList {
    
    public List<Pessoa> ordenaString(List<Pessoa> pessoas);
    public List<Pessoa> ordenaInt(List<Pessoa> pessoas);
    public List<Pessoa> ordenaChar(List<Pessoa> pessoas);
    public List<Pessoa> cadastrarPessoa(List<Pessoa> pessoas,int total, Scanner s); 
    public List<Pessoa> selecionaOrdenacao(List<Pessoa> pessoas, int tipo, Scanner s);
    public void imprimeLista(List<Pessoa> pessoas);
}
