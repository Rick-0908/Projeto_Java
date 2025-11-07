package Atividades_Listas_Senai.Modularização.CalculadoraSimples;

import java.util.Scanner;

public class numeroUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc =  new Calculadora();

        System.out.println("Digite o primeiro numero: ");
        calc.numeroA = sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        calc.numeroB = sc.nextDouble();

        System.out.println("Deseja fazer qual tipo de operação ? \n(+,-,*,/)\n(Adição,Subtração,Multiplicação,Divisão)");
        String operacao = sc.next();
        if (operacao.equalsIgnoreCase("+")|| operacao.equalsIgnoreCase("Adição")|| operacao.equalsIgnoreCase("Adicaoo")){
            System.out.println(calc.soma());
        }else if (operacao.equalsIgnoreCase("-")|| operacao.equalsIgnoreCase("Subtração")|| operacao.equalsIgnoreCase("Subtracao")) {
            System.out.println(calc.subtracao());
        }else if (operacao.equalsIgnoreCase("*")|| operacao.equalsIgnoreCase("Multiplicação")|| operacao.equalsIgnoreCase("Multiplicacao")){
            System.out.println(calc.multiplicacao());
        }else if (operacao.equalsIgnoreCase("/")|| operacao.equalsIgnoreCase("Divisão")|| operacao.equalsIgnoreCase("Divisao")){
            System.out.println(calc.divisao());
        }else{
            System.out.println("Digite um comando válido!!!");
        }
    }
}
