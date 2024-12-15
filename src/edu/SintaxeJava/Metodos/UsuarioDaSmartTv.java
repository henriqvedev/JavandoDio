package edu.SintaxeJava.Metodos;

public class UsuarioDaSmartTv {
    public static void main(String[] args) { //Adicionado 'static' para permitir execução.
        // Criação de um objeto da classe SmartTv
        SmartTv smartTv = new SmartTv();

        // Exibição do estado inicial da TV
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        // Ligando a TV
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        // Alterando o volume da TV
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume(); // Diminui o volume quatro vezes
        System.out.println("Volume Atual: " + smartTv.volume);

        // Mudando de canal
        int novoCanal = 10; // Variável adicionada para representar o novo canal
        smartTv.mudarCanal(novoCanal);
        System.out.println("Canal Atual: " + smartTv.canal);

        // Exibindo o status final da TV
        System.out.println("TV Ligada? " + smartTv.ligada);
    }
}
