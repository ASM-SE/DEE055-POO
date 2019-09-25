
package ex12interface;


public class Gato extends Felino implements Animal, Mamifero{

    //Por implementar uma interface é obrigado a implementar os métodos existentes
    @Override
    public void fazerBarulho() {
        System.out.println("Fazendo barulho!");
    }
    
    public void showMessage(){
        //Planeta só é visível porque esta classe implementou a interface animal
        System.out.println(planeta);
    }
    
    @Override
    public void miar(){
        System.out.println("Quero miar diferente: Miau!");
    }

    //É possível uma classe implementar diversas interfaces e extender apenas uma (mas pode-se utilizar herança múltipla).
    @Override
    public void mamar() {
        System.out.println("Sou mamífero e posso mamar!");
    }

}
