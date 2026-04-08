import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarHotel {
    private List<Quarto> listaQuartos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarHotel gerenciar = new GerenciarHotel();
        int opcao=0;
        do{
            System.out.println("Menu Principal \n");
            System.out.println("1. Fazer Check-in (Cadastrar Quarto)\n");
            System.out.println("2. Lançar Consumo\n");
            System.out.println("3. Consultar Quarto\n");
            System.out.println("4. Fazer Check-out (Liberar Quarto)\n");
            System.out.println("5. Listar Todos os Quartos\n");
            System.out.println("6. Listar Quartos Ocupados\n");
            System.out.println("7. Listar Quartos Livres\n");
            System.out.println("9. Sair\n");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1 -> gerenciar.execFazerCheckIn();
                case 2 -> gerenciar.execLancarConsumo();
                case 3 -> gerenciar.execConsultarQuarto();
                case 4 -> gerenciar.execFazerCheckOut();
                case 5 -> gerenciar.execListarTodos();
                case 6 -> gerenciar.execListarOcupados();
                case 7 -> gerenciar.execListarLivres();
                case 9 -> System.out.println("Fim do programa!\n");
                default -> System.out.println("Opcao invalida!\n");
            }
        }while(opcao!=9);
    }

    public void execFazerCheckIn(){
        Scanner sc = new Scanner(System.in);
        Quarto quarto = new Quarto();
        System.out.println("Digite o nome do hóspede:\n");
        quarto.setNomeHospede(sc.nextLine());
        System.out.println("Digite o tipo do quarto:\n");
        quarto.setTipoQuarto(sc.nextLine());
        System.out.println("Digite o número do quarto:\n");
        quarto.setNumeroQuarto(sc.nextLine());
        //definindo o valor inicial de consumo como zero
        quarto.setValorConsumo(0.0);
        quarto.setOcupado(true);
        System.out.println("Check-In realizado com sucesso!\n");
        listaQuartos.add(quarto);
    }

    public void execLancarConsumo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número do quarto: ");
        String numProc = sc.nextLine();
        for (Quarto quarto : listaQuartos){
            if (quarto.getNumeroQuarto().equals(numProc)){
                System.out.println("Digite o valor de consumo a ser lançado: ");
                double valor = Double.parseDouble(sc.nextLine());
                //chamar o método adicionarConsumo
                quarto.adicionarConsumo(valor);
                System.out.println("Valor lançado.\n");
                return;
            }
        }
        System.out.println("Número do quarto inválido!\n");
    }

    public void execConsultarQuarto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número do quarto: ");
        String numProc = sc.nextLine();
        for (Quarto quarto : listaQuartos){
            if (quarto.getNumeroQuarto().equals(numProc)){
                System.out.println(quarto);
                return;
            }
        }
        System.out.println("Número do quarto inválido!\n");
    }

    public void execFazerCheckOut(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número do quarto a ser liberado: ");
        String numProc = sc.nextLine();
        for (Quarto quarto : listaQuartos) {
            if (quarto.getNumeroQuarto().equals(numProc)) {
                quarto.setOcupado(false);
                System.out.println("Check-Out realizado com sucesso.\n");
            }
        }
        System.out.println("Número do quarto inválido!\n");
    }

    public void execListarTodos(){
        int i = 1;
        for(Quarto quarto : listaQuartos){
            System.out.println(i + "o quarto...");
            System.out.println(quarto);
            System.out.println();
            i++;
        }
    }

    public void execListarOcupados(){
        int i = 1;
        for(Quarto quarto : listaQuartos){
            if(quarto.isOcupado()){
                System.out.println(i + "o quarto...");
                System.out.println(quarto);
                System.out.println();
                i++;
            }
        }
    }

    public void execListarLivres(){
        int i = 1;
        for(Quarto quarto : listaQuartos){
            if(!quarto.isOcupado()){
                System.out.println(i + "o quarto...");
                System.out.println(quarto);
                System.out.println();
                i++;
            }
        }
    }





}
