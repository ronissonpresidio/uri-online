import java.util.Scanner;

public class Uri1073 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numeroDigitado = 0;

        numeroDigitado = sc.nextInt();

        for (int i = 1; i <= numeroDigitado; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "^2 = " + (int) Math.pow(i, 2));
            }
        }

        sc.close();
    }
}
