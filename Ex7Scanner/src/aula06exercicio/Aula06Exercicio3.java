/*
Altere o programa para que o mesmo possua uma superclasse que concentre os operandos e o
método da operação matemática. Crie quatro classes filhas, as extenda para a superclasse
criada e altere o programa na classe testadora (método main()), para que o comportamento seja
igual ao programa anterior. Caso necessário, inclua outras classes e métodos para tornar o
programa mais dinâmico!
Observação: Para completar o exercício 2 falta colocar em uma estrutura de repetição, para que o usuário continue efetuando novos cálculos até indicarq eu não deseja.
*/
package aula06exercicio;

import java.util.Scanner;
import outropacote.Divisao;
import outropacote.Multiplicacao;
import outropacote.Soma;
import outropacote.Subtracao;

public class Aula06Exercicio3 {
    
    public static void main(String[] args) {
     double n1, n2;
     char operando;
     
     Scanner s = new Scanner(System.in);
     System.out.println("Entre com o primeiro número: ");
     n1 = s.nextDouble(); 
     System.out.println("Entre com o segundo número:");
     n2 = s.nextDouble();
     System.out.println("Entre com o sinal da operação (+,-,/ ou *):");
     operando = s.next().charAt(0);
   
        
     if(operando == '+'){
         
         Soma soma = new Soma();
         soma.Calcular(n1, n2);
         
     } else if(operando == '-'){
         
         Subtracao subtracao = new Subtracao();
         subtracao.Calcular(n1, n2);
         
     } else if(operando == '/'){
       
         Divisao divisao = new Divisao();
         divisao.Calcular(n1, n2);
         
     } else if(operando == '*'){
         
         Multiplicacao multiplicacao = new Multiplicacao();
         multiplicacao.Calcular(n1, n2);
         
     } else {
         System.out.println("Operando inválido!");
     }
     
    }    
        
}

