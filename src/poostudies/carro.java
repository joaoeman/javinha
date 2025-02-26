package poostudies;
//public
//default
//private
//protected

public class carro{
    String modelo;

    public static void main(String[] args){
        System.out.println("teste");
    }

    public carro(String modelo){//acionado sempre que um carro é criado
        this.modelo = modelo;// this refere ao proprio atributo da classe
    }


    protected String acelerar(){
        System.out.println("opaaaaa "+ this.modelo);
        this.acelerar();
        return "opaaaaa";//o metodo acelerar só pode ser usado onde foi declarado
    }
}

class rodas{
    public rodas(){
        carro Carro = new carro("golf");
        Carro.acelerar();
    }


}