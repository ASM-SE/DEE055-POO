
package aula08comencapsulamento;


public class LivroEncapsulado {
    private String nomeLivro;
    private String isbn;
    private float valor;
    private AutorEncapsulado autor;

    
    public LivroEncapsulado(AutorEncapsulado autor){
        this.isbn = "00000000000";
        this.autor = autor; //Recebe por parâmetro o autor... Deste modo não precisamos mais do método setAutor e getAutor
    }
    
    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    /*
    public AutorEncapsulado getAutor() {
        return autor;
    }

    public void setAutor(AutorEncapsulado autor) {
        this.autor = autor;
    }
    */
    
    public void mostrarInformacoes(){
        //Aqui não precisa utilizar os getters e setters, visto que estamos trabalhado com tais atributos na sua classe de origem
        System.out.println("Nome do livro: "+this.nomeLivro);
        System.out.println("ISBN: "+this.isbn);
        System.out.println("Valor: "+String.format("R$ %.2f", this.valor));
        
        if(this.autor != null){ 
            this.autor.mostrarInformacoes();
        }else{
            //Do modo como tratamos a criação do livro com a passagem do autor, somente se atribuíssemos null no objeto que teríamos esse problema
            System.out.println("Autor nulo!");
        }
        //Pula uma linha "\n" após a impressão
        System.out.println("\n");
        
    }
    
}
