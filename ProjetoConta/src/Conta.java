public class Conta {
    public String nomeCliente;
    public String agencia;
    public long conta;
    public double saldo;

    public void imprimir(){
        System.out.println("---------------------------------");
        System.out.println("Dados da Conta: ");
        System.out.println("Nome do cliente = " + nomeCliente);
        System.out.println("Agencia = " + agencia);
        System.out.println("Conta = " + conta);
        System.out.println("Saldo = " + saldo);
        System.out.println("---------------------------------");
    }

    public boolean sacar(double valor){
        if(saldo >= valor){
            //atualizando o saldo com a subtração do valor sacado
            saldo -= valor;
            return true;
        }
            return false;
    }

    public void depositar(double valor){
        saldo += valor;
    }
}
