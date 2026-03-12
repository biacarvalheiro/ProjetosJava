import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    private LocalDate dataNasc;
    //Relacionamento com a classe Carro
    //carros é uma lista que pode armazenar vários objs do tipo Carro
    //cria uma nova lista vazia, pronta para receber carros
    private List<Carro> carros = new ArrayList<Carro>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public void adicionarCarro(Carro carro){
        //add carro insere um novo elemento no final da lista
        //carro sem o this é o parametro recebido, o carro que queremos adicionar
        this.carros.add(carro); //é como adicionar um novo item dentro de um vetor
    }

    public void removerCarroVendido(Carro carro){
        this.carros.remove(carro);
    }


    public void imprimirDadosDoCliente(){
        System.out.println(">>>>>>> Dados do cliente e seus carros <<<<<<<");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        //metodo size() da lista carros, retorna qtd de elementos dentro dela
        System.out.println("Total de carros: " + carros.size());
        //laço for-each: pra cada obj do tipo Carro dentro da lista carros,
        //vai executar o bloco abaixo (aqui, imprimir)
        //variavel carro do tipo Carro que a cada volta do loop representa
        //um elemento da lista
        for(Carro carro : carros){
            carro.imprimirCarro();
        }
        System.out.println(">>>>>>>>>-------------------<<<<<<<<<<");
    }

}
