package atividade12;
import java.util.Scanner;
public class atividade07 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Adicione o numero de dias:");
        int dias= sc.nextInt();
        int resultado= dias*24;
        System.out.println("O valor convertido será:"+resultado);

    }
}
