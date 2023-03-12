public class Teste {
    public static void main(String[] args) {
        Cliente cliente  = new Cliente();
        cliente.nome = "Pedro";
        cliente.idade = 20;

        Conta conta = new Conta();
        conta.saldo = (double) 15000;
        conta.agencia = "Fisica 001";
        conta.numeroConta = 001;
        conta.titular = cliente;
        conta.dataAberturaConta = new Data();
        conta.dataAberturaConta.dia = 12;
        conta.dataAberturaConta.mes = 03;
        conta.dataAberturaConta.ano = 2023;

        System.out.println(conta.recuperaDadosParaImpressao());
    }
}
