package edu.EstruturasCondicionais;
public class Encadeada{
    public static void main(String[] args){
        int nota = 5;

        if(nota >= 7)
            System.out.println("Aprovado");

            else if (nota >= 5 && nota < 11)
            System.out.println("Prova Recuperação");

            else
            System.out.println("Reprovado");
    }
}