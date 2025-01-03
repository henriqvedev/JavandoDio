package edu.EstruturasDeRepeticao;

public class ForAndArrays {
    public static void main(String[] args){

        // Declaração e inicialização de um array de Strings chamado 'alunos'.
        // Um array é uma estrutura que armazena vários elementos do mesmo tipo em posições numeradas chamadas índices.
        // Neste caso, o array 'alunos' armazena nomes de alunos.
        String alunos[] = {"HENRIQUE", "CHOPPY", "PEPA", "KRATOS"};

        /*
         * O atributo 'alunos.length' retorna o número total de elementos presentes no array.
         * No caso deste array, 'alunos.length' vale 4, pois há 4 nomes armazenados.
         */

        /*
         * Estrutura de repetição 'for': usada para percorrer todos os elementos do array.
         * - int x = 0 → Inicializa o índice na posição 0 (primeiro elemento do array).
         * - x < alunos.length → Continua enquanto 'x' for menor que o número total de elementos do array.
         * - x++ → Incrementa o índice em 1 a cada iteração.
         */
        for (int x = 0; x < alunos.length; x++) {

            /*
             * A cada iteração:
             * - 'x' representa o índice atual.
             * - 'alunos[x]' acessa o elemento do array na posição 'x'.
             * - System.out.println exibe no console o índice atual e o nome do aluno correspondente.
             */
            System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
        }

        /*
         * Saída esperada no console:
         * O aluno no índice x = 0 é HENRIQUE
         * O aluno no índice x = 1 é CHOPPY
         * O aluno no índice x = 2 é PEPA
         * O aluno no índice x = 3 é KRATOS
         */
    }
}
