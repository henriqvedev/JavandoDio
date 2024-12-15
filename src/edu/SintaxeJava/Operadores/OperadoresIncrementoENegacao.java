package edu.SintaxeJava.Operadores;

public class OperadoresIncrementoENegacao {
    public static void main(String[] args) {
        // Trabalhando com incremento
        int numero = 5;

        // Incremento explícito: soma manual de 1
        numero = numero + 1; // Agora numero = 6.
        System.out.println("Após numero = numero + 1: " + numero); // Resultado: 6.

        // Incremento usando operador de pós-incremento
        System.out.println("Imprimindo e incrementando (pós-incremento): " + numero++);
        // Imprime o valor atual (6) e depois incrementa para 7.

        // Incremento usando operador de pré-incremento
        System.out.println("Pré-incremento (++numero): " + (++numero));
        // Incrementa primeiro (7 -> 8) e depois imprime.

        // Trabalhando com booleanos e negação
        boolean variavel = true;

        // Negação lógica apenas para exibir o valor invertido
        System.out.println("Negação de variavel (!variavel): " + !variavel);
        // Resultado: false.

        // Negação lógica com atribuição
        variavel = !variavel; // 'variavel' agora é false.
        System.out.println("Novo valor de variavel após !variavel: " + variavel);
        // Resultado: false.

        // Exemplo adicional com operações booleanas
        boolean condicao1 = true;
        boolean condicao2 = false;

        // Operadores lógicos com variáveis booleanas
        System.out.println("condicao1 E condicao2 (condicao1 && condicao2): " + (condicao1 && condicao2));
        // Resultado: false (ambas as condições precisam ser verdadeiras).
        System.out.println("condicao1 OU condicao2 (condicao1 || condicao2): " + (condicao1 || condicao2));
        // Resultado: true (pelo menos uma condição verdadeira).
    }
}