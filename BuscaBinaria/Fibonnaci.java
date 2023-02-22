class Fibonnaci{

    private static int fibo( int term ){
        if( term == 1 || term == 0  ){
            return term;
        }
        
        System.out.println(term);

        return(fibo(term-2) + fibo(term-1));
    }

    public static void main(String[] args){
        int prox = 1;
        int ant = 0;
        int aux = 0;

        for( int terms = 9 ; terms != 0 ; --terms ){
            System.out.println(ant);
            aux = ant;
            ant = prox;
            prox += aux;
        }
        fibo(4);
   }
}
