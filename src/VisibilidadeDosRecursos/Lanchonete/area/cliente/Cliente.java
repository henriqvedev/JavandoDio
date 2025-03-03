package VisibilidadeDosRecursos.Lanchonete.area.cliente;

public class Cliente {
    // Métodos públicos: ações que o cliente pode executar, como escolher o lanche, fazer pedido e pagar a conta.
    public void escolherLanche(){
        System.out.println("SERVINDO MESA");
    }

    public void fazerPedido(){
        System.out.println("FAZENDO O PEDIDO");
    }

    public void pagarConta(){
        System.out.println("PAGANDO A CONTA");
    }

    // Metodo privado: consultar o saldo no aplicativo,
    // não deve ser acessível ou interferida por outras classes.
    private void consultarSaldoAplicativo(){
        System.out.println("CONSULTANDO SALDO NO APLICATIVO");
    }
}
