
public class Operadores {
    public static void main(String[] args) {

        // qual o resultado das expressoes abaixo?

        String concatenacao = "?";
        System.out.println(concatenacao);
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1); // usando os parentes o programa entende que são números e faz a somatória.
        System.out.println(concatenacao);
        // A partir do momento que é inserido uma string, o programa não entende que os
        // próximos valores são números.

        // --------------------números positivos e negativos
        int numero = 5;

        numero = -numero; // transforma o número em negativo
        System.out.println(numero);

        numero = numero * -1; // retorna o valor para positivo
        System.out.println(numero);

        // --------------------- negação
        boolean verdadeiro = true;
        verdadeiro = !verdadeiro;
        System.out.println(verdadeiro);

        // -----------------------operador ternário
        int a, b;
        a = 5;
        b = 6;

        String resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);
        // ------------------------operadores relacionais
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        // quando comparar objetos deve se usar o método equals
    }
}
