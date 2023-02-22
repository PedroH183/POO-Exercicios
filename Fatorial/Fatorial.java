class Fatorial{

    public static int fat( int term ){
        if( term == 1){
            return term;
        }
        return fat(term - 1) * term;
    }

    
    public static void main(String[] args){
        // fatoriais 
        int aux = 5;
        int ac = 1;

        while( aux != 0 ){
            ac *= aux;
            --aux;
        }
        int ac_2 = 1;
        // outra forma de fazer um fatorial
        for(aux = 1; aux <= 5 ; ++aux ){
            ac_2 *= aux;
        }

        System.out.println("O fatorial do numero 5 pelo método 1 é " + ac);
        System.out.println("O fatorial do numero 5 pelo método 2 é " + ac_2);
        System.out.println("O fatorial do numero 5 pelo método 3 é "+ fat(5));
    }
}
