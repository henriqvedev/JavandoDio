package edu.EstruturasDeRepeticao;
// Define o pacote onde a classe está localizada.

import java.util.concurrent.ThreadLocalRandom;
// Importa a classe ThreadLocalRandom, usada para gerar números aleatórios com eficiência.

public class While {
    // Declara a classe While.

    public static void main(String[] args) {
        //metodo principal que será executado ao rodar o programa.

        double mesada = 50.0;
        // Inicializa a variável mesada com R$50,00.

        while (mesada > 0) {
            // Enquanto houver dinheiro na mesada, o loop continuará.

            double valorDoce = valorAleatorio();
            //Chama o metodo valorAleatorio() para gerar um valor aleatório entre 2 e 8 reais.

            if (valorDoce > mesada)
                valorDoce = mesada;
            // Se o valor do doce for maior que o dinheiro restante, ajusta o valorDoce para ser igual ao que resta.

            System.out.println("Doce do valor: " + valorDoce + " adicionando no carrinho");
            // Exibe o valor do doce que foi "comprado".

            mesada = mesada - valorDoce;
            // Subtrai o valor do doce da mesada.
        }

        System.out.println("Mesada: " + mesada);
        // Mostra o valor final da mesada (será zero ou próximo de zero).

        System.out.println("Joaozinho gastou toda a sua mesada em doces");
        //Exibe a mensagem informandotodo o dinheiro foi gasto.
    }

    //Metodo privado que gera um valor aleatório para o preço do doce.
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
        // Retorna um número aleatório entre 2 (inclusivo) e 8 (exclusivo).
    }

}
// Fecha a classe.
