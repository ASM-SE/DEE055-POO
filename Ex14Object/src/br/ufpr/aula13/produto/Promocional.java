/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.aula13.produto;

/**
 *
 * @author anderson
 */
@FunctionalInterface
public interface Promocional {
    
    public boolean aplicaDescontoDe(double porcentagem); //Pode ou não ter abstract
    
    default boolean aplicaDescontoDe10Porcento()
    {
        return aplicaDescontoDe(0.1);
    }    
}
