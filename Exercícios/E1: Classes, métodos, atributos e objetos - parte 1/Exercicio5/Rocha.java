package Exercícios.Exercicio5;

public class Rocha {
    private String material; // Composição da rocha (e.g., granito, arenito)
    private double dureza; // Dureza da rocha na escala de Mohs
    private double areaExposta; // Área da rocha exposta à erosão em metros quadrados

    public Rocha(String material, double dureza, double areaExposta) {
        this.material = material;
        this.dureza = dureza;
        this.areaExposta = areaExposta;
    }

    public void serErosionada() {
        System.out.println("A rocha está sendo erodida pelo vento.");
    }

    public void liberarParticulas() {
        System.out.println("A rocha está liberando partículas de areia.");
    }

    public void resistirErosao() {
        System.out.println("A rocha está resistindo à erosão devido à sua dureza.");
    }
}
