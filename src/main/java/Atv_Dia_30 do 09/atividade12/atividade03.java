package atividade12;
import java.util.Scanner;
public class atividade03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite o valor do raio:");
        double raio = sc.nextDouble();
        double area= Math.pow(raio,2);
        System.out.println("A area da circuferencia sera:"+area);
    }
}
