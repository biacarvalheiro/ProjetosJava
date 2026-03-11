public class Produto {
    public int idProduto;
    public String nome;
    public int quantidade;
    public double preco;

    public void imprimir(){
        System.out.println("------------------------");
        System.out.println("Dados do Produto: ");
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + idProduto);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("------------------------");
    }

    public void darEntrada(int qtd){
        if(qtd>0) {
            quantidade += qtd;
            System.out.println("Produto estocado com sucesso.");
        }//é necessário o uso de else, pois como é void a função apenas
        //imprime a mensagem e não tem return para encerrar o código.
        //sem o else, imprimiria as duas mensagens todas as vezes
        else {
            System.out.println("Quantidade invalida!");
        }
    }

    public boolean darBaixa(int venda){
        if(quantidade>=venda){
            quantidade -= venda;
            System.out.println("Venda realizada com sucesso!");
            return true;
        }
        //não precisou utilizar o else pq se for true, é encerrada no return true
        //somente se não que continuará a execução abaixo
        System.out.println("Estoque insuficiente para realizar a venda.");
        return false;
    }


}
