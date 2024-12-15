package edu.SintaxeJava.Metodos;

public class SmartTv {
    boolean ligada = false; // Estado inicial: desligada
    int canal = 1; // Canal inicial: 1
    int volume = 25; // Volume inicial: 25

    // Método para ligar a TV
    public void ligar() {
        ligada = true;
    }

    // Método para desligar a TV
    public void desligar() {
        ligada = false;
    }

    // Método para aumentar o volume
    public void aumentarVolume() {
        if (ligada) { // Só aumenta o volume se a TV estiver ligada
            volume++;
        } else {
            System.out.println("A TV está desligada. Não é possível aumentar o volume.");
        }
    }

    // Método para diminuir o volume
    public void diminuirVolume() {
        if (ligada && volume > 0) { // Só diminui o volume se a TV estiver ligada e o volume for maior que 0
            volume--;
        } else if (!ligada) {
            System.out.println("A TV está desligada. Não é possível diminuir o volume.");
        } else {
            System.out.println("O volume já está no mínimo.");
        }
    }

    // Método para mudar o canal
    public void mudarCanal(int novoCanal) {
        if (ligada) { // Só muda o canal se a TV estiver ligada
            canal = novoCanal;
        } else {
            System.out.println("A TV está desligada. Não é possível mudar de canal.");
        }
    }
}
