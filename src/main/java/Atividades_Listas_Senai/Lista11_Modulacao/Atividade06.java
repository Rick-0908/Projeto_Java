package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Random;
import java.util.Scanner;


public class Atividade06 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("==================================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("==================================================");
        sc.nextLine();
        String resp01;
        do {
            int distancia = rand.nextInt(25);
            String resultado = calcFreios(distancia);
            System.out.println("==================================================");
            System.out.println("A velocidade é: " + distancia + "M " +  resultado);
            System.out.println("Deseja fazer novamente ?");
            System.out.println("==================================================");
            resp01 = sc.nextLine();
        }while (resp01.equalsIgnoreCase("Sim"));
        System.out.println("==================================================");
        System.out.println("Sistema encerrado...");
        System.out.println("==================================================");
        sc.close();
    }
    public static String calcFreios (int velocidade){
        String mensagem;
        if (velocidade > 0 && velocidade < 5){
            mensagem = "Freie imediantamente";
        } else if (velocidade >= 5 && velocidade < 15) {
            mensagem = "Reduza a velocidade";
        } else if (velocidade >= 15 && velocidade < 20) {
            mensagem = "Aumente a velocidade";
        }else if (velocidade == 0){
            mensagem = "O carro está parado";
        } else if (velocidade < 0) {
            mensagem = "Velocidade não pode ser menor que 0,digite novamente";
        }else {
            mensagem = "Velocidade acima do esperado";
        }
        return mensagem;
    }
}
