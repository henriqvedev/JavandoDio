package edu.SintaxeJava.Operadores; // Declara o pacote onde a classe está organizada.

public class OperadoreTernario { // Nome descritivo para a classe.
    public static void main(String[] args) { // Ponto de entrada do programa.
        int a, b; // Declaração de duas variáveis inteiras.
        a = 5;    // Inicialização da variável 'a' com o valor 5.
        b = 6;    // Inicialização da variável 'b' com o valor 6.

        // Uso do operador ternário para verificar se 'a' é igual a 'b'.
        // Se 'a == b', resultado será "verdadeiro". Caso contrário, será "falso".
        String resultado = a == b ? "verdadeiro" : "falso";

        // Exibe o resultado da comparação no console.
        System.out.println(resultado);
    }
}
