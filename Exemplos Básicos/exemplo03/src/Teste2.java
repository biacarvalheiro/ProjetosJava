public class Teste2 {
    /**
     * Função Somar- Soma de dois valores inteiros
     * @param a primeiro valor a ser somado
     * @param b segundo valor a ser somado
     * @return resultado da soma em inteiros
     */
    //metodos ficam sempre dentro de classes, e nao de outros metodos
    public static int somar(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        String valor = "121";
        //string para inteiro com o metodo estatico parseInt da classe Integer
        //"valor" é a string passada como argumento pro parseInt converter
        int valorConvertido = Integer.parseInt(valor);
        int resultado = valorConvertido * 2;

        System.out.println("Resultado: " + resultado);

        //inteiro para string com o metodo toString
        //resultado é o int a ser convertido para texto
        String str_resultado = Integer.toString(resultado);
        int somado = somar(15,20);


    }
}
