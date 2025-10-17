import java.util.Locale;
import java.util.Scanner;

public class Condicao07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String resultado;
        System.out.println("Digite o seu sálario: R$");
        int salario = sc.nextInt();
        ;

        resultado = (salario > 5000) ? "Pagará 20% de imposto" : "Pagará 10% de imposto";
        System.out.println(resultado);
    }
}
