package Exercícios.Exercicio2;

public class Dream {
    private String descricao; // conteúdo do sonho
    private int intensidade;  // força do sonho (0 a 100)
    private double duracao;   // duração em horas

    public Dream(String descricao, int intensidade, double duracao) {
        this.descricao = descricao;
        this.intensidade = intensidade;
        this.duracao = duracao;
    }

    public void realizar() {
        System.out.println("O sonho de '" + descricao + "' está sendo realizado com intensidade " + intensidade + ".");
    }
}
