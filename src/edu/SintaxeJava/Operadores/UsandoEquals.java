package edu.SintaxeJava.Operadores;
public class UsandoEquals {
    public static void main(String[]args){

        String senhaDigitada = "12345";
        String senhaCadastrada = "12345";

        if (senhaDigitada.equals(senhaCadastrada)) {
            System.out.println("Login realizado com sucesso.");
        } else {
            System.out.println("Senha incorreta.");
        }
    }
}