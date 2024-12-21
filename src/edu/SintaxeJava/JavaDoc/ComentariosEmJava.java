package edu.SintaxeJava.JavaDoc;

/**
 * Classe que exemplifica boas e más práticas em nomes de variáveis.
 * <p>
 * Esta classe foi criada para demonstrar como evitar nomes pouco descritivos
 * e como implementar um Javadoc básico.
 *
 * @author Aluno
 * @version 1.0
 * @since 2024-12-15
 */
public class ComentariosEmJava {

    /**
     * Método principal que inicia a execução do programa.
     *
     * @param args argumentos passados pela linha de comando
     */
    public static void main(String[] args) {
        // Este espaço pode ser usado para testar o método somaMultiplica.
    }

    /**
     * Realiza a soma ou multiplicação de dois números, dependendo do parâmetro.
     *
     * @param numero1 o primeiro número
     * @param numero2 o segundo número
     * @param operacao operação desejada: "M" para multiplicação ou qualquer outro valor para soma
     * @return o resultado da operação
     */
    public int calcular(int numero1, int numero2, String operacao) {
        int resultado = 0;
        // "M" significa multiplicação; caso contrário, realiza a soma.
        if ("M".equals(operacao)) {
            resultado = numero1 * numero2;
        } else {
            resultado = numero1 + numero2;
        }
        return resultado;
    }
}
