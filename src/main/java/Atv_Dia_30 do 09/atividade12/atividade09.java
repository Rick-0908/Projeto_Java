package atividade12;
import java.util.Scanner;
public class atividade09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite quantos anos você tem:");
        double anos= sc.nextDouble();
        double resultado=anos*12;
        System.out.println("A sua idade em mses e:"+resultado);
    }
}
