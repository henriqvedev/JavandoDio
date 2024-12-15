package edu.SintaxeJava.Operadores;

public class InversaoDeSinal {

    public static void main(String[] args) {
        // Declaração de uma variável inteira chamada 'numero' e inicialização com o valor 5.
        int numero = 5;

        // Aplicação do operador unário de negação (-).
        // Isso inverte o sinal do número, transformando o valor positivo em negativo.
        numero = -numero;
        // Resultado esperado: -5
        // Explicação: O operador unário "-" apenas inverte o sinal do valor atual da variável.
        System.out.println(numero);

        // Multiplicação por -1.
        // Outra forma de inverter o sinal de um número, retornando ao valor positivo.
        numero = numero * -1;
        // Resultado esperado: 5
        // Explicação: Multiplicar um número negativo por -1 torna-o positivo novamente.
        System.out.println(numero);
    }
}

