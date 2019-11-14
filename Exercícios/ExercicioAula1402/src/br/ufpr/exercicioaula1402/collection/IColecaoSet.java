/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.exercicioaula1402.collection;

import br.ufpr.exercicioaula1402.pessoa.Pessoa;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author anderson
 */
public interface IColecaoSet {
    
    public Set<Pessoa> ordenaString();
    public Set<Pessoa> ordenaInt();
    public Set<Pessoa> ordenaChar();
    public Set<Pessoa> cadastrarPessoa(Set<Pessoa> pessoas, int total, Scanner s);
}
