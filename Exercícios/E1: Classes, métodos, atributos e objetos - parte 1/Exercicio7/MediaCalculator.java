package Exercícios.Exercicio7;

import java.util.Scanner;

public class MediaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = scanner.nextInt();

        double soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double num = scanner.nextDouble();
            soma += num;
        }

        double media = soma / n;
        System.out.println("A média dos " + n + " números é: " + media);

        scanner.close();
    }
}
