
/*
Faça um programa que leia dois números e a operação matemática a ser feita (soma,
subtração, divisão e multiplicação). Após as três entradas o programa deverá efetuar o cálculo
selecionado e exibir o resultado ao usuário.
Observação: Para completar o exercício 2 falta colocar em uma estrutura de repetição, para que o usuário continue efetuando novos cálculos até indicarq eu não deseja.
*/
package aula06exercicio;

import java.util.Scanner;

public class Aula06Exercicio {

    public static void main(String[] args) {
     double n1, n2, resultado = 0;
     char operando;
     
     Scanner s = new Scanner(System.in);
     System.out.println("Entre com o primeiro número: ");
     n1 = s.nextDouble(); 
     System.out.println("Entre com o segundo número:");
     n2 = s.nextDouble();
     System.out.println("Entre com o sinal da operação (+,-,/ ou *):");
     operando = s.next().charAt(0);
     
     
     if(operando == '+'){
         
         resultado = n1 + n2;
         System.out.println("O resultado da soma é: " + String.format("%.2f",resultado));
         
     } else if(operando == '-'){
         
         resultado = n1 - n2;
         System.out.println("O resultado da subtração é: " + String.format("%.2f",resultado));
         
     } else if(operando == '/'){
         //Tratamento de execções com try...catch
         try {
             resultado = n1 / n2;
             if(Double.isInfinite(resultado)) throw new ArithmeticException();
             System.out.println("O resultado da divisão é: " + String.format("%.2f",resultado));
         } catch (ArithmeticException e) {
             System.out.println("Não é possível realizar divisão por zero! Tipo de exceção:" +e);
         }  
         
     } else if(operando == '*'){
         
         resultado = n1*n2;
         System.out.println("O resultado da multiplicação é: "+ resultado);
         
     }
     
    s.close();
    
     
    }
    
}
