package Exercícios.Exercicio4;

public class Main {
    public static void main(String[] args) {
        // Criando objetos da obra Double Mona Lisa
        MonaLisaPBJ mona = new MonaLisaPBJ("Mona Lisa de Da Vinci", "geleia de uva", "manteiga de amendoim");
        GeleiaUva geleia = new GeleiaUva("uva", "roxo", 300);          // 300 ml de geleia
        ManteigaAmendoim manteiga = new ManteigaAmendoim("cremosa", "Genérica", 250); // 250 g de manteiga

        // Chamando os métodos de cada objeto
        mona.mostrar();
        geleia.aplicar();
        manteiga.espalhar();
    }
}
