import Banco.Funcionario;
import Banco.Gerente;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente(147258, "Agostinho Carrara", "61074145685", 15000);
        Funcionario funcionario = new Funcionario("Pedro Henrique", 15000, "15975348625");

        // ao criar uma classe gerente e outra funcionario
        // os métodos de funcionario são diferente dos métodos de gerente


        System.out.println("----------------------------");
        System.out.println("By Funcionario :: " + funcionario.getBonificacao());
        System.out.println("By Gerente ::" + gerente.getBonificacao());
        System.out.println("----------------------------");
    }
}