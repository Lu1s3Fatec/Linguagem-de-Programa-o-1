package Exercícios.Exercicio3;

public class Gato {
    // Atributos
    private String nome;
    private int idade;
    private String corPelo;

    // Construtor
    public Gato(String nome, int idade, String corPelo) {
        this.nome = nome;
        this.idade = idade;
        this.corPelo = corPelo;
    }

    // Métodos
    public void miar() {
        System.out.println(nome + " está miando: Miau!");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo...");
    }

    public void brincar() {
        System.out.println(nome + " está brincando com um brinquedo!");
    }
}
