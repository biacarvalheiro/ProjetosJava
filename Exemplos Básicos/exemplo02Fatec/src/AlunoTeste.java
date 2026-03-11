public class AlunoTeste {
    /*
    Vamos simular a matrícula de dois novos alunos,
    depois, cancelaremos a matrícula do segundo aluno.
     */
    public static void main(String[] args) {
        //Passo 1 - Criar dois alunos (dois objetos),
        //Atribuir dados a eles.
        /*Aluno: tipo da variavel, representa um obj
        do tipo aluno, com seus proprios atributos e metodos
        aluno1: variavel, guarda a referencia pro objeto
        new: usada para criar um novo objeto em Java, que
        reserva espaço na memoria heap p esse obj. Sem new,
        nao teria um obj real, só uma referencia nula.
        Aluno() é a chamado ao metodo q inicializa o obj e
        cria um obj Aluno vazio, pronto p receber valores nos atributos
         */
        Aluno aluno1 = new Aluno();
        aluno1.ra = 127;
        aluno1.nome = "Maria Silva";
        aluno1.email = "maria@gmail.com";
        aluno1.turma = "ADS 4. Manha";
        Aluno aluno2 = new Aluno();
        aluno2.ra = 128;
        aluno2.nome = "Joao Silva";
        aluno2.email = "joao@gmail.com";
        aluno2.turma = "ADS 4. Manha";

        //Passo 2 - Matricular os dois alunos
        aluno1.matricular();
        aluno2.matricular();

        //Passo 3 - Cancelar a Matricula do segundo aluno
        aluno2.cancelarMatricula();

    }
}
