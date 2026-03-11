//Definindo a classe publica HelloWorld. Em java,
//o nome do arquivo deve ser o mesmo da classe publica.
public class HelloWorld {
    /** o metodo main, deve ser publico para ser chamado pela JVM
    -static: o metodo (ou variavel) pertence a classe em si, e nao
    a um objeto da classe. Assim a JVM chama o main diretamente
    usando o nome da classe, sem a necessidade de criar um objeto
    -void: o metodo nao retorna nenhum valor
    -main: ponto de entrada de qlqr aplicacao Java stand-alone
    -(String[] args):parametro do metodo. string[] é um array de strings
     args é a variavel q armazena os argumentos de linha de comando
     passados ao programa quando ele é executado.
     **/
    public static void main(String[] args) {
        //sout: system é uma classe padrao do Java(pacote java.lang)
        //que fornece acesso aos recursos do sistema.
        //.out: campo estatico da classe system, representa o stream
        //de saída padrao (geralmente o console).
        //println: metodo do objeto out, imprime o valor passado
        //como argumento e insere uma nova linha depois de imprimir
        //" ..." a string em si
        System.out.println("Hello, World!");
    }
}
