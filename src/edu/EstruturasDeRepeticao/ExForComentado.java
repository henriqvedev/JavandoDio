package edu.EstruturasDeRepeticao;

public class ExForComentado {
    public static void main(String[] args) {

        /*
         * 🌟 Estrutura de Repetição 'for' 🌟
         *
         * A estrutura 'for' é usada para repetir um bloco de código um número específico de vezes.
         * Ela é composta por três partes principais:
         *
         * 1️⃣ Inicialização: Onde uma variável de controle é inicializada.
         * 2️⃣ Condição: A repetição continua enquanto essa condição for verdadeira.
         * 3️⃣ Incremento/Decremento: A variável de controle é atualizada após cada iteração.
         *
         * 🔄 Sintaxe Básica:
         * for (inicialização; condição; incremento/decremento) {
         *      // Bloco de código a ser repetido
         * }
         */

        // Neste exemplo, estamos usando a variável 'carneirinhos' para contar até 20.
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            /*
             * 🔹 Inicialização: int carneirinhos = 1;
             *    - A variável 'carneirinhos' começa com o valor 1.
             *
             * 🔹 Condição: carneirinhos <= 20;
             *    - O loop continuará enquanto 'carneirinhos' for menor ou igual a 20.
             *
             * 🔹 Incremento: carneirinhos++;
             *    - A cada iteração, 1 é somado ao valor de 'carneirinhos'.
             */

            // A cada repetição, esta linha será executada:
            System.out.println("Contando carneirinhos " + carneirinhos);
            // Exemplo de saída: "Contando carneirinhos 1", "Contando carneirinhos 2", ...
        }

        /*
         * 🔚 Quando a condição (carneirinhos <= 20) se tornar falsa,
         * o loop será encerrado e o programa seguirá para a próxima linha após o 'for'.
         */
    }
}
