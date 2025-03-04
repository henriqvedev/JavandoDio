package PilaresPOO.Veiculos;

public class Autodromo {
    public static void main(String[] args){
        Carro jeep = new Carro();
        jeep.setChassi("897897"); // ENCAPSULAMENTO: Usa `setChassi()` em vez de acessar diretamente
        jeep.ligar(); // POLIMORFISMO: Chama a versão de ligar() do Carro

        Moto bros150 = new Moto();
        bros150.setChassi("467754");
        bros150.ligar(); // POLIMORFISMO: Chama a versão de ligar() da Moto

        Veikulo coringa = jeep; // POLIMORFISMO: Um objeto Carro pode ser tratado como Veikulo
        coringa.ligar(); // POLIMORFISMO: Chama ligar() do Carro, pois é um Carro em tempo de execução
    }
}
