package VisibilidadeDosRecursos.Lanchonete.atendimento.cozinha;


public class Almoxarife {

    // Métodos privados: controle interno de entrada e saída dos itens, visíveis somente dentro da classe Almoxarife.
    private void controlarEntrada(){
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }

    private void controlarSaida(){
        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
    }

    // Metodo default (sem modificador): visível para classes do mesmo pacote.
    // Apenas as classes dentro do pacote 'cozinha' podem chamar esse metodo.
    void entregarIngredientes(){
        System.out.println("ENTREGANDO INGREDIENTES");
        controlarSaida();
    }

    // Metodo default: visível apenas dentro do mesmo pacote, ou seja, a lógica de troca de gás não pode ser acessada externamente (como pelo cliente).
    void trocarGas(){
        System.out.println("ALMOXARIFE TROCANDO O GAS");
    }
}
