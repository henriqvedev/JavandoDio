package VisibilidadeDosRecursos.Lanchonete;

import VisibilidadeDosRecursos.Lanchonete.area.cliente.Cliente;
import VisibilidadeDosRecursos.Lanchonete.atendimento.Atendente;
import VisibilidadeDosRecursos.Lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main (String[] args){

        // Criação de objeto Cozinheiro e execução de métodos públicos para preparar e adicionar produtos no balcão.
        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        // Criação de objeto Atendente e execução de métodos públicos para atendimento.
        Atendente atendente = new Atendente();
        atendente.receberPagamento();
        atendente.servindoMesa();

        // Criação de objeto Cliente e execução de métodos públicos para interagir com a lanchonete.
        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
    }
}
