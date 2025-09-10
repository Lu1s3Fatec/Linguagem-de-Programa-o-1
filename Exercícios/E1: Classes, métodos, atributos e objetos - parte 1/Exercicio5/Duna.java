package Exercícios.Exercicio5;

public class Duna {
    private double altura; // Altura da duna em metros
    private double largura; // Largura da base da duna em metros
    private String tipo; // Tipo de duna (e.g., parabólica, linear)

    public Duna(double altura, double largura, String tipo) {
        this.altura = altura;
        this.largura = largura;
        this.tipo = tipo;
    }

    public void acumularAreia() {
        System.out.println("A duna está acumulando mais areia.");
    }

    public void mudarForma() {
        System.out.println("A duna está mudando de forma devido ao vento.");
    }

    public void estabilizar() {
        System.out.println("A duna está estabilizando com a vegetação.");
    }
}
