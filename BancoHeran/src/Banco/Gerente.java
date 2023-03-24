package Banco;

public class Gerente extends Funcionario{
    private final int senha;
    private int qtdFuncionarioGerenciados;

    public void setQtdFuncionarioGerenciados(int qtdFuncionarioGerenciados) {
        this.qtdFuncionarioGerenciados = qtdFuncionarioGerenciados;
    }

    public int getQtdFuncionarioGerenciados() {
        return qtdFuncionarioGerenciados;
    }

    public boolean autentica(int password){
        if (password == this.senha){
            System.out.println("Acesso Permitido ! ");
            return true;
        }
        System.out.println("Acesso Negado ! ");
        return false;
    }

    @Override
    public double getBonificacao(){
        /*
         * Método reposável por obter a bonificação do gerente
         * Nesse caso não acompanhamos o método da classe pai (funcionario)
         * */
        return super.getSalario() * 0.15;
    }

    public Gerente(int passwrd, String nome, String cpf, int salario, int qtdSubordinados){
        super(nome, salario, cpf);
        this.senha = passwrd;
        this.setQtdFuncionarioGerenciados(qtdSubordinados);

    }

    public void getAtributtes(int senha){

        if(!this.autentica(senha)){
            return ;
        }

        System.out.println("------------------------------------------------");
        System.out.println("Bonificacao >> " + getBonificacao());
        System.out.println("CPF >> " + super.getCpf() );
        System.out.println("Nome >> " + super.getNome());
        System.out.println("Salario >> " + super.getSalario());
        System.out.println(" Qtd Colaboradores >>" + this.getQtdFuncionarioGerenciados());
        System.out.println("------------------------------------------------");

    }
}
