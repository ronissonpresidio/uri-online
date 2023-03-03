import java.util.Scanner;

public class Uri1003 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int primeiroValor = sc.nextInt();
        int segundoValor = sc.nextInt();

        int prod = primeiroValor * segundoValor;

        System.out.println("PROD = " + prod);

        sc.close();
    }
}
