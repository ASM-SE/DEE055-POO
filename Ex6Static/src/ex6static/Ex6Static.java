package ex6static;

//Se declarado com public aqui, Java indica a criação de um novo arquivo .class
class Livro {
    double valor;
    
    public void aplicarReajuste(double valor){
        this.valor += this.valor * valor;
    }
    
}

public class Ex6Static {

    static void teste(){
        System.err.println("Olá!");
    }

    public static void main(String[] args) {

        //Aqui livro precisa ser instanciado, pois não é uma classe pertencente à Ex6Static
        Livro livro = new Livro();
        livro.valor = 10;
        livro.aplicarReajuste(0.05);
        System.out.println(livro.valor);
        /*
        Static (modificador de acesso glocal) indica que os métodos ou classes declarados com tal palavra 
        pertencem a classe e não necessitam de um objeto instanciado para ser chamado.
        */
        teste();
    }
    
}
