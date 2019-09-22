
package br.ufpr.ex6static2.departamentos;

public class Departamento {

    //No departamento podemos ter vários colaboradores
    private String colaborador;
    /*
    E um único diretor - no caso, para restringir isso definimos o mesmo como static, pois é um atributo que pertence a classe (no caso, departamento)
    Posteriormente, este atributo será utilizado globalmente
    */
    private static String diretor;

    public String getColaborador() {
        return colaborador;
    }

    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }
        
    public static String getDiretor() {
        return diretor;
    }

    public static void setDiretor(String aDiretor) {
        diretor = aDiretor;
    }

    public static void marcarReuniao(){ //Só pode acessar atributos do tipo static
        System.out.println("Reunião marcada por: " +diretor); //É possível pois é static
        //System.out.println(colaborador); Não é permitido, pois é um atributo de instância - não pertence a classe
    }

    
}
