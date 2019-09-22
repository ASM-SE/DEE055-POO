
package ex5basicexception;


public class Ex5BasicException {

     
    public void main(String[] args){
     int a = 2;
     int b = 1;
     int c = 0;
     int[] arr = new int[4];
     //Exemplos de exceção
        try {
            c = a/b;
            System.err.println("Array: +" +arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Erro de divisão por zero:" + e);
        } catch (Throwable e){ //Identifica erros sem especificar precisamente qual...
            System.err.println("Ocorreu um erro: " + e);
        } finally { //Imprime algo após a identificação do erro ou execução do bloco try
            System.out.println("Vou imprimir!");
        }
    }
    
}
