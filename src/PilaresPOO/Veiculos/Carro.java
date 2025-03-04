package PilaresPOO.Veiculos;

public class Carro extends Veikulo { // HERANÇA: Carro herda de Veikulo

    public void ligar() { // POLIMORFISMO: Metodo ligar() tem uma implementação diferente de Moto
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }

    private void confereCombustivel(){ // ENCAPSULAMENTO: Metodo privado, usado apenas dentro da classe
        System.out.println("CONFERINDO COMBUSTIVEL");
    }

    private void confereCambio(){ // ENCAPSULAMENTO: Metodo privado, protege a lógica interna
        System.out.println("CONFERINDO SE O CAMBIO ESTA EM P");
    }
}
