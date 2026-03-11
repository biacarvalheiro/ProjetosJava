import java.util.Scanner;

public class ProdutoTeste {
    Produto prod = new Produto();
    //scanner pode (é recomendado) ser declarado só uma vez
    //na classe e utilizado por todos os métodos
    static Scanner sc = new Scanner(System.in); //acessado diretamente pelo main
    //deve ser static pq o main é static, só consegue acessar
    //variáveis static da classe ou variáveis de instancia atraves de um obj
    //se n fosse static, poderia usar um obj da classe para acessá-lo, ex:
    //opcao = Integer.parseInt(teste.sc.nextLine());
    //se for p todos os métodos, static é mais simples
    //se for manter scanner como atributo de instancia, texte.sc
    //static scanner é menos flexivel, simples, p programas pequenos
    //scanner como atributo de instancia, ele pertence a cada obj da classe,
    //para projetos organizados e orientado a objetos, boa prática.

    public static void main(String[] args) {
        ProdutoTeste teste = new ProdutoTeste();
        int opcao=0;
        do {
            System.out.println("---------------------");
            System.out.println("MENU: ");
            System.out.println("1.Cadastrar Produto");
            System.out.println("2.Estocar Produto");
            System.out.println("3.Vender Produto");
            System.out.println("4.Consultar dados do Produto");
            System.out.println("5.SAIR");
            System.out.println("Digite sua opcao: ");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1 -> teste.cadastrarProd();
                case 2 -> teste.estocarProd();
                case 3 -> teste.venderProd();
                case 4 -> teste.consultarProd();
                case 5 -> System.out.println("FIM");
                default -> System.out.println("Opcao invalida!");
            }
        } while(opcao!=5);
    }

    public void cadastrarProd(){
        System.out.println("Digite o nome do produto: ");
        prod.nome = sc.nextLine();
        System.out.println("Digite o ID do produto: ");
        prod.idProduto = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o preco do produto: ");
        Double precoDigitado = Double.parseDouble(sc.nextLine());
        if(precoDigitado<=0){
            System.out.println("Preco invalido!");
        } else {
            prod.preco = precoDigitado;
            System.out.println("Produto cadastrado com sucesso!");
        }
    }

    public void estocarProd(){
        int qtd;
        System.out.println("Digite a quantidade a ser estocada: ");
        qtd = Integer.parseInt(sc.nextLine());
        prod.darEntrada(qtd);
    }

    public void venderProd(){
        System.out.println("Digite a quantidade a ser vendida: ");
        int venda = Integer.parseInt(sc.nextLine());
        prod.darBaixa(venda);
    }

    public void consultarProd(){
        prod.imprimir();
    }
}
