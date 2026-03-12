import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verificação
        if (numero > 0) {
            System.out.println(numero + " é Positivo");
        } else if (numero < 0) {
            System.out.println(numero + " é Negativo");
        } else {
            System.out.println(numero + " é Zero");
        }

        scanner.close();
    }
}


    }
}
