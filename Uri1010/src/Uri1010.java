import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int codigoPeca1, codigoPeca2, quantidadePeca1, quantidadePeca2;
        double valorPeca1, valorPeca2, valorTotal;
        String[] peca1, peca2;

        peca1 = sc.nextLine().split(" ");
        codigoPeca1 = Integer.parseInt(peca1[0]);
        quantidadePeca1 = Integer.parseInt(peca1[1]);
        valorPeca1 = Double.parseDouble(peca1[2]);

        peca2 = sc.nextLine().split(" ");
        codigoPeca2 = Integer.parseInt(peca2[0]);
        quantidadePeca2 = Integer.parseInt(peca2[1]);
        valorPeca2 = Double.parseDouble(peca2[2]);

        valorTotal = (quantidadePeca1 * valorPeca1) + (quantidadePeca2 * valorPeca2);

        String valorFormatado = String.format("%.2f", valorTotal);

        System.out.println("VALOR A PAGAR: R$ " + valorFormatado);

        sc.close();

    }
}
