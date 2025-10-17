import java.util.Locale;
import java.util.Scanner;

public class Condicao01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String idade2;

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        idade2 = (idade < 18) ? "Menor de idade " : "Maior de idade";
        System.out.println(idade2);
    }
}
