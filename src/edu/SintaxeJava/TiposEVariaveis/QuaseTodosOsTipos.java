package edu.SintaxeJava.TiposEVariaveis;

public class QuaseTodosOsTipos {
    public static void main(String[] args) {

        // Exemplos de tipos inteiros
        byte idade = 25; // Ocupa 8 bits (-128 a 127)
        short anoAtual = 2024; // Ocupa 16 bits (-32.768 a 32.767)
        int populacaoCidade = 150000; // Ocupa 32 bits
        long populacaoMundial = 7800000000L; // Ocupa 64 bits (necessário usar 'L' para indicar o tipo)

        // Exemplos de tipos ponto flutuante
        float altura = 1.75F; // Ocupa 32 bits (necessário usar 'F' para indicar o tipo)
        double salarioAnual = 45000.75; // Ocupa 64 bits

        // Tipo caractere
        char inicialDoNome = 'J'; // Representa um único caractere Unicode

        // Tipo lógico
        boolean estaChovendo = false; // Armazena apenas true ou false

        // Conversões entre tipos
        int idadeComoInt = idade; // Conversão implícita (byte para int)
        byte idadeComoByte = (byte) idadeComoInt; // Conversão explícita (int para byte)

        // Exibindo os valores das variáveis
        System.out.println("Tipos Inteiros:");
        System.out.println("Byte (idade): " + idade);
        System.out.println("Short (anoAtual): " + anoAtual);
        System.out.println("Int (populacaoCidade): " + populacaoCidade);
        System.out.println("Long (populacaoMundial): " + populacaoMundial);

        System.out.println("\nTipos Ponto Flutuante:");
        System.out.println("Float (altura): " + altura);
        System.out.println("Double (salarioAnual): " + salarioAnual);

        System.out.println("\nTipo Caractere:");
        System.out.println("Char (inicialDoNome): " + inicialDoNome);

        System.out.println("\nTipo Lógico:");
        System.out.println("Boolean (estaChovendo): " + estaChovendo);

        System.out.println("\nConversões:");
        System.out.println("Idade como int: " + idadeComoInt);
        System.out.println("Idade como byte (após casting): " + idadeComoByte);
    }
}
