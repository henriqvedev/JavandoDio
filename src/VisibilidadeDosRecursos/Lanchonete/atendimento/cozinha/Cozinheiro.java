package VisibilidadeDosRecursos.Lanchonete;

public class Cozinheiro {

    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCAO");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    public void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }
    public void preparaVitamina(){
        System.out.println("PREPARANDO VITAMINA");
    }
    public void prepararCombo(){
        prepararLanche();
        preparaVitamina();
    }
    public void selecionarIngredientesLanche(){
        System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE");
    }
    public void selecionarIngredientesVitamina(){
        System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
    }
    public void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }
    public void baterVitaminaLiquidificador(){
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
    }
    public void fritarIngredientesLanche(){
        System.out.println("FRITANDO A CARNE E OVO PARA HAMBURGUER");
    }
    public void pedirParaTrocarGas(Atendente meuAmigo){
        meuAmigo.trocarGas();
    }
    public void pedirParaTrocarGas(Atendente meuAmigo){
        meuAmigo.trocarGas();
    }
    public void pedirIngredientes(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
}
