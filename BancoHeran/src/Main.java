import Banco.Gerente;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente(1234,"Pedro","123456",12000, 5);
        gerente.getAtributtes(1234);

        Gerente gerente2 = new Gerente(147258, "Agostinho Carrara", "61074145685", 15000, 10);
        gerente2.getAtributtes(147258);
    }
}