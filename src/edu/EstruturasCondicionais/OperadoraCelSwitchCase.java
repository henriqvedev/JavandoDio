package edu.EstruturasCondicionais;

public class OperadoraCelSwitchCase {
    public static void main(String[] args) {
        String plano = "T"; // Variável com valor a ser avaliado no switch

        switch (plano) { // Estrutura de decisão baseada no valor de 'plano'
            case "T": { // Se plano for "T"
                System.out.println("5gb Youtube"); // Exibe "5gb Youtube"
                // Sem 'break', continua para o próximo caso
            }
            case "M": { // Se plano for "M" ou caiu do caso anterior
                System.out.println("Whatsapp e Instagram grátis"); // Exibe mensagem
                // Sem 'break', continua para o próximo caso
            }
            case "B": { // Se plano for "B" ou caiu do caso anterior
                System.out.println("100 minutos de ligação"); // Exibe mensagem
            }
        }
    }
}
