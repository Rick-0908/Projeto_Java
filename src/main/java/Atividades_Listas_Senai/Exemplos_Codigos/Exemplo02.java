package Atividades_Listas_Senai.Exemplos_Codigos;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os minutos para sabero o valor: ");
        int min =sc.nextInt();
        double conta = 50.0;
        if(min > 100){
            conta += (min - 100) * 2.0;
        }
        System.out.printf("O valor da conta é: R$ %.2f%n",conta);
    }
}
