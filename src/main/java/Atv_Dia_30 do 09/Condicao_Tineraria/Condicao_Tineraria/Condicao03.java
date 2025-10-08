import java.util.Locale;
import java.util.Scanner;

public class Condicao03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();
        String resultado;

        resultado = (idade < 16) ? "Você não pode votar" : "Você pode votar";
        System.out.println(resultado);
    }
}
