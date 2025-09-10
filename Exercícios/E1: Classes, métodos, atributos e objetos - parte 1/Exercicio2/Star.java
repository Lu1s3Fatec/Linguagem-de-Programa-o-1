package Exercícios.Exercicio2;

public class Star {
    private int brilho;       // intensidade do brilho (0 a 100)
    private String cor;       // cor da estrela
    private double distancia; // distância em anos-luz

    public Star(int brilho, String cor, double distancia) {
        this.brilho = brilho;
        this.cor = cor;
        this.distancia = distancia;
    }

    public void brilhar() {
        System.out.println("A estrela de cor " + cor + " está brilhando com intensidade " + brilho + ".");
    }
}
