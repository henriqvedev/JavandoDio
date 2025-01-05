package edu.EstruturasDeRepeticao;

public class Continue {
    public static void main(String[] args){

        for ( int numero = 1; numero <= 5; numero ++){

            if ( numero == 3)
                continue;
            // continue vai parar so a interação do numero 3 e vai continuar a partir do 4 R= 12456
            System.out.println (numero);
        }

    }
}