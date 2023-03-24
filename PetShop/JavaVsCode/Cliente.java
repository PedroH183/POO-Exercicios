package JavaVsCode;
public class Cliente {

    private String nome;
    private int idade;

    public Cliente(String nome, int idade){ 
        this.idade = idade;
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    
}
