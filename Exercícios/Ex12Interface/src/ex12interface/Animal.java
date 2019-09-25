
package ex12interface;


public interface Animal {
    String planeta = "Terra"; //Se torna um atributo global - Mas, qual seria o propsóito de um atributo (neste caso campo), se não irá instanciar um objeto?
    
    //Os métodos não podem ser privados quando declarados em interfaces (o que faz todo o sentido)
    public void fazerBarulo();

    
}
