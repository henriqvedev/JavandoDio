package Enums;

public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {

            //System.out.println(e.getSigla() + " - " + e.getnome());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}