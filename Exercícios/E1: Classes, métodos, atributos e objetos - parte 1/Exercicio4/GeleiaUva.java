package Exercícios.Exercicio4;

public class GeleiaUva {
    private String sabor;        // sabor da geleia
    private String cor;          // cor (ex: roxo)
    private double quantidadeMl; // quantidade em ml

    public GeleiaUva(String sabor, String cor, double quantidadeMl) {
        this.sabor = sabor;
        this.cor = cor;
        this.quantidadeMl = quantidadeMl;
    }

    public void aplicar() {
        System.out.println("Aplicando " + quantidadeMl + " ml de geleia de " + sabor + " de cor " + cor + " na tela.");
    }
}
