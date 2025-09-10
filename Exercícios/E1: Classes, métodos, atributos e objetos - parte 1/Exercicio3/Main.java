package Exercícios.Exercicio3;

public class Main {
    public static void main(String[] args) {
        // Criando objetos
        Sol sol1 = new Sol("Amarelo", 50, 100);
        Gato gato1 = new Gato("Mingau", 2, "Cinza");
        XicaraCafe xicara1 = new XicaraCafe("Médio", 60, 200.0);

        // Interações do Sol
        System.out.println("=== Sol ===");
        sol1.nascer();
        sol1.brilhar();
        sol1.aquecer();

        // Interações do Gato
        System.out.println("\n=== Gato ===");
        gato1.miar();
        gato1.brincar();
        gato1.dormir();

        // Interações da Xícara de Café
        System.out.println("\n=== Xícara de Café ===");
        xicara1.esquentar();
        xicara1.beber();
        xicara1.esfriar();
    }
}
