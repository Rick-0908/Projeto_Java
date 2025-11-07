package Atividades_Listas_Senai.Modularização.CalculoDeJurosCompostos;

import java.util.Scanner;

public class numeroUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraJurosCompostos calcularJuros =  new CalculadoraJurosCompostos();

        System.out.println("Qual o valor do seu investimento ?");
        calcularJuros.capitalUsuario = sc.nextDouble();
        if (calcularJuros.capitalUsuario<=0){
            System.out.println("Você não possui capital");
            return;
        }
        System.out.println("Quanto tempo de invenstimento ?");
        calcularJuros.tempoInvenstimento = sc.nextInt();
        if (calcularJuros.tempoInvenstimento<=0){
            System.out.println("Não tem tempo para calcular");
            return;
        }
        System.out.println("Qual a taxa de juros ?");
        calcularJuros.taxaDeJurosUsuario = sc.nextDouble();
        if (calcularJuros.taxaDeJurosUsuario<=0){
            System.out.println("Não possui taxa");
            return;
        }


        System.out.printf("O seu Juros é de: %.2f%n" , calcularJuros.CalculoDeJurosCompostos());
    }
}
