package atividade12;
import java.util.Scanner;
public class atividade01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        double numero1= sc.nextDouble();
        System.out.println("Digite o segundo numero:");
        double numero2= sc.nextDouble();
        double soma = numero1+numero2;
        System.out.println("A soma dos numeros sera:"+soma);
    }
}
