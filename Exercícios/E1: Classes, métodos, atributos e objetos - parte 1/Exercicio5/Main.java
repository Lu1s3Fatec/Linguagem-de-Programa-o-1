package Exercícios.Exercicio5;

public class Main {
    public static void main(String[] args) {
        Duna duna = new Duna(30, 100, "parabólica");
        Rocha rocha = new Rocha("arenito", 6, 50);
        Vento vento = new Vento(40, "norte", 5);

        vento.transportarAreia();
        rocha.serErosionada();
        duna.acumularAreia();
    }
}
