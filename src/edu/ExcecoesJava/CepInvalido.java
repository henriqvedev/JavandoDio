package edu.ExcecoesJava;

// Classe de exceção personalizada que herda de Exception
public class CepInvalido extends Exception {
    // Construtor padrão que chama o construtor da superclasse
    public CepInvalido() {
        super();
    }

    // Construtor que permite passar uma mensagem personalizada
    public CepInvalido(String message) {
        super(message);
    }
}