package Enums;

public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo", 11),
    RIO_JANEIRO ("RJ", "RIO de JANEIRO", 12),
    PIAUI ("PI", "Piauí" ,13),
    MARANHAO ("MA", "Maranhão" ,14),
    CEARA ("CE", "Ceará" ,15);

    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge){
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public String getSigla(){
        return sigla;
    }
    public String getnome(){
        return nome;

    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
