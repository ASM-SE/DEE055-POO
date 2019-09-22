package ex4inputoutput;

import java.util.Scanner;

public class Ex4InputOutput {

    public static void main(String[] args) {
        //Permite a leitura de caracteres no terminal
        Scanner s = new Scanner(System.in);
        String nome, sexo, controle;
        int idade = 0; 
        
        for(int i = 1; i != 0;){
            System.out.println("Digite o nome: ");
            nome = s.next();
            
            System.out.println("Digite o sexo: ");
            sexo = s.next();
            
            System.out.println("Digite a idade: ");
            idade = s.nextInt();
            
            System.out.println("Cadastrar mais uma pessoa? (sim/não)");
            controle = s.next();
            if(controle.equals("sim")){
                i = 1;
            }else{
                i = 0;
                s.close(); //"Feche" o Scanner somente ao final de seu uso. Caso contrário, terá que instanciar um novo objeto de tal classe
            }
        }
    }
}
