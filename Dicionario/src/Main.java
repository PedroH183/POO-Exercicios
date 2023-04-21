import br.com.hashmap.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap myHashMap = new HashMap(11);

        myHashMap.put_data(11, 200);
        myHashMap.put_data(10, 220);
        myHashMap.put_data(22, 444);
        myHashMap.put_data(0, 111);
        myHashMap.get_data(11);
        myHashMap.get_data(10);

        myHashMap.get_line(11);
        myHashMap.delete_data(11);
        myHashMap.get_line(11);
    }
}