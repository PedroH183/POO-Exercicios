public class Conta {

    Double saldo;
    String agencia;
    Cliente titular;
    int numeroConta;
    Data dataAberturaConta;

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
        
        String textPrint = "\nAgencia>" + this.agencia ;
        textPrint += "\nNumeroConta>"+ this.numeroConta;
        textPrint += "\nSaldo>"+ this.saldo;
        textPrint += "\nNome Titular>" + this.titular.nome;
        textPrint += "\nTitular Idade>" + this.titular.idade;
        textPrint += "\nData Abertura da Conta>" + this.dataAberturaConta.DataStoraged();
        return textPrint;
    }

    public void main(String[] args)
    {

    }
    
}