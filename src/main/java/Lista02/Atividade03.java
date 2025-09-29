package Lista02;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu valor de raio: ");
        double n1 = sc.nextDouble();
        double pi = 3.14;
        double area = pi*Math.pow(n1,2);

        System.out.println("O calculo da sua área é: " +area);
    }
}
