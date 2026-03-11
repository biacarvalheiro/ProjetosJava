public class Teste {
    public static void main(String[] args) {
        int a = 21;
        int b = 5;
        //casting (conversão explicita) de a, de int para float
        //agora Java interpreta como uma divisao decimal float
        float x = (float)a / b;
        System.out.println("Valor de x: "+ x);
    }
}
