public class Computador {
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;

    public void imprimir(){
        System.out.println("------------------------------------");
        System.out.println("Dados do computador: ");
        System.out.println("Marca = " + marca);
        System.out.println("Cor = " + cor);
        System.out.println("Modelo = " + modelo);
        System.out.println("Numero de serie = " + numeroSerie);
        System.out.println("Preco = " + preco);
        System.out.println("------------------------------------");
    }

    public void calcularValor(){
        //equalsIgnoreCase para case sensitive
        //compara a string recebida com "HP"
        if(marca.equalsIgnoreCase("HP")){
        //multiplica o preco atual por 1.30 e atribui o resultado a preco dnv
        preco *= 1.30;
        //return encerra a execucao do codigo em voids, pois
        //nao há valor a ser retornado.
        return;
        }
        if(marca.equalsIgnoreCase("IBM")){
        preco *= 1.50;
        //n precisa de return pq só existem essas duas
        //condicoes e nao tem mais nada pra baixo
        }
    }

    public boolean alterarValor(double valor){
        if(valor > 0){
            preco = valor;
            return true; //alteração feita com sucesso
        }
        return false; //valor inválido
    }
}
