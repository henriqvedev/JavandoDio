package edu.EstruturasDeRepeticao;
// Declara que a classe pertence ao pacote 'edu.EstruturasDeRepeticao'.

import java.util.Random;
// Importa a classe Random para gerar números aleatórios.

public class ExDoWhile {
    public static void main(String[] args) {
        // metodo principal onde o programa começa.

        System.out.println("Discando...");
        // Mensagem inicial indicando que o telefone está "discando".

        do {
            System.out.println("Telefone tocando...");
            //Enquanto a condição no metodo 'tocando()' for verdadeira, exibe esta mensagem.
        } while (tocando());
        // O bloco 'do' é executado pelo menos uma vez.
        // O metodo 'tocando()' define se o programa continua tocando ou para.

        System.out.println("Alô!!!");
        // Quando 'tocando()' retornar false, o programa segue para esta linha.
    }

    private static boolean tocando() {
        // Metodo auxiliar que retorna 'true' ou 'false' com base em um número aleatório.

        boolean atendeu = new Random().nextInt(3) == 1;
        // Gera um número aleatório entre 0 e 2.
        // Se o número for igual a 1, 'atendeu' será true.

        System.out.println("Atendeu? " + atendeu);
        // Exibe se a ligação foi atendida ou não.

        return !atendeu;
        // Se 'atendeu' for true, retorna false (a ligação parou de tocar).
        // Se 'atendeu' for false, retorna true (o telefone continua tocando).
    }
}

