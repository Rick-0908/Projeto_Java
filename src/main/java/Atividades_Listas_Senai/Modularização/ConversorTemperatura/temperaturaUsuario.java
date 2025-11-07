package Atividades_Listas_Senai.Modularização.ConversorTemperatura;

import java.util.Scanner;

public class temperaturaUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConversorTemperatura conv = new ConversorTemperatura();

        System.out.println("Digite a sua temperatura: ");
        conv.temperaturaUsuario = sc.nextDouble();
        sc.nextLine();
        System.out.println("Deseja converte-lá em Celsius (1) ou em Fahrenheit (2)");
        String respostaUsuario = sc.nextLine();
        String[] partes = respostaUsuario.split(" ");//Split usado para separar as partes do usuario
        String opcao = partes[0];//usado para pegar o 1 indice do usuario
        if (opcao.equalsIgnoreCase("Celsius") || opcao.equals("1")) {
            System.out.println(conv.conveterCelsius());
        }else if (opcao.equalsIgnoreCase("Fahrenheit")|| opcao.equals("2")) {
            System.out.println(conv.conveterFahrenheit());
        }
    }
}
