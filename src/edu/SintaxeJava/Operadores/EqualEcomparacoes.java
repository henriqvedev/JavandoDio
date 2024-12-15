package edu.SintaxeJava.Operadores; // Organiza o código no pacote 'SintaxeJava.Operadores'.

public class EqualEcomparacoes { // Nome descritivo para a classe.
    public static void main(String[] args) {

        // Declaração de duas Strings
        String nomeUm = "Henrique"; // Inicializa uma string de forma literal.
        String nomeDois = new String("Henrique"); // Inicializa uma string usando o construtor (menos comum).

        // Compara o conteúdo das Strings usando equals(), que verifica o valor e não a referência.
        System.out.println(nomeUm.equals(nomeDois)); // Saída: true (os conteúdos são iguais).

        // Declaração de dois números inteiros
        int numero1 = 1;
        int numero2 = 2;

        // Verifica se os números são iguais e armazena o resultado na variável boolean 'simNao'.
        boolean simNao = numero1 == numero2;

        // Estrutura condicional: executa o bloco apenas se a condição for verdadeira.
        if (numero1 == numero2) {
            System.out.println("a nossa condição é verdadeira"); // Não será executado porque numero1 != numero2.
        }

        // Concatenação de string com a variável booleana para exibir o resultado.
        System.out.println("numeroUm é igual a numeroDois?" + simNao); // Saída: false.

        // Verifica se os números são diferentes e atualiza a variável 'simNao'.
        simNao = numero1 != numero2;

        // Exibe o resultado da comparação de diferença.
        System.out.println("numeroUm é diferente a numeroDois?" + simNao); // Saída: true.

        // Verifica se numero1 é maior que numero2.
        simNao = numero1 > numero2;

        // Exibe o resultado da comparação de maior que.
        System.out.println("numeroUm é maior que numeroDois?" + simNao); // Saída: false.
    }
}