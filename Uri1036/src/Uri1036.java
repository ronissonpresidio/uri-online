import java.util.Locale;
import java.util.Scanner;

public class Uri1036 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String[] valores;
        double a, b, c, delta, r1 = 0, r2 = 0;

        valores = sc.nextLine().split(" ");

        a = Double.parseDouble(valores[0]);
        b = Double.parseDouble(valores[1]);
        c = Double.parseDouble(valores[2]);

        if (a != 0) {
            delta = Math.pow(b, 2) - (4 * a * c);
            if (delta >= 0) {
                r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
                r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

                String ValorR1Formatado = String.format("%.5f", r1);
                String ValorR2Formatado = String.format("%.5f", r2);

                System.out.println("R1 = " + ValorR1Formatado);
                System.out.println("R2 = " + ValorR2Formatado);
            } else {
                System.out.println("Impossivel calcular");
            }
        } else {

            System.out.println("Impossivel calcular");
        }
        sc.close();
    }
}