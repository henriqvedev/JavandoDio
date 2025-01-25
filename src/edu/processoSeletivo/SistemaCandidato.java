package edu.processoSeletivo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SistemaCandidato {

    // Metodo principal que orquestra a execução do programa.
    public static void main(String[] args) {
        // Chama o metodo para exibir os candidatos selecionados.
        imprimirSelecionados();
        // Inicia o processo de seleção de candidatos com base no salário pretendido.
        selecaoCandidatos();
        // Gera um exemplo de salário pretendido para demonstração.
        double salarioExemplo = valorPretendido();
        System.out.println("Exemplo de salário gerado: R$ " + String.format("%.2f", salarioExemplo));
        // Analisa um candidato individualmente com base no salário pretendido.
        analisarCandidato(salarioExemplo);
        // Lista de candidatos para o processo de contato.
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        // Para cada candidato na lista, tenta entrar em contato.
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    /**
     * Simula o processo de tentativa de contato com um candidato.
     * @param candidato Nome do candidato.
     */
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1; // Conta o número de tentativas feitas.
        boolean continuarTentando = true; // Indica se deve continuar tentando.
        boolean atendeu = false; // Indica se o candidato atendeu.

        // Loop para realizar até 3 tentativas de contato.
        do {
            atendeu = atender(); // Simula o candidato atender ou não.
            continuarTentando = !atendeu; // Continua tentando se não atendeu.
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        } while (continuarTentando && tentativasRealizadas < 3);

        // Mensagem final após as tentativas de contato.
        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "ª TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS (" + tentativasRealizadas + ") REALIZADAS");
    }

    /**
     * Simula a chance de o candidato atender ao telefone.
     * @return Verdadeiro se o candidato atendeu, falso caso contrário.
     */
    static boolean atender() {
        return new Random().nextInt(3) == 1; // Retorna verdadeiro 1/3 das vezes.
    }

    /**
     * Exibe uma lista de candidatos com seus índices.
     */
    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        // Loop para exibir os candidatos com seus índices.
        for (int posicaoDoCandidato = 0; posicaoDoCandidato < candidatos.length; posicaoDoCandidato++) {
            System.out.println("O candidato de nº " + (posicaoDoCandidato + 1) + " é o " + candidatos[posicaoDoCandidato]);
        }

        // Forma alternativa de exibir os candidatos usando for-each.
        System.out.println("Forma abreviada de interação (for-each):");
        for (String candidato : candidatos)
            System.out.println("O candidato selecionado foi " + candidato);
    }

    /**
     * Simula o processo de seleção de candidatos com base no salário pretendido.
     */
    static void selecaoCandidatos() {
        String[] candidatos = {
                "FELIPE", "MARCIA", "JULIA", "JOAO", "JORGE",
                "CREISON", "CLEBER", "VALDIR", "KAIO", "LUCAS"
        };

        int candidatosSelecionados = 0; // Conta os candidatos selecionados.
        int candidatoAtual = 0; // Índice do candidato sendo avaliado.
        double salarioBase = 2000.0; // Salário máximo oferecido.

        // Continua até selecionar 5 candidatos ou esgotar a lista.
        while (candidatosSelecionados < 5) {
            // Verifica se todos os candidatos foram avaliados.
            if (candidatoAtual >= candidatos.length) {
                System.out.println("Todos os candidatos foram avaliados. Processo encerrado.");
                break; // Sai do loop se não houver mais candidatos.
            }

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou um salário de R$ " + String.format("%.2f", salarioPretendido));

            // Seleciona o candidato se o salário pretendido estiver dentro do limite.
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            } else {
                System.out.println("O candidato " + candidato + " não foi selecionado devido ao salário pretendido.");
            }

            candidatoAtual++; // Passa para o próximo candidato.
        }

        System.out.println("Processo de seleção encerrado. Total de candidatos selecionados: " + candidatosSelecionados);
    }

    /**
     * Gera um salário pretendido aleatório para um candidato.
     * @return Salário pretendido entre R$ 1800,00 e R$ 2200,00.
     */
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    /**
     * Analisa um único candidato com base no salário pretendido.
     * @param salarioPretendido Salário pretendido pelo candidato.
     */
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0; // Salário máximo oferecido.

        // Determina a ação com base no salário pretendido.
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}