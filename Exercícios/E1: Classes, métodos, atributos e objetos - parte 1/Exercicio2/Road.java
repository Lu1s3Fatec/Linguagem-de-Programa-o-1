package Exercícios.Exercicio2;

public class Road {
    private double comprimento; // comprimento da estrada em km
    private String tipo;        // tipo da estrada (asfalto, terra, etc.)
    private String destino;     // destino da estrada

    public Road(double comprimento, String tipo, String destino) {
        this.comprimento = comprimento;
        this.tipo = tipo;
        this.destino = destino;
    }

    public void seguir() {
        System.out.println("Seguindo pela estrada de " + tipo + " até " + destino + " (" + comprimento + " km).");
    }
}
