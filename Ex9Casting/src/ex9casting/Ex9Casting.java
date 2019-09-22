package ex9casting;

public class Ex9Casting {

    public static void main(String[] args) {
        
        //Auto casting (widening)
        byte a = 10;
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;
        
        System.out.println("Valor de f é" +d);
        
        //Casting (narrowing)
        double ca = 12.34;
        /*
          O casting deve indicar o tipo de dado entre parênteses no qual você quer converter o valor a ser 
          atribuído no caso ca que é double deve sofrer casting para o tipo float
        */
        float cb = (float) ca; 
        long cc = (long) cb;
        int cd = (int) cc;
        short ce = (short) cd;
        byte cf = (byte) ce;
        
        System.out.println("Valor de cf é " +cf); //Valor perderá precisão devido o casting
        
        
    }
    
}
