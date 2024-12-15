package edu.SintaxeJava.Operadores;

public class Operando { // Nome descritivo para a classe.
    public static void main(String[] args) {

        // Declaração e inicialização de variáveis booleanas
        boolean condicao1 = true; // Primeira condição definida como verdadeira.
        boolean condicao2 = true; // Segunda condição definida como verdadeira.

        // Uso do operador lógico AND (&&).
        // O bloco será executado apenas se ambas as condições forem verdadeiras.
        if (condicao1 && (7 > 4)) {
            System.out.println("as duas condicoes sao verdadeiras");
        }

        // Uso do operador lógico OR (||).
        // O bloco será executado se pelo menos uma das condições for verdadeira.
        if (condicao1 || condicao2) {
            System.out.println("uma das condicoes e verdadeira");
        }

        // Exibe a mensagem "Fim" após a execução das condições.
        System.out.println("Fim");

        //Mais exemplos:

        boolean estaLogado = true;
        boolean temPermissao = true;

        if (estaLogado && temPermissao) {
            System.out.println("Acesso concedido.");
        } else {
            System.out.println("Acesso negado.");
        }


        boolean membroFidelidade = false;
        boolean promocaoAtiva = true;

        if (membroFidelidade || promocaoAtiva) {
            System.out.println("Você ganhou um desconto!");
        } else {
            System.out.println("Sem descontos disponíveis.");
        }




    }
}
