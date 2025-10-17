import java.util.Locale;
import java.util.Scanner;

public class Condicao16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String resultado;

        System.out.println("Digite seu numero para ver se é multipli de 5: ");
        int n1 = sc.nextInt();

        resultado = (n1 % 5 != 0) ? "Multiplo" : "Não multiplo";
        System.out.println(resultado);
    }
}
