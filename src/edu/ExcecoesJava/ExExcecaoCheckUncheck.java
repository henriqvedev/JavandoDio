package edu.ExcecoesJava;

import java.text.NumberFormat; // Classe para formatar números, útil para regionalizações
import java.text.ParseException; // Exceção lançada quando o parse falha

// Classe principal
public class ExExcecaoCheckUncheck {
    public static void main(String[] args) {
        Number valor; // Declarando uma variável do tipo Number

        try {
            // Tenta converter a string "a1.75" em um número usando NumberFormat
            // Aqui, "a1.75" contém caracteres inválidos, o que causará uma ParseException
            valor = NumberFormat.getInstance().parse("a1.75");

            // Exibe o valor convertido (se a conversão for bem-sucedida)
            System.out.println("Valor convertido: " + valor);

        } catch (ParseException e) {
            // Trata a exceção ParseException (exceção checked)
            // Imprime a pilha de erro no console para diagnóstico
            System.out.println("Erro ao converter a string para número: " + e.getMessage());
        }
    }
}
