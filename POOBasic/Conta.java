public class Conta {

    Double saldo;
    String agencia;
    Cliente titular;
    int numeroConta;

    Double depositar(int valor){
        return this.saldo += valor;
    }

    Double saque( int valor ){
        if( this.saldo >= valor ){
            this.saldo -= valor;
        }

        return this.saldo;
    }

    Double ganhoMensal( int meses ){
        return this.saldo * 0.1 ;
    }

    String recuperaDadosParaImpressao(){
        
        String textPrint = "\nAgencia>" + this.agencia + "\nNumeroConta>"+ this.numeroConta + "\nSaldo>"+ this.saldo + "\nNome Titular>" + this.titular.nome + "\nTitular Idade>" + this.titular.idade;
        return textPrint;
    }

    public void main(String[] args)
    {

    }
    
}