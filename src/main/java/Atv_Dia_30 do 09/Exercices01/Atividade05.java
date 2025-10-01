import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite o lado do quadrado: ");
        double lado = sc.nextDouble();
        double area = lado * lado;
        double perimetro = 4 * area;

        System.out.println("A sua área é: " +area);
        System.out.println("O seu perimetro é: " +perimetro);

    }
}
