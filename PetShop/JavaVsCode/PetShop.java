package JavaVsCode;


class PetShop{
    private int saldo_pet_shop;
    private String nome_estabelecimento;

    public boolean pagar_pet_shop(int valor_servico){

        if( valor_servico < 0 ){
            return false;
        }
        this.saldo_pet_shop += valor_servico;
        return true;
    }

    public String getNome_estabelecimento() {
        return nome_estabelecimento;
    }
    public int getSaldo_pet_shop() {
        return saldo_pet_shop;
    }
    public void setNome_estabelecimento(String nome_estabelecimento) {
        this.nome_estabelecimento = nome_estabelecimento;
    }
    public void setSaldo_pet_shop(int saldo_pet_shop) {
        this.saldo_pet_shop = saldo_pet_shop;
    }

    public PetShop(String nome_estabelecimento, int saldo_estabelecimento){
        this.nome_estabelecimento = nome_estabelecimento;
        this.saldo_pet_shop = saldo_estabelecimento;
    }
}