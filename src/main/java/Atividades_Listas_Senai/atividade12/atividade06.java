package atividade12;
import java.util.Scanner;
public class atividade06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite a temperatura em graus celcios:");
        double celcios=sc.nextDouble();
        double resultado=(celcios*9/5)+32;
        System.out.println("A temperatura converida emfahrenheit sera:"+resultado);
    }
}
