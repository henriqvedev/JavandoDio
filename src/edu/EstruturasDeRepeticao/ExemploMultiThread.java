package edu.EstruturasDeRepeticao;
class MinhaThread extends Thread {
    private String nome;

    public MinhaThread(String nome) {
        this.nome = nome;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(nome + " executando passo " + i);
            try {
                Thread.sleep(1000); // Faz a thread "dormir" por 1 segundo
            } catch (InterruptedException e) {
                System.out.println("Thread interrompida.");
            }
        }
        System.out.println(nome + " finalizou!");
    }
}

public class ExemploMultiThread {
    public static void main(String[] args) {
        MinhaThread t1 = new MinhaThread("Thread 1");
        MinhaThread t2 = new MinhaThread("Thread 2");

        t1.start(); // Inicia a Thread 1
        t2.start(); // Inicia a Thread 2

        System.out.println("Threads iniciadas!");
    }
}
