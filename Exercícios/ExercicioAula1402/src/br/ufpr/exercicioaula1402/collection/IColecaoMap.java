/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.exercicioaula1402.collection;

import br.ufpr.exercicioaula1402.pessoa.Pessoa;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author anderson
 */
public interface IColecaoMap {
    
    public Map<Integer, Pessoa> ordenaString();
    public Map<Integer, Pessoa> ordenaInt();
    public Map<Integer, Pessoa> ordenaChar();
    public Map<Integer, Pessoa> cadastrarPessoa(Map<Integer, Pessoa> pessoas, int total, Scanner s);
    
}
