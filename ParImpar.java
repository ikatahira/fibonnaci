public class ParImpar {

    public static void main(String args[]) {
        /**
         * 2.Escreva um programa que, dada uma variável x com algum valor inteiro, temos
         * um novo x de acordo com a seguinte regra: se x é par, x = x / 2 se x é impar,
         * x = 3 * x + 1 imprime x O programa deve parar quando x tiver o valor final de
         * 1. Por exemplo, para x = 13 , a saída será: 40 -> 20 -> 10 -> 5 -> 16 -> 8 ->
         * 4 -> 2 -> 1
         */

        int numero = 13;

        for (int i = numero; i >= 1; i--) {
            if (numero % 2 == 0) {
                numero = numero / 2;
                System.out.println(numero);

            } else {
                numero = 3 * numero + 1;
                System.out.println(numero);

            }
        }

    }

}