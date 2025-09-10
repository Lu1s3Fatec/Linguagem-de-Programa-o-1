package Exercícios.Exercicio3;

public class XicaraCafe {
    // Atributos
    private String tamanho;
    private int temperatura;
    private double quantidadeCafe;

    // Construtor
    public XicaraCafe(String tamanho, int temperatura, double quantidadeCafe) {
        this.tamanho = tamanho;
        this.temperatura = temperatura;
        this.quantidadeCafe = quantidadeCafe;
    }

    // Métodos
    public void esquentar() {
        temperatura += 5;
        System.out.println("O café está mais quente: " + temperatura + "°C");
    }

    public void esfriar() {
        temperatura -= 5;
        System.out.println("O café está esfriando: " + temperatura + "°C");
    }

    public void beber() {
        if (quantidadeCafe > 0) {
            System.out.println("Você bebeu o café.");
            quantidadeCafe = 0;
        } else {
            System.out.println("A xícara está vazia!");
        }
    }
}
