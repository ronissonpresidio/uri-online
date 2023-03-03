import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double primeiraNota = sc.nextDouble();
        double segundaNota = sc.nextDouble();

        double media = ((3.5 * primeiraNota) + (7.5 * segundaNota)) / 11;

        String stringFormatada = String.format("%.5f", media);

        System.out.println("MEDIA = " + stringFormatada);

        sc.close();

    }
}
