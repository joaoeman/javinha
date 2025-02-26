//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        carro meucarro = new carro("Siena");
        meucarro.acelerar();
    }
}

class carro{
    String modelo;
    public carro(String modelo){//acionado sempre que um carro é criado
        this.modelo = modelo;// this refere ao proprio atributo da classe
    }

    public void acelerar(){
        System.out.println("acelerando "+this.modelo);
    }
}