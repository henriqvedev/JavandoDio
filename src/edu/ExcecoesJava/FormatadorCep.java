package edu.ExcecoesJava;

// Classe principal que contém o metodomain
public class FormatadorCep {

    public static void main(String[] args) {
        // Bloco try-catch para lidar com possíveis exceções
        try {
            // Chamamos o metodo formatarCep passando um CEP como entrada
            String cepFormatado = formatarCep("2376506");
            // Exibimos o CEP formatado se não ocorrerem exceções
            System.out.println("CEP formatado: " + cepFormatado);
        } catch (CepInvalido e) {
            // Este bloco é executado se uma exceção CepInvalido for lançada
            System.out.println("Erro: " + e.getMessage());
        }
    }

    /**
     * Metodo estático que formata um CEP.
     * @param cep String representando o CEP.
     * @return string com o CEP formatado.
     * @throws CepInvalido se o CEP não tiver exatamente 8 caracteres.
     */
    static String formatarCep(String cep) throws CepInvalido {
        // Verifica se o CEP tem 8 caracteres
        if (cep.length() != 8) {
            // Lança uma exceção CepInvalido com uma mensagem descritiva
            throw new CepInvalido("O CEP deve conter exatamente 8 caracteres.");
        }

        // Simula a formatação de um CEP (exemplo realista)
        return cep.substring(0, 5) + "-" + cep.substring(5);
    }
}