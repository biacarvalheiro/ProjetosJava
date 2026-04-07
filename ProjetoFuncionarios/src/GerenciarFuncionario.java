import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarFuncionario {
    //atributo privado
    private List<Funcionario> listaFuncionarios = new ArrayList<>();
    //não podemos criar uma lista privada dentro do main, pq
    // dentro deste método, só se pode declarar variáveis locais
    // e elas não têm modificadores de acesso (private, public, protected),
    // elas só existem enquanto o método está sendo executado. Quando o
    //método termina, elas são descartadas da memória
    //o modificador private só faz sentido em atributos de classe (variáveis
    //declaradas dentro da classe, mas fora dos métodos).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarFuncionario gerenciar = new GerenciarFuncionario();
        int opcao;
        do{
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar Funcionario");
            System.out.println("2. Bonificar Funcionario");
            System.out.println("3. Consultar Funcionario");
            System.out.println("4. Inativar Funcionario");
            System.out.println("5. Listar Todos Funcionario");
            System.out.println("6. Listar Funcionarios Ativos");
            System.out.println("7. Listar Ex-funcionarios");
            System.out.println("9. Sair");
            System.out.println("Escolha sua opcao");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1 -> gerenciar.execCadastrar();
                case 2 -> gerenciar.execBonificar();
                case 3 -> gerenciar.execConsultar();
                case 4 -> gerenciar.execInativar();
                case 5 -> gerenciar.execConsultarTodos();
                case 6 -> gerenciar.execConsultarTodosAtivos();
                case 7 -> gerenciar.execConsultarTodosInativados();
                case 9 -> System.out.println("Fim do Programa");
                default -> System.out.println("Opcao invalida");
            }
        }while(opcao != 9);
    }

    public void execConsultar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o RG do funcionario a ser consultado: ");
        String rgProc = sc.nextLine();
        //comando foreach (ou enhanced for)
        // for(Tipo variavel : coleção)
        //percorre cada elemento da coleção (lista, array, conjunto etc)
        //sem precisar usar índice manual(i=0; i<tamanho;i++) em cada volta
        //do loop, a variável (funcionario no caso) recebe o próximo item da lista
        //Funcionario é o tipo dos elementos da lista, funcionario é uma variável
        //temporária que representa um elemento da lista em cada iteração.
        //.: "para cada objeto Funcionario dentro da lista listaFuncionarios,
        //execute o bloco abaixo".
        for(Funcionario funcionario : listaFuncionarios){
            //verifica se o rg do funcionario atual eh igual ao rg q procuramos
            //equals é usado para comparar Strings em Java (não usamos == p comparar conteúdo de texto)
            if(funcionario.getRg().equals(rgProc)){
                System.out.println(funcionario);
                return; //encerra o método (pq é void) inteiro, não apenas o  loop
            }
        }
    }

    public void execBonificar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o RG do funcionario a ser bonificado: ");
        String rgProc = sc.nextLine();
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getRg().equals(rgProc)) {
                System.out.println("Digite o valor da bonificação: ");
                double aumento = Double.parseDouble(sc.nextLine());
                //chama o método bonificar do objeto funcionario
                funcionario.bonificar(aumento);
                System.out.println("Funcionario Bonificado");
                return;
            }
        }
        System.out.println("RG de funcionario nao encontrado");
}

    public void execCadastrar() {
        Scanner sc = new Scanner(System.in);
        Funcionario func = new Funcionario();
        System.out.println("Digite o nome do funcionario: ");
        func.setNome(sc.nextLine());
        System.out.println("Digite o rg do funcionario: ");
        func.setRg(sc.nextLine());
        System.out.println("Digite o departamento do funcionario: ");
        func.setDepartamento(sc.nextLine());
        System.out.println("Digite o salario do funcionario: ");
        func.setSalario(Double.parseDouble(sc.nextLine()));
        func.setAtivo(true);
        System.out.println("Funcionario cadastrado com sucesso...");
        listaFuncionarios.add(func); //adicionar funcionario na lista

    }

    public void execInativar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o RG do funcionario a ser inativado: ");
        String rgProc = sc.nextLine();
        for(Funcionario funcionario : listaFuncionarios){
            if(funcionario.getRg().equals(rgProc)){
                funcionario.setAtivo(false);
                System.out.println("Funcionario inativado com sucesso");
                return;
            }
        }
        System.out.println("Funcionario nao encontrado");
    }

    public void execConsultarTodos(){
        int i = 1;
        for(Funcionario funcionario: listaFuncionarios){
            System.out.println(i + "o funcionario...");
            System.out.println(funcionario);
            System.out.println(); //imprime uma linha em branco p separar
            i++; //incrementa o contador para que na próxima volta do
            //loop, o numero do funcionario aumenta
        }
    }

    public void execConsultarTodosAtivos(){
        int i = 1;
        for(Funcionario funcionario: listaFuncionarios){
            if(funcionario.isAtivo()){
                System.out.println(i + "o funcionario...");
                System.out.println(funcionario);
                System.out.println();
                i++;
            }
        }
    }

    public void execConsultarTodosInativados(){
        int i = 1;
        for(Funcionario funcionario: listaFuncionarios){
            if(!funcionario.isAtivo()){
                System.out.println(i + "o funcionario...");
                System.out.println(funcionario);
                System.out.println();
                i++;
            }
        }
    }
}
