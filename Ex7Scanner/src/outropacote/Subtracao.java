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
public class Subtracao extends Operacao {

    @Override
    public void Calcular(double a, double b) {
        resultado = a-b;
        System.out.println("O valor da subtração foi: " + String.format("%.2f",resultado));
    }
    
    
    
}
