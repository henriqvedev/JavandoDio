package VisibilidadeDosRecursos.Lanchonete.atendimento.cozinha;

import VisibilidadeDosRecursos.Lanchonete.atendimento.Atendente;

public class Cozinheiro {

    // Metodo público: disponível para qualquer classe, inclusive para o cliente.
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCAO");
    }

    // Metodo público: disponível para qualquer classe.
    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }

    // Metodo público: chama os métodos de adicionar lanche e suco, portanto também acessível externamente.
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    // Metodo privado: visível apenas dentro da classe Cozinheiro. Apenas a própria cozinha pode preparar o lanche.
    private void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }

    // *** Atenção: "private public" não é uma combinação válida. ***
    // Supondo que a intenção fosse ter um metodo privado que só a cozinha usa, este metodo deveria ser apenas "private".
    // Metodo que prepara vitamina, restrito à classe.
    private void preparaVitamina(){
        System.out.println("PREPARANDO VITAMINA");
    }

    // Metodo privado: combina os métodos de preparo, mantendo a lógica interna da cozinha escondida.
    private void prepararCombo(){
        prepararLanche();
        preparaVitamina();
    }

    // Metodo privado: responsável por selecionar os ingredientes para o lanche, visível só para a cozinha.
    private void selecionarIngredientesLanche(){
        System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE");
    }

    // Metodo privado: responsável por selecionar os ingredientes para a vitamina.
    private void selecionarIngredientesVitamina(){
        System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
    }

    // *** Atenção: "private public" não é permitido. Deveria ser apenas "private" se a intenção é restringir o acesso. ***
    // Metodo que lava ingredientes, restrito ao uso interno da cozinha (não pode ser visto por classes externas como o Cliente).
    private void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }

    // *** Atenção: "private public" não é permitido. Deveria ser apenas "private". ***
    // Metodo que bate a vitamina no liquidificador, também para uso interno da cozinha.
    private void baterVitaminaLiquidificador(){
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
    }

    // Metodo público: mesmo sendo parte de um processo interno (fritar ingredientes), foi liberado para que
    // outras partes do sistema (ou mesmo para testes) possam chamar diretamente se necessário.
    public void fritarIngredientesLanche(){
        System.out.println("FRITANDO A CARNE E OVO PARA HAMBURGUER");
    }

    // Metodo privado: solicita a troca de gás chamando um metodo do Atendente.
    // Aqui, o metodo e privado para que somente a propria classeCozinheiro possa iniciar esse processo. edit1
    private void pedirParaTrocarGas(Atendente meuAmigo){
        meuAmigo.trocarGas();
        //Metodo default: visível apenas no pacote 'atendimento'. Assim, a troca de gás pelo atendente não pode ser chamada diretamente por classes fora deste pacote (como o cliente). ta dando um pequeno erro pois por mais que usamos o import para o cozinheiro conseguir ter acesso a trocarGas do atendente. como ta default e eles nao estao no mesmo pacote vai dar esse erro e eu nao quero que a troca de gas seja um metodo publico entao por hora fica assim edit1 vo deixa publico pq o vermelho do erro ta incomodando
    }

    // Metodo privado: solicita ingredientes, restrito à lógica interna da cozinha,
    // e somente classes do pacote (como Almoxarife) poderão ser utilizadas se forem visíveis.
    private void pedirIngredientes(Almoxarife meuAmigo){
        meuAmigo.entregarIngredientes();
    }
}
