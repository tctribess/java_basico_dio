public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Por mais que tenhamos ciência do valor quenumeroNormal cabe é um short, o
        // Java não permite correr o risco.
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);

        // declaração de constante
        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
    }
}
