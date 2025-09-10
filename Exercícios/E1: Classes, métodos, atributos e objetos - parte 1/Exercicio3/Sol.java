package Exercícios.Exercicio3;

public class Sol {
    // Atributos
    private String cor;
    private int raio;
    private int brilho;

    // Construtor
    public Sol(String cor, int raio, int brilho) {
        this.cor = cor;
        this.raio = raio;
        this.brilho = brilho;
    }

    // Métodos
    public void aquecer() {
        System.out.println("O sol está aquecendo a terra!");
    }

    public void nascer() {
        System.out.println("O sol está nascendo no horizonte!");
    }

    public void brilhar() {
        System.out.println("O sol está brilhando com intensidade: " + brilho);
    }
}
