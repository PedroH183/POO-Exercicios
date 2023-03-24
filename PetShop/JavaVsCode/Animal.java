package JavaVsCode;

public class Animal {
    private String nome;
    private int idade;
    private String tipo_animal;
    private String porte;


    public Animal(String nome, String tipo_animal, String porte, int idade){
        this.nome = nome;
        this.tipo_animal = tipo_animal;
        this.porte = porte;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getPorte() {
        return porte;
    }
    
    public String getTipo_animal() {
        return tipo_animal;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setPorte(String porte) {
        this.porte = porte;
    }
    
    public void setTipo_animal(String tipo_animal) {
        this.tipo_animal = tipo_animal;
    }    
}
