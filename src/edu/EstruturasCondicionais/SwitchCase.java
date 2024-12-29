package edu.EstruturasCondicionais;

public class SwitchCase {
    public static void main(String[] args) {
        String sigla = "M"; // Variável com valor a ser avaliado no switch

        switch (sigla) { // Estrutura de decisão baseada no valor de 'sigla'
            case "P": { // Se sigla for "P"
                System.out.println("PEQUENO"); // Exibe "PEQUENO"
                break; // Encerra o switch, evitando executar outros casos
            }
            case "M": { // Se sigla for "M"
                System.out.println("MEDIO"); // Exibe "MEDIO"
                break; // Encerra o switch
            }
            case "G": { // Se sigla for "G"
                System.out.println("GRANDE"); // Exibe "GRANDE"
                break; // Encerra o switch
            }
            default: // Caso nenhum valor corresponda
                System.out.println("INDEFINIDO"); // Exibe "INDEFINIDO"
        }
    }
}
