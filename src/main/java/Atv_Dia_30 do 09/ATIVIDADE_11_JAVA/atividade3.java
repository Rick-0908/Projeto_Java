package ATIVIDADE_11_JAVA;
import java.util.Scanner;
public class atividade3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Qual é a porcentagem");
        double energia=sc.nextDouble();
        if (energia<30){
            System.out.println("Modo economico");
        }
        else if (energia<=70){
            System.out.println("Modo normal");
        }
        else;
        System.out.println("Modo turbo ativado");

    }
}
