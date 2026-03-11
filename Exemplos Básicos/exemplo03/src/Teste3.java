import java.util.Scanner;

public class Teste3 {
    public static void main(String[] args) {
        /**Scanner é uma classe que lê dados de entrada
        new cria um novo objeto da classe Scanner que
        eh armazenado dentro de leitor
        o parametro system.in é a entrada padrao do sistema
         "crie um Scanner que leia dados digitados pelo usuario no console"
         **/
        Scanner leitor = new Scanner(System.in);
        int opcao;
        System.out.println("MENU");
        System.out.println("1.coca");
        System.out.println("2.fanta");
        System.out.println("3.guarana");
        System.out.println("Digite sua opcao");
        //nextInt captura o valor digitado pelo usuario e o retorna como int
        opcao = leitor.nextInt();
        switch(opcao){
            case 1 -> System.out.println("escolheu coca");
            case 2 -> System.out.println("escolheu fanta");
            default -> System.out.println("opcao invalida");
        }
    }
}
