package edu.SintaxeJava.TiposEVariaveis;
public class TiposIntEShort {

    public static void main(String[] args) {

        // Exemplo de valor decimal
        double salarioMinimo = 2500;

        // Conversões entre tipos inteiros
        short numeroCurto = 1; // Variável do tipo short
        int numeroNormal = numeroCurto; // Conversão implícita de short para int
        short numeroCurto2 = (short) numeroNormal; // Casting explícito de int para short

        // Reatribuição de variáveis
        int numero = 5;
        numero = 10; // Atualizando o valor da variável
        System.out.print(numero); // Saída: 10

        // Declaração de uma constante
        final double VALOR_DE_PI = 3.14; // Valor imutável
    }
}