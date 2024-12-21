package edu.SintaxeJava.JavaDoc;
/**
 * Classe que realiza operações matemáticas básicas.
 * Este é um exemplo para iniciantes de como criar um Javadoc.
 */
public class CalculadoraJavaDoc {

    /**
     * Soma dois números inteiros.
     *
     * @param a o primeiro número a ser somado
     * @param b o segundo número a ser somado
     * @return a soma de a e b
     */
    public int somar(int a, int b) {
        // Retorna a soma dos dois números recebidos como parâmetros
        return a + b;
    }

    /**
     * Subtrai dois números inteiros.
     *
     * @param a o número de onde será subtraído
     * @param b o número que será subtraído
     * @return a diferença entre a e b
     */
    public int subtrair(int a, int b) {
        // Retorna a diferença entre os dois números recebidos
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a o primeiro número a ser multiplicado
     * @param b o segundo número a ser multiplicado
     * @return o produto de a e b
     */
    public int multiplicar(int a, int b) {
        // Retorna o produto (multiplicação) dos dois números
        return a * b;
    }

    /**
     * Divide dois números inteiros.
     *
     * @param a o número a ser dividido (numerador)
     * @param b o número pelo qual será dividido (denominador)
     * @return o quociente da divisão de a por b
     * @throws ArithmeticException se b for zero
     */
    public int dividir(int a, int b) throws ArithmeticException {
        // Verifica se o denominador é zero para evitar erro
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        // Retorna o resultado da divisão
        return a / b;
    }
}