import java.util.Locale;
import java.util.Scanner;

public class Uri1012 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
        String[] medidas;

        Scanner sc = new Scanner(System.in);

        medidas = sc.nextLine().split(" ");

        a = Double.parseDouble(medidas[0]);
        b = Double.parseDouble(medidas[1]);
        c = Double.parseDouble(medidas[2]);

        triangulo = (a * c) / 2;
        circulo = 3.14159 * Math.pow(c, 2);
        trapezio = ((a + b) * c) / 2;
        quadrado = b * b;
        retangulo = a * b;

        String trianguloFormatado = String.format("%.3f", triangulo);
        String circuloFormatado = String.format("%.3f", circulo);
        String trapezioFormatado = String.format("%.3f", trapezio);
        String quadradoFormatado = String.format("%.3f", quadrado);
        String retanguloFormatado = String.format("%.3f", retangulo);

        System.out.println("TRIANGULO: " + trianguloFormatado);
        System.out.println("CIRCULO: " + circuloFormatado);
        System.out.println("TRAPEZIO: " + trapezioFormatado);
        System.out.println("QUADRADO: " + quadradoFormatado);
        System.out.println("RETANGULO: " + retanguloFormatado);

        sc.close();
    }
}
