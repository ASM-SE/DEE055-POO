
package ex12interface;


public interface Animal {
    String planeta = "Terra"; //Se torna um atributo global
    
    //Os métodos não podem ser privados quando declarados em interfaces (o que faz todo o sentido)
    public void fazerBarulo();

    
}
