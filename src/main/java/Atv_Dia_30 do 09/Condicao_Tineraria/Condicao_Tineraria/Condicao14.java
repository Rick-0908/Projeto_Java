import java.util.Locale;
import java.util.Scanner;

public class Condicao14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String resultado;
        System.out.println("Digite sua nota");
        double n1 = sc.nextDouble();

        resultado = (n1 < 7) ? "Reprovado" : "Aprovado";
        System.out.println(resultado);
    }
}
