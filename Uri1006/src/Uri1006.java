import java.util.Locale;
import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, media;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        media = ((a * 2) + (b * 3) + (c * 5)) / 10;

        String stringFormatada = String.format("%.1f", media);

        System.out.println("MEDIA = " + stringFormatada);
        sc.close();
    }
}
