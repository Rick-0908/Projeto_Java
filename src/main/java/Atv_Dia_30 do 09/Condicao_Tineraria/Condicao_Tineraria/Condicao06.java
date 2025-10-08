import java.util.Locale;
import java.util.Scanner;

public class Condicao06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String resultado;
        System.out.println("Digite sua IDADE");
        int n1 = sc.nextInt();

        resultado = (n1 < 7) ? "Reprovado" : "Aprovado";
        System.out.println(resultado);
    }
}
