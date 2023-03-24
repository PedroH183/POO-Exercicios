class Fibonacci{

    private static int fibo( int term )
    {
        if (term <= 1) {
            return (term);
        }

        return( fibo(term -1 ) + fibo( term - 2 ) );
    }

    public static void main(String[] args){

        printingTerms:for(int i = 1 ; i <= 5 ; ++i)
        {
            System.out.println(">>" + fibo(i));
        }
    }
}
