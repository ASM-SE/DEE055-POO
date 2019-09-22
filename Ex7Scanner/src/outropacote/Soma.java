
package outropacote;

public class Soma extends Operacao {

    @Override
    public void Calcular(double a, double b) {
        resultado = a+b;
        System.out.println("O resultado da soma foi:" + String.format("%.2f", resultado));
    }
    
}
