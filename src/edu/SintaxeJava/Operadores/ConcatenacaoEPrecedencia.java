package edu.SintaxeJava.Operadores;

public class ConcatenacaoEPrecedencia {
    public static void main(String[] args) {
        // Declaração de uma variável String chamada 'concatenacao' inicializada com "?".
        String concatenacao = "?";

        // Aqui ocorre a concatenação de valores. Quando começamos com uma String ("1"),
        // tudo o que vem depois será tratado como texto e concatenado em sequência.
        concatenacao = "1" + 1 + 1 + 1;
        // Resultado esperado: "1111"
        // Explicação: A sequência de "+" começa com uma String ("1"),
        // então os números 1 são concatenados, formando a string "1111".
        System.out.println(concatenacao);

        // Neste caso, utilizamos parênteses para alterar a precedência das operações.
        // Primeiro, a soma (1+1+1) será realizada, resultando no número 3.
        // Em seguida, esse valor será concatenado com a String "1".
        concatenacao = "1" + (1 + 1 + 1);
        // Resultado esperado: "13"
        // Explicação: O cálculo dentro dos parênteses (1 + 1 + 1) é feito primeiro,
        // produzindo o número 3, que é então concatenado com a String "1".
        System.out.println(concatenacao);
    }
}
