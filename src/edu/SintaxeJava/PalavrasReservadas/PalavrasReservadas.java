package edu.SintaxeJava.PalavrasReservadas;

/**
 * Este programa demonstra o uso de palavras reservadas em Java.
 * As palavras reservadas são organizadas por categorias e explicadas com comentários.
 */
public class PalavrasReservadas {
    public static void main(String[] args) {
        // 1. Controle de fluxo
        if (true) { // Verifica uma condição booleana
            System.out.println("A palavra reservada 'if' verifica condições.");
        } else {
            System.out.println("A palavra reservada 'else' define ações alternativas.");
        }

        for (int i = 0; i < 3; i++) { // Laço de repetição
            System.out.println("A palavra reservada 'for' cria laços de repetição.");
        }

        // Laço baseado em uma condição booleana

        do { // Executa o bloco pelo menos uma vez antes de verificar a condição
            System.out.println("A palavra reservada 'do' executa antes de verificar a condição.");
        } while (false);

        switch (3) { // Escolhe um caso baseado em uma variável
            case 1:
                System.out.println("Caso 1 no switch.");
                break; // Sai do bloco do switch
            case 3:
                System.out.println("Caso 3 no switch.");
                break;
            default: // Caso padrão se nenhum outro for atendido
                System.out.println("Default no switch.");
        }

        // 2. Declaração de variáveis e tipos de dados
        int numero = 10; // Declara um inteiro
        double decimal = 5.5; // Declara um número de ponto flutuante
        char caractere = 'A'; // Declara um caractere
        boolean verdade = true; // Declara um valor booleano
        String texto = "Java"; // Declara uma string

        System.out.println("Tipos de dados básicos em Java:");

        // Demonstrando os tipos básicos
        System.out.println("int: " + numero);
        System.out.println("double: " + decimal);
        System.out.println("char: " + caractere);
        System.out.println("boolean: " + verdade);
        System.out.println("String (não é palavra reservada, mas uma classe): " + texto);

        // 3. Modificadores de acesso e controle
        final int constante = 100; // O valor não pode ser alterado
        System.out.println("\nA palavra reservada 'final' define constantes como: " + constante);

        // 4. Exceções e controle de erros
        try { // Tenta executar o código no bloco
            int resultado = numero / 0; // Gera um erro de divisão por zero
        } catch (ArithmeticException e) { // Captura o erro
            System.out.println("Palavra reservada 'try' e 'catch' usadas para tratar erros.");
        } finally { // Executa sempre, independentemente de erro
            System.out.println("A palavra reservada 'finally' é sempre executada.");
        }

        // 5. Declaração de classes e objetos
        PalavrasReservadas objeto = new PalavrasReservadas(); // Criação de um objeto
        System.out.println("\nA palavra reservada 'new' cria novos objetos.");
        objeto.exemplo();

        // 6. Outras palavras reservadas importantes
        System.out.println("\nOutras palavras reservadas:");
        System.out.println("'null' representa um objeto vazio.");
        System.out.println("'this' refere-se ao objeto atual.");
        System.out.println("'super' refere-se à classe pai.");
        System.out.println("'return' retorna valores ou finaliza métodos.");
    }

    /**
     * Método de exemplo para ilustrar palavras reservadas.
     */
    public void exemplo() {
        System.out.println("A palavra reservada 'void' indica que o método não retorna nada.");
    }
}
