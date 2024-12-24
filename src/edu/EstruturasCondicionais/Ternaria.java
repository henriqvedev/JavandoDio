package edu.EstruturasCondicionais;

public class Ternaria {
    public static void main(String[] args) {
        int nota = 6;

        // ✅ OPERADOR TERNÁRIO (?:)
        // O operador ternário é uma forma simplificada de escrever estruturas condicionais.
        // Ele segue a sintaxe: condição ? valor_se_verdadeiro : valor_se_falso

        // ✅ OPERADOR LÓGICO (&&)
        // O operador && (E lógico) verifica se duas condições são verdadeiras ao mesmo tempo.

        // 🔍 LÓGICA:
        // 1. Se a nota for maior ou igual a 7 → "Aprovado"
        // 2. Se a nota for maior ou igual a 5 E menor que 7 → "Recuperação"
        // 3. Caso contrário → "Reprovado" pq ai o aluno teria tiraddo nota menor que 5

        String resultado = (nota >= 7)
                ? "Aprovado"
                : (nota >= 5 && nota < 7)
                ? "Recuperação"
                : "Reprovado";

        // 🖨️ Exibe o resultado no console
        System.out.println(resultado);
    }
}