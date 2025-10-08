import java.util.Locale;
import java.util.Scanner;

public class Condicao19 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double resultado;

        System.out.println("Insira quantas horas trabalha: ");
        double n1 = sc.nextDouble();
        System.out.println("Quanto vocÊ ganha por hora ?: ");
        double n2 = sc.nextDouble();
        sc.nextLine();
        resultado = n1 * n2;
        String resultado02;
        resultado02 = (resultado < 2000) ? "Salário ruim" : "Salário bom";
        System.out.println("O seu salário é: " + resultado02 + " E seu total é: " + resultado);
    }
}
