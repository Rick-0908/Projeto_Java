import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base maior: ");
        double base = sc.nextDouble();
        System.out.println("Digite a base MENOR: ");
        double baseM = sc.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();
        double resultado = (base + baseM)*altura;

        System.out.println("O seu resultado de área deu: " +resultado);
    }
}
