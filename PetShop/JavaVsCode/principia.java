package JavaVsCode;

public class principia {
    public static void main(String[] args) {
        PetShop my_PetShop = new PetShop("PetShop Redondo", 15000);

        Listar.ListandoPetShop(my_PetShop);

        Cliente primeiro_cliente = new Cliente("Pedro Henrique", 20);
        Cliente segundo_cliente = new Cliente("Agostinho Carrara", 40);
        Cliente terceiro_cliente = new Cliente("Tino Pereira", 30);
        
        Listar.ListandoPessoa(primeiro_cliente);
        Listar.ListandoPessoa(segundo_cliente);
        Listar.ListandoPessoa(terceiro_cliente);
        
        Animal primeiro_animal = new Animal("Pilantra","canis lupus", "pequeno", 2);
        Animal segundo_animal = new Animal("Madruga","canis lupus ", "médio", 1);
        Animal terceiro_animal = new Animal("Gotinha","canis lupus", "enorme", 2);
        
        Listar.ListandoAnimal(primeiro_animal);
        Listar.ListandoAnimal(segundo_animal);
        Listar.ListandoAnimal(terceiro_animal);
    }
}
