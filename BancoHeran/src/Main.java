import Banco.Funcionario;
import Banco.Gerente;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente(147258, "Agostinho Carrara", "61074145685", 15000);
        Funcionario funcionario_one = gerente;

        System.out.println("-------Polimorfismo--------");
        System.out.println("Ambas as bonificaçoes têm que ser iguais !!");
        System.out.println("By Funcionario :: " + funcionario_one.getBonificacao());
        System.out.println("By Gerente ::" + gerente.getBonificacao());
        System.out.println("----------------------------");
    }
}