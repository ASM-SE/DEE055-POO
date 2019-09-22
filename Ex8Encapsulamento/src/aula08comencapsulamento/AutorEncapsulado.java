
package aula08comencapsulamento;


public class AutorEncapsulado {
    private String nomeAutor;
    private String cpfAutor;

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getCpfAutor() {
        return cpfAutor;
    }

    public void setCpfAutor(String cpfAutor) {
        this.cpfAutor = cpfAutor;
    }
    
    public void mostrarInformacoes(){
        System.out.println("Autor(a): " +this.nomeAutor);
        System.out.println("CPF: " +this.cpfAutor);
    }
}
