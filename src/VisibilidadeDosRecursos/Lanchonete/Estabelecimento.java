package VisibilidadeDosRecursos.Lanchonete;

public class Estacionamento {
    public static void main (String[] args){
        Cozinheiro cozinheiro = new Cozinheiro();

        //acoes que nao precisam estarem disponiveis para toda a aplicacao
        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
        cozinheiro.prepararVitamina();

        //acoes que estabelecimento precisa saber
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();


        //acoes que nao precisam estar disponiveis para toda a aplicacao
        Almoxarife almoxarife = new Almoxarife();
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();

        //acao que somente o seu pacote cozinha precisa conhecer (default)
        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        //acao que somente o pessoal da cozinha precisa conhecer (default)
        atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();


    }
}
