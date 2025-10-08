import java.util.Locale;
import java.util.Scanner;

public class Condicao15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String resultado;

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();
        resultado = (idade < 17) ? "Não pode votar" : "Pode votar";
        System.out.println(resultado);
    }
}
