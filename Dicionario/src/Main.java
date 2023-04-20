import br.com.hashmap.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap myHashMap = new HashMap(11);

        myHashMap.put_data(11, 200);
        myHashMap.put_data(10, 220);
        myHashMap.get_data(11);
        myHashMap.get_data(10);
    }
}