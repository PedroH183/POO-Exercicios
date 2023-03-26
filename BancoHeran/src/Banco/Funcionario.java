package Banco;

public class Funcionario {
    private String nome;
    private int salario;
    private String cpf;

    public double getBonificacao(){
        return this.salario * 0.1;
    }
    protected int getSalario() {
        return salario;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    protected void setSalario(int salario) {
        this.salario = salario;
    }
    public Funcionario(String nome, int salario, String cpf){
        this.setSalario(salario);
        this.setNome(nome);
        this.setCpf(cpf);
    }
}
