
package br.ufpr.ex11abstractclass;


public abstract class Animal {
    private String location;
    private String food;
    
    //É possível utilizar os mesmos modificadores de acesso (public ou private) e tipos de retorne em métodos abstratos
    public abstract void emitirSom();

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

}
