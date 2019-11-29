package factorial;

public class Factorial {

    public static void main(String[] args) {
        int valor;
        int factorial;

        valor = 8;

        int i;
        if (valor== 0) {
            factorial = 1;
        } else {
            factorial = 1;
            for (i = valor; i >= 1; i--) {
                factorial = factorial * i;
            }
        }

        System.out.println(factorial);
    }
}
// refactorizacion en rename le cambiamos el nombre j=valor , f=factoriaal  