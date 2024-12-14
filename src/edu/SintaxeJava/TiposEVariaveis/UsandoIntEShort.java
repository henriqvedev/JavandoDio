package edu.SintaxeJava.TiposEVariaveis;

public class UsandoIntEShort {
    public static void main(String[] args) {
        double salarioMinimo = 2500.00; // Salário em reais
        System.out.println("Salário Mínimo: R$ " + salarioMinimo);

        short anosDeContribuicao = 30;
        int contribuicaoTotal = salarioMinimo > 2000 ? anosDeContribuicao * 12 : 0; // Simulação
        System.out.println("Contribuição Total (em meses): " + contribuicaoTotal);

        // Casting explícito para demonstrar limitação de tipos
        short meses = (short) contribuicaoTotal;
        System.out.println("Meses após casting para short: " + meses);
    }
}
