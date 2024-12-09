package edu.SintaxeJava.Anatomiadasclasses;
public class Anatomia3{

    public static void main (String [] args) {
        String meuNome = "Henrique";
        String meuSegundonome = "tiaromba";

        String nomeCompleto = nomeCompleto (meuNome,meuSegundonome);

        System.out.println(nomeCompleto);


    }

    public static String nomeCompleto (String meuNome, String meuSegundonome){
        return meuNome.concat(" ").concat(meuSegundonome);
    }


}


/* String meuNome = "Henrique";
String é uma classe em java , e os nomes de classes em Java seguem a
convenção de usar a primeira letra maiúscula */