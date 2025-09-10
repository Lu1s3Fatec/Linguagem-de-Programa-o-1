package Exercícios.Exercicio2;

public class Main {
    public static void main(String[] args) {
        Star estrela = new Star(90, "azul", 1500.5);
        Dream sonho = new Dream("encontrar alguém no meio do caminho", 85, 8.0);
        Road estrada = new Road(300, "asfalto", "meio do caminho");

        estrela.brilhar();
        sonho.realizar();
        estrada.seguir();
    }
}
