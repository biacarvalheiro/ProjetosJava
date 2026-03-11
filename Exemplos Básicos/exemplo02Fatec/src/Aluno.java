//localdatetime é uma classe da API java.time
import java.time.LocalDateTime;

/**tipos primitivos(armazena o valor real direto na variavel):
 * int, float, double, long, char, boolean, byte, short
 *
 * tipos de referencia (armazena o endereço da memoria):
 * 1.Classes:
 * Integer, character, string, object, etc...
 * 2.Interfaces: colecao de metodos abstratos, padrao e estaticos
 * 3.Arrays
 */

public class Aluno {
    //1.Definir os atributos
    public int ra; //tipo primitivo
    public String nome; //tipo de referencia
    public String email;
    public String turma;

    //2.Definir os métodos
    public void matricular(){
        System.out.println("||| MATRICULANDO ALUNO |||");
        System.out.println("Aluno com RA: " + ra);
        System.out.println("foi matriculado com sucesso");
        System.out.println("---------------------------");
        System.out.println("Dados do Aluno");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("---------------------------");
    }

    public void cancelarMatricula(){
        System.out.println("||| CANCELAR MATRICULA |||");
        System.out.println("Aluno com RA: " + ra);
        System.out.println("sua matricula foi cancelada");
        System.out.println("---------------------------");
        System.out.println("Dados do cancelamento");

        //variavel momento do tipo localdatetime, recebe valor
        //retornado por .now(), metodo estatico que retorna o
        //momento atual do sistema
        LocalDateTime momento = LocalDateTime.now();
        System.out.println("Data e Hora: " + momento);
        System.out.println("---------------------------");
    }


}
