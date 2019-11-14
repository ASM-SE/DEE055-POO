
package br.ufpr.ex11abstractclass;


public class Gato extends Animal{ //Herança - normal de classe abstrata para classe contreta

    /*
    Enquanto uma classe concreta não obriga a classe filha a sobrescrever seu método
    classes abstratas que possuem métodos abstratos obrigarão a sobrescrita do mesmo.
    */
    @Override
    public void emitirSom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
