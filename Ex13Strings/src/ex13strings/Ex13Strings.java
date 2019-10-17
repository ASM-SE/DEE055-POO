package ex13strings;

public class Ex13Strings {


    public static void main(String[] args) {
        
        String java1 = "java";
        String java2 = "java";
        System.out.println(java1.equals(java2));      
        
        String java3 = "java";
        String java4 = "java";
        System.out.println(java3 == java4);
        
        /*
         Por otimização, o Java cria um String pool, um tipo de cache de Strings.
         Sempre antes de adicionar em memória, a JVM consulta esse pool para verificar
         se não há uma String igual que possa ser reutilizada.
        */
        
        
        /*
         Tente substituir o valor de uma String com seu método replace. 
         O primeiro argumento será o valor atual e
         o segundo o valor que deverá tomar o seu lugar.
        */
        
        java1.replace("v", "c");
        System.out.println(java1);
        
        /*
         O valor da variável java continuou o mesmo, já que toda
         String é imutável. Para obter o resultado esperado, podemos resgatar o retorno 
         do método replace, que será uma nova String .
        */
        
        String replace = java1.replace("v", "c");
        String upperCase = java1.toUpperCase();
        String lowerCase = "JAVA".toLowerCase();
        char charAt = java1.charAt(0);
        boolean endsWith = java1.endsWith("a");
        boolean startsWith = java1.startsWith("s");
        boolean equals = java1.equalsIgnoreCase("JAVA");
        
        //Implemente as saídas para verificar os resultados!
    }
        
}

