package PilaresPOO.Veiculos;


// HERANÇA: Moto herda de Veikulo
public class Moto extends Veikulo {




    // POLIMORFISMO: Implementação específica do metodo ligar()
    @Override
    public void ligar() {
        System.out.println("MOTO LIGADA");
    }
}
