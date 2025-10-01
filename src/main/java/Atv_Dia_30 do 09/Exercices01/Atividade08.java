import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra que iremos dividi-la em 3 parcelas : R$");
        double n1 = sc.nextDouble();
        double resultado = n1/3;
        System.out.println("A primeira parcela é: " +resultado);
        System.out.println("A segunda parcela é: " +resultado);
        System.out.println("A terceira parcela é: " +resultado);
    }
}
