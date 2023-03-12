public class Data {
    int dia;
    int mes;
    int ano;

    String DataStoraged()
    {
        String textPrint = "" + this.dia;
        textPrint += "/" + this.mes;
        textPrint += "/" + this.ano; 
        return textPrint;
    }

    public static void main(String[] args)
    {

    }
}