public class Funcionario {
    //Atributos privados
    private String departamento;
    private double salario;
    private String rg;
    private String nome;
    private boolean ativo;

    //Getters e setters
    //devolve o valor atual armazenado em departamento
    //get obtem o valor de um atributo
    public String getDepartamento(){
        return departamento;
    }

    //set altera o valor de um atributo
    //o String departamento eh o valor que vai ser usado para
    //atualizar o atributo interno da classe
    public void setDepartamento(String departamento){
        //this se refere ao obj atual da classe
        this.departamento = departamento; //parametro recebido pelo método
        //atribuímos o valor recebido como parametro ao atributo da classe
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getRg(){
        return rg;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public boolean isAtivo(){
        return ativo;
    }

    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }

    public void bonificar(double valor){
        salario += valor;
    }

    /** override indica que o método abaixo está sobrescrevendo um método
     * que já existe na classe pai ou em uma superclasse
     * toda classe em java herda da classe Object, que é a raiz da hierarquia
     * de classes. Ela já possui um método toString(), que por padrão retorna
     * algo como NomeDaClasse@códigoHash
     * por exemplo: Funcionario@5a07e868
     * oq não é útil para nós, pq queremos mostrar os dados do funcionário
     * de forma legível. O override avisa ao compilador que está reescrevendo
     * um método já existente. Assim, ao imprimir um objeto Funcionario com
     * sout(funcionario) o java automaticamente chama esse toString() personalizado,
     * mostrando os dados formatados em vez do texto padrão*/

    //@Override = sobrescrever um método herdado
    @Override
    public String toString(){
        //criar um objeto da classe StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Dados do Funcionario \n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Departamento: ").append(departamento).append("\n");
        sb.append("Salário R$ ").append(salario).append("\n");
        sb.append("RG: ").append(rg).append("\n");
        if(ativo){
            sb.append("Funcionario Ativo na Empresa \n");
        }else{
            sb.append("Funcionario Inativado \n");
        }
        return sb.toString();
    }

}
