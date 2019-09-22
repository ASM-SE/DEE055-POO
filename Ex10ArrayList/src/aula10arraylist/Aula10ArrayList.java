
package aula10arraylist;

import java.util.ArrayList;


public class Aula10ArrayList {

    public static void main(String[] args) {
        //Cria uma arrayList de Livros
        ArrayList<Livro> livros = new ArrayList<>();

        Livro livro1 = new Livro();
        livro1.setNome("Livro 1");
        livro1.setValor(10.4f);
        livro1.setIsbn("000000000000");

        livros.add(livro1); //Adiciona livro1 no arrayList (posição 0) - todo arrayList inicia-se na posição 0, tal como array unidimensional

        Livro livro2 = new Livro();
        livro2.setNome("Livro 2");
        livro2.setIsbn("0000000000000");
        livro2.setValor(2.43f);

        livros.add(livro2); //Adiciona livro2 no arrayList (posição 1)

        for (Livro lvrs : livros) { //Comando equivalente ao foreach para impressão dos nomes dos livros
            System.out.println(lvrs.getNome());
        }

        System.out.println("Total de livros no ArrayList: " + livros.size()); //Lista o total de elementos no arrayList
        
        System.out.println("Imprime único objeto do array: " +livros.get(0).getNome());

        livro1.setNome("Livro Nova Ed 1");
        livro1.setValor(10.4f);
        livro1.setIsbn("000000000000");

        livros.set(0, livro1); //Substitui o livro1 antigo pelos dados do novo

        livros.forEach(o -> System.out.println("Livro (foreach):" + o.getNome())); //Foreach com função lambda
        System.out.println("\n");
        
        if(livros.get(0).equals(livros.get(1))){ //Como arrayList só suporta objetos, podemos comparar os mesmos com [objeto1].equals([objeto2])
            System.out.println("Os livros são iguais!");
        }else{
            System.out.println("Os livros são diferentes!");
        }
        

        System.out.println("Index do livro 2 antes da remoção do livro na posição 0: " +livros.indexOf(livro2)); // indexOf("parametro") permite buscar a referência do registro no arrayList
        
        livros.remove(0); //Remove o livro1 alocado na posição 0 - após remoção o livro2 que estava na posiçao 1 passa para a posição zero como pode ser visto na impressão após remoção
        for (int i = 0; i < livros.size(); i++) {
            Livro lvri = livros.get(i);
            System.out.println(lvri.getNome());
        }
        System.out.println(livros.get(0).nome);        
        System.out.println("Index do livro 2 após remoção do livro 1 da posição 0: " +livros.indexOf(livro2));
        
        
        
        /* Remove livro2 se existente
        if (livros.indexOf(livro2) >= 0) {
            livros.remove(livro2);
            System.out.println("Livro removido com sucesso! \n");
        } else {
            System.out.println("Livro inexistente! \n");
        }

        if (livros.indexOf(livro2) > 0) {
            livros.remove(livro2);
            System.out.println("Livro removido com sucesso! \n");
        } else {
            System.out.println("Livro inexistente! \n");
        }
        */


        livros.clear(); //Limpa o arrayList removendo todos os seus registros

        System.out.println("Total de livros no ArrayList: " + livros.size());

    }

    static class Livro {

        private String nome; //Ainda que seja private, como trata-se de uma classe static para a classe Aula10ArrayList, seus atributos estarão visiveis na mesma
        private float valor;
        private String isbn;

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public float getValor() {
            return valor;
        }

        public void setValor(float valor) {
            this.valor = valor;
        }

    }

}
