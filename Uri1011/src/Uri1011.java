import java.util.Locale;
import java.util.Scanner;

public class Uri1011 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double raio, volume;

        raio = sc.nextDouble();

        volume = (4.0 / 3) * 3.14159 * Math.pow(raio, 3);

        String valorFormatado = String.format("%.3f", volume);

        System.out.println("VOLUME = " + valorFormatado);

        sc.close();
    }
}
