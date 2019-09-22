
package ex6static;

import br.ufpr.ex6static2.departamentos.Departamento;

public class Ex6Static2 {
    public static void main(String[] args){
        //Para acessar métodos e atributos static não instancia-se um objeto - basta usar nome da classe.[metodo] declarados como static 
        //Você ainda pode encapsular um atributo static e utilizar os getters e setters
        Departamento.setDiretor("Tsunade"); 
   
        //Para acessar o método para inclusão de novos colaboradores, é necessário a instanciação:
        Departamento dpto1 = new Departamento();
        dpto1.setColaborador("Kakashi");
        
        Departamento dpto2 = new Departamento();
        dpto2.setColaborador("Sai");
        //Logo, ambos os colaboradores terão o mesmo diretor, pois o mesmo é uma referência global        
        System.out.println(dpto1.getDiretor());
        System.out.println(dpto2.getDiretor());
        
        //O ideal, aqui, seria chamar classe.[metodostatic] ou em alguns contextos classe.[atributostatic]
        
        Departamento.marcarReuniao();
        
    }
}
