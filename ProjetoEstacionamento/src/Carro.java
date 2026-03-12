/*A classe pessoa tem uma associação um para um com a Carro.
Ela tem um relacionamento com a classe Carro, conhecido por agregação.
Relacionamentos: 1 pra 1, 1 pra N, N pra N.
São modelados com um vetor de objetos de uma classe para outra.
1 pessoa pode ter mais de 1 carro, é necessário mapear esse relacionamento
com uma lista de carros na classe Pessoa.

Métodos Getters and Setters: é muito mais fácil mudar a regra de acesso depois,
para cada private vai ter um public, um para definir outro para ler.
isso é o set e get, o set define e o get devolve.
por segurança, flexibilidade e boas práticas
 */

public class Carro {
    //encapsulamento: os atributos nao podem ser acessados
    //diretamente fora da classe
    private String modelo;
    private String placa;
    private int ano;
    private double valor;

    //alt insert, generate get and setter, clicar no primeiro, shift e ultimo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        //this se refere ao obj atual da classe, o atributo modelo
        //definido no começo, modelo sem o this é o parametro do metodo
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprimirCarro(){
        System.out.println("Dados do carro: ");
        System.out.println("Modelo = " + modelo);
        System.out.println("Placa = " + placa);
        System.out.println("Ano = " + ano);
        System.out.println("Valor = " + valor);
    }
}
