public class ComputadorTeste {
    public static void main(String[] args) {
    Computador computador1 = new Computador();
    computador1.marca = "HP";
    computador1.modelo = "Pavilon";
    computador1.cor = "Preto";
    computador1.numeroSerie = 2121;
    computador1.preco = 5000;
    computador1.imprimir();
    computador1.calcularValor(); //alteracao do preco em 30%
    computador1.imprimir();

    Computador computador2 = new Computador();
    computador2.marca = "IBM";
    computador2.modelo = "Volvo";
    computador2.cor = "Prata";
    computador2.numeroSerie = 2006;
    computador2.preco = 1500;
    computador2.imprimir();
    computador2.calcularValor(); //Aumenta o preco em 50%
    computador2.imprimir();

    //vai alterar pro valor especifico escolhido, desconsiderando
    //o original ou os calculos de 1.30 e 1.50
    boolean alterou = computador2.alterarValor(2000.0);
    if(alterou){
        System.out.println("Valor alterado com sucesso");
    }
    else{
        System.out.println("Valor invalido");
    }
    computador2.imprimir();
     }
}
