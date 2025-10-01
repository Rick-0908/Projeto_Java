import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantas horas para a conversão: ");
        int n1 = sc.nextInt();
        int resultado = n1 * 60;

        System.out.println("A conversão deu: " +resultado + " Minutos");
    }
}
