package edu.SintaxeJava.Metodos; // Organiza o código no pacote 'SintaxeJava.Metodos'.

public class DemonstracaoDeMetodos { // Nome descritivo para a classe.
    public static void main(String[] args) { // Método principal - ponto de entrada do programa.
        // Exemplo 1: Chamando um método sem retorno
        exibirMensagemDeBoasVindas();

        // Exemplo 2: Chamando um método com parâmetros e sem retorno
        exibirMensagemPersonalizada("Henrique");

        // Exemplo 3: Chamando um método que retorna um valor
        int soma = somarDoisNumeros(5, 10);
        System.out.println("A soma dos números é: " + soma);

        // Exemplo 4: Chamando um método com lógica de decisão
        boolean resultado = verificarMaioridade(17);
        System.out.println("Você é maior de idade? " + resultado);

        // Exemplo 5: Chamando um método estático com cálculo matemático
        double area = calcularAreaDoCirculo(7);
        System.out.println("A área do círculo é: " + area);

        // Exemplo 6: Método que chama outros métodos (divisão de responsabilidades)
        System.out.println("Relatório de usuário:");
        exibirRelatorioDeUsuario("Ana", 25, 1.65);
    }

    // Método 1: Sem retorno (void) e sem parâmetros
    public static void exibirMensagemDeBoasVindas() {
        System.out.println("Bem-vindo ao sistema de demonstração de métodos!");
    }

    // Método 2: Sem retorno (void), mas com parâmetros
    public static void exibirMensagemPersonalizada(String nome) {
        System.out.println("Olá, " + nome + "! Seja bem-vindo ao nosso sistema.");
    }

    // Método 3: Com retorno (int) e com parâmetros
    public static int somarDoisNumeros(int numero1, int numero2) {
        return numero1 + numero2; // Retorna a soma dos dois números
    }

    // Método 4: Com retorno (boolean) e com lógica condicional
    public static boolean verificarMaioridade(int idade) {
        return idade >= 18; // Retorna true se a idade for maior ou igual a 18
    }

    // Método 5: Com retorno (double) para realizar um cálculo matemático
    public static double calcularAreaDoCirculo(double raio) {
        return Math.PI * raio * raio; // Fórmula da área do círculo: π * r²
    }

    // Método 6: Sem retorno (void), mas chamando outros métodos dentro dele
    public static void exibirRelatorioDeUsuario(String nome, int idade, double altura) {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " metros");

        // Chamada de outros métodos
        boolean maiorDeIdade = verificarMaioridade(idade);
        System.out.println("Maior de idade? " + maiorDeIdade);
    }
}
