package Banco;

public class Gerente extends Funcionario{
    private final int senha;

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
        return super.getSalario() * 1.15;
    }
    public Gerente(int passwrd, String nome, String cpf, int salario){
        super(nome, salario, cpf);
        this.senha = passwrd;

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
    }
}
