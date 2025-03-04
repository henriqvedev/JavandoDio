package PilaresPOO.Veiculos;

// ABSTRAÇÃO: Classe abstrata que define o conceito de um veículo
public abstract class Veikulo {

    // ENCAPSULAMENTO: Atributo privado, só pode ser acessado por métodos
    private String chassi;


    // ENCAPSULAMENTO: Metodo público para acessar `chassi`
    public String getChassi() {
        return this.chassi;
    }


    // ENCAPSULAMENTO: Metodo público para modificar `chassi`
    public void setChassi(final String chassi) {
        this.chassi = chassi;
    }


    //ABSTRAÇÃO: Metodo abstrato, cada veículo define sua própria implementação
    public abstract void ligar();
}
