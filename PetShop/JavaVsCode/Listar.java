package JavaVsCode;

public class Listar {
    
    public static void ListandoAnimal(Animal animal_reference) {
        System.out.println( "----------- Listando Animal -----------" );
        System.out.println( "Nome > " +  animal_reference.getNome());
        System.out.println( "Idade > " + animal_reference.getIdade());
        System.out.println( "Porte > " + animal_reference.getPorte());
        System.out.println( "Tipo Animal > " + animal_reference.getTipo_animal());
    }

    public static void ListandoPessoa(Cliente cliente_reference){
        System.out.println( "----------- Listando Cliente -----------" );
        System.out.println( "Nome > " + cliente_reference.getNome());
        System.out.println( "Idade > " + cliente_reference.getIdade());
    }

    public static void ListandoPetShop(PetShop pet_reference){
        System.out.println( "----------- Listando PetShop -----------" );
        System.out.println( "Nome > " + pet_reference.getNome_estabelecimento());
        System.out.println( "Saldo > " + pet_reference.getSaldo_pet_shop());

    }
}
