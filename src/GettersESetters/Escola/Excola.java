package GettersESetters.Escola;

public class Excola {
    public static void main(String[] args){
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe Junior");
        felipe.setIdade (12);

        System.out.println("O aluno" + felipe.getNome() + "tem" + felipe.getIdade() + " anos ");
    }
}
