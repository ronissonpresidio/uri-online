import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeVendedor;
        Double salarioFixo, salarioFinal, montanteVendas;

        nomeVendedor = sc.nextLine();
        salarioFixo = sc.nextDouble();
        montanteVendas = sc.nextDouble();

        salarioFinal = ((montanteVendas / 100) * 15) + salarioFixo;

        String stringFormatada = String.format("%.2f", salarioFinal);

        System.out.println("TOTAL = R$ " + stringFormatada);

        sc.close();
    }
}
