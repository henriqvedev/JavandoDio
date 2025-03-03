package VisibilidadeDosRecursos.Lanchonete.atendimento;

public class Atendente {

    // Metodo público: o atendente pode servir a mesa, metodo acessível de qualquer lugar.
    public void servindoMesa(){
        pegarLancheCozinha(); // Chama o metodo privado da própria classe.
        System.out.println("SERVINDO MESA");
    }

    // Metodo privado: somente o Atendente pode invocar o procedimento de pegar o lanche na cozinha.
    private void pegarLancheCozinha(){
        System.out.println("PEGANDO O LANCHE NA COZINHA");
    }

    // Metodo público: permite que o atendente receba pagamento, visível para qualquer classe.
    public void receberPagamento(){
        System.out.println("RECEBENDO PAGAMENTO");
    }

    // Metodo default: visível apenas no pacote 'atendimento'. Assim, a troca de gás pelo atendente não pode ser chamada diretamente por classes fora deste pacote (como o cliente). ta dando um pequeno erro pois por mais que usamos o import para o cozinheiro conseguir ter acesso a trocarGas do atendente. como ta default e eles nao estao no mesmo pacote vai dar esse erro e eu nao quero que a troca de gas seja um metodo publico entao por hora fica assim
    public void trocarGas(){
        System.out.println("ATENDENTE TROCANDO O GAS");
    }

    // Metodo privado: procedimento interno para pegar o pedido do balcão, não acessível externamente.
    private void PegarPedidoBalcao(){
        System.out.println("PEGANDO O PEDIDO NO BALCAO");
    }
}
