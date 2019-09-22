
package ex2abc;

import java.text.NumberFormat;

class A {
    int ivar=7;
    void m1(){
        System.out.print("A's m1, ");
    }
    void m2(){
        System.out.print("A's m2, ");
    }
    void m3(){
        System.out.print("A's m3, ");
    }  
}

class B extends A {
    @Override //Este método foi sobrescrito em relação ao método da classe A (Polimorfismo).
    void m1(){
        System.out.print("B's m1, ");
    }
}

class C extends B {
    /*
    Este método também foi sobrescrito em relação ao método da classe A (Polimorfismo) 
    que por sua vez foi passado por herança para a classe B, extendida por C (Herança).
    */
    @Override
    void m3(){
        System.out.print("C's m3, " +(ivar+6));
    }
}
public class Ex2ABC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
        B b = new B();
        C c = new C();
        //Declaracao de constantes
        final double CONST_1 = 0;
        /*Saída: B's m1, A's m2, A's m3,
        b.m1();
        c.m2();
        a.m3();
        */
        
        
        /*Saída: B's m1, A's m2, C's m3, 13
        c.m1();
        c.m2();
        c.m3();
        */
        
        /*Saída: A's m1, A's m2, C's m3, 13
        a.m1();
        b.m2();
        c.m3();
        */
        
        /*Saída: B's m1, A's m2, C's m3, 13
        a2.m1();
        a2.m2();
        a2.m3();
        */
    }
    
}
