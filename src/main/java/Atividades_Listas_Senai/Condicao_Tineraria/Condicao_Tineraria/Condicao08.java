import java.util.Locale;
import java.util.Scanner;

public class Condicao08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String resultado;
        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        resultado = (idade < 12) ? "Infantil" : (idade <= 18) ? "Juvenil" : "Adulto";
        System.out.println(resultado);
    }
}
