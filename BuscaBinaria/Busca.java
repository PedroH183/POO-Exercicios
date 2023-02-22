public class Busca{
    public static void main(String[] args){
        int vetor[] = {1,2,3,4,5,6,7,8,9,10};
        int k_procure = 10;
        int result = 0;
        int esque = 0;
        int direi = vetor.length; 

        while( esque <= direi ){
            
            int meio = (direi + esque)/2;

            if(vetor[meio] == k_procure){
                result = meio;
                break;

            }else if ( k_procure < vetor[meio] ){
                direi = meio - 1;

            }else if( k_procure > vetor[meio] ){
                esque = meio + 1; 
            }
        }

        if(esque != direi){
            System.out.println("A posição do index é : " + result );
        }else{
            System.out.println("O elemento não existe no vetor ");
        }

    }
}
