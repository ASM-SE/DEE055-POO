
package ex3primitivedatatypes;

/*
Importação das classes utilizadas neste exemplo
Note que as importações são provenientes do pacote java.[subpacote].[Classe].
Classes do pacote default de Java: java.lang são acessiveis sem a necessidade de importanção (ocorre implicitamente).
*/

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;


public class Ex3PrimitiveDataTypes {


    public static void main(String[] args) throws ParseException {
        double saldo =  100.43;
        double saque =  50.0;
        float fsaldo = 100.3f;  //O f diferencia uma variável do tipo double de uma variável do tipo float.
        float fsaque = 50.93F;  //Você pode utilizar F ou f.
        char x;
        boolean bln = true;
        int n1 = 0;
        int n = 5;
        String st0 = "Usando aspas: \"Valor entre aspas\"."; //Para imprir aspas, utilizar \"
        String st1 = "Texto teste!";
        String st2 = new String(); //Não foi necessário fazer o import da classe, pois faz parte das classes do pacote java.lang
        /* 
        Ao declarar um inteiro do tipo long e este tiver a precisão que não ultrapasse o tamanho de um int não precisamos utilizar a letra L,
        caso contrário, esta deve ser indicada (tal como o f ao declararmos um float).
        */
        long var2 = 3590;
        long var3 = 15000000000L;
        /*
        Na declaração de um char devemos utilizar aspas simples. Deve-se lembrar que letras maiúsculas e minúsculas são diferentes, quando comparadas.
        */        
        char c1 = 'a';
        char c2 = 'A';
        if(c1!=c2){
            System.out.println("A variável c1: "+c1+ " não é igual a variável c2: "+c2);
        }
        
        System.out.println("Exemplo com aspas: " + st0);
        System.out.println(saldo-saque);
        
        System.out.println(String.format("%.2f", saldo-saque));
        
        Locale ptBR = new Locale("pt", "BR");//Cria uma variável para permitir aplicar formatação regional
        
        NumberFormat moedaFormat = NumberFormat.getCurrencyInstance(ptBR);  
        System.out.println(moedaFormat.format(saldo-saque));
        
        NumberFormat numberFormat = NumberFormat.getNumberInstance(ptBR); 
        System.out.println(numberFormat.format(saldo-saque));
         
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, ptBR);
        System.out.println(dateFormat.format(new Date()));
        
        DateFormat timeFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM, ptBR);
        System.out.println(timeFormat.format(new Date()));
        
        System.out.println(dateFormat.parse("Quarta-feira, 02 de Setembro de 2019"));
        System.out.println(timeFormat.parse("19:20:00"));
        System.out.println(numberFormat.parse("1,99"));
        System.out.println(moedaFormat.parse("R$ 1,99"));
       
        
        if(bln){
            System.out.println("Impressão no bloco if pois bln é " +bln);
        }else{
            System.out.println("Impressão no bloco else pois bln é " +bln);
        }
        //Ou ternário:
        System.out.println(bln ? "Impressão no bloco if pois bln é " +bln : "Impressão no bloco else pois bln é" +bln);
        
        while(n1<5){
            System.out.println("Estou dentro do bloco while e o valor de n1 é: " +n1);
            n1++;
        }
        
        for(int i=0; i<=n; i++){
            System.out.println("Impressão a estrutura de repetição for. Valor de i é " +i+ " e valor de n é " +n);
        }
        
        System.out.println("Esse texto é uma variável String e seu valor é: " +st1);
        
        
    }
  
}
