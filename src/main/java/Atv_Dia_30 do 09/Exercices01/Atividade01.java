import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade para saber quanto viveo: ");
        int n1 = sc.nextInt();
        int anos = (n1 * 365) ;
        System.out.println("O total de dias é: "+anos);

    }
}
