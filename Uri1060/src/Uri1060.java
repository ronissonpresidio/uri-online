import java.util.Locale;
import java.util.Scanner;

public class Uri1060 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double numeroDigitado = 0;
        int positivos = 0;

        for (int i = 0; i < 6; i++) {
            numeroDigitado = sc.nextDouble();

            if (numeroDigitado > 0) {
                positivos++;
            }
        }

        System.out.println(positivos + " valores positivos");
        sc.close();

    }
}
