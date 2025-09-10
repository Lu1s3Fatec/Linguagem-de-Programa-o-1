package Exercícios.Exercicio4;

public class MonaLisaPBJ {
    private String inspiracao; // referência original (Mona Lisa)
    private String material1;  // geleia de uva
    private String material2;  // manteiga de amendoim

    public MonaLisaPBJ(String inspiracao, String material1, String material2) {
        this.inspiracao = inspiracao;
        this.material1 = material1;
        this.material2 = material2;
    }

    public void mostrar() {
        System.out.println("Exibindo a obra inspirada em " + inspiracao + " feita com " + material1 + " e " + material2 + ".");
    }
}
