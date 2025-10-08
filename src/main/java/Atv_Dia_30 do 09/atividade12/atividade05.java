package atividade12;
import java.util.Scanner;
public class atividade05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite o valor do salário:");
        double salario=sc.nextDouble();
        double resutado= salario*0.10;
        System.out.println("O valor com 10% de desconto será:"+resutado);
    }
}
