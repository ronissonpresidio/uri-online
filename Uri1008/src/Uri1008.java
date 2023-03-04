import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario, horasTrabalhadas;
        double valorHora, salarioFinal;

        numeroFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorHora = sc.nextDouble();

        salarioFinal = horasTrabalhadas * valorHora;

        String valorFormatado = String.format("%.2f", salarioFinal);

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.println("SALARY = U$ " + valorFormatado);

        sc.close();

    }
}
