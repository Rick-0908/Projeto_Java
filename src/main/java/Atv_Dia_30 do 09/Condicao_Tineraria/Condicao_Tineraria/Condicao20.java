import java.util.Locale;
import java.util.Scanner;

public class Condicao20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String resultado;

        System.out.println("Digite seu número INTEIRO para saber se ele é impar ou par: ");
        int n1 = sc.nextInt();
        resultado = (n1 % 2 != 0) ? "Seu número é impar" : "Seu número é par";
        System.out.println(resultado);
    }
}
