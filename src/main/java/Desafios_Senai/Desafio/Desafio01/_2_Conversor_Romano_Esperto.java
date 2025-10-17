package Desafios_Senai.Desafio.Desafio01;

import java.util.Scanner;

public class _2_Conversor_Romano_Esperto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 399: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 399) {
            System.out.println("Número fora do intervalo permitido (1 a 399).");
            scanner.close();
            return; // encerra o programa
        }

        String resultado = "";//precisa deste esoaço em string para imprimir o resultado convertido de intenger

        while (numero >= 100) {
            resultado += "C";
            numero -= 100;
        }

        if (numero >= 90) {
            resultado += "XC";
            numero -= 90;
        }

        if (numero >= 50) {
            resultado += "L";
            numero -= 50;
        }

        if (numero >= 40) {
            resultado += "XL";
            numero -= 40;
        }


        while (numero >= 10) {
            resultado += "X";
            numero -= 10;
        }

        if (numero == 9) {
            resultado += "IX";
            numero -= 9;
        }

        if (numero >= 5) {
            resultado += "V";
            numero -= 5;
        }

        if (numero == 4) {
            resultado += "IV";
            numero -= 4;
        }

        while (numero >= 1) {
            resultado += "I";
            numero -= 1;
        }

        System.out.println("Número romano: " + resultado);

        scanner.close();
    }
}


