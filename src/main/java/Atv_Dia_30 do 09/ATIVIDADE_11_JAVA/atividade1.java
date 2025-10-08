package ATIVIDADE_11_JAVA;
import java.util.Scanner;
public class atividade1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite 0 se frente está livre ou 1 se tem obstáculo: ");
        int frontal=sc.nextInt();
        System.out.println("Digite 0 se a direita está livre 1 se tem obstáculo: ");
        int direita=sc.nextInt();
        System.out.println("Digite 0 se a esquerda está livre 1 se tem obstáculo: ");
        int esquerda=sc.nextInt();
        if (frontal==0){
            System.out.println("O robô vai seguir em frente");
        }
        else if (direita==0){
            System.out.println("Digite 0 se a direita está livre 1 se tem obstáculo: ");
        }
        else if (esquerda==0){
            System.out.println("Digite 0 se a direita está livre 1 se tem obstáculo: ");}
        else;
        System.out.println("O robô está parado.");
        }
}


