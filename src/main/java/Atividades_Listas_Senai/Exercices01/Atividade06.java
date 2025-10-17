import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double valor = sc.nextDouble();
        System.out.println("Digite o valor do juros: ");
        double juros = sc.nextInt();

        double resultado = valor * (juros/100);
        System.out.printf("O rendimento por mês foi: R$ %.2f%n" ,resultado);
    }
}
