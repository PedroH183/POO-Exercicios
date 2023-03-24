import Banco.Funcionario;
import Banco.Gerente;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente(1234,"Pedro","123456",12000, 5);
//        gerente.getAtributtes(1234);

        Gerente gerente2 = new Gerente(147258, "Agostinho Carrara", "61074145685", 15000, 10);
        Funcionario funcionario_one = gerente2;
        Funcionario funcionario_two  = (Funcionario) funcionario_one; // criando uma instancia de outro tipo de instancia

        System.out.println("-------Polimorfismo--------");
        System.out.println("Ambas as bonificaçoes têm que ser iguais !!");
        System.out.println("By Funcionario :: " + funcionario_one.getBonificacao());
        System.out.println("By Gerente ::" + gerente2.getBonificacao());
        System.out.println("By Outro Funcionario :: " + funcionario_two.getBonificacao());
        System.out.println("----------------------------");

//        gerente2.getAtributtes(147258);
    }
}