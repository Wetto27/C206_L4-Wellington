public class Conta {
    private double saldo;
    private static int qtdClientes;


    public void deposita(double valor) {
        saldo += valor;
    }

    public void saca(double valor) {
        if(saldo >= valor) {
            saldo -= valor;
        }
        else
            System.out.println("Nao é possivel pois nao tem todo o dinheiro");
    }

    public void extrato() {
        System.out.println("saldo: " + this.saldo);
    }

}
