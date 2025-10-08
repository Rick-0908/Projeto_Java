import java.util.Locale;
import java.util.Scanner;

public class Condicao05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String resultado;
        System.out.println("Digite o número para saber se é impar ou par");
        int n1 = sc.nextInt();

        resultado = (n1 % 2 != 0) ? "Número IMPAR" : "Número PAR";
        System.out.println(resultado);
    }
}
