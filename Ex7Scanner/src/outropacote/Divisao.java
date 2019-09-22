/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outropacote;

/**
 *
 * @author anderson
 */
public class Divisao extends Operacao {

    @Override
    public void Calcular(double a, double b) {
        try{
            resultado=a/b;
            if(Double.isFinite(resultado)) throw new ArithmeticException();
            System.out.println("O resultado da divisão é: " + String.format("%.2f", resultado));
        } 
        catch(ArithmeticException e){
            System.out.println("Erro de divisão por zero!");
        }
        catch(Throwable e){
            System.err.println("Ocorreu erro inesperado!");
        }
    }
    
    
    
}
