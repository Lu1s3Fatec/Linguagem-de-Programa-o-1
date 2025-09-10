package Exercícios.Exercicio4;

public class ManteigaAmendoim {
    private String textura;     // textura (ex: cremosa)
    private String marca;       // marca
    private double quantidadeGr; // quantidade em gramas

    public ManteigaAmendoim(String textura, String marca, double quantidadeGr) {
        this.textura = textura;
        this.marca = marca;
        this.quantidadeGr = quantidadeGr;
    }

    public void espalhar() {
        System.out.println("Espalhando " + quantidadeGr + " gramas de manteiga de amendoim " + textura + " da marca " + marca + ".");
    }
}
