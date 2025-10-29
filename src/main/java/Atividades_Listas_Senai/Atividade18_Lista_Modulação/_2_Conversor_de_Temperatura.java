package Atividades_Listas_Senai.Atividade18_Lista_Modulação;

import java.util.Scanner;

public class _2_Conversor_de_Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperatura;
        String resp,respFinal;
        do {
            System.out.println("Digite uma temperatura: ");
            temperatura = sc.nextDouble();
            sc.nextLine();
            System.out.println("Deseja converter para Celcius - (1) ou para Fahrenheit - (2) ?");
            resp = sc.nextLine();
            if (resp.equalsIgnoreCase("Celcius") || resp.equalsIgnoreCase("1")){
                System.out.println(conversorParaCelcius(temperatura));
            } else if (resp.equalsIgnoreCase("Fahrenheit") || resp.equalsIgnoreCase("2")) {
                System.out.println(conversorParaFahrenheit(temperatura));
            }else {
                System.out.println("Digite uma opção correta");
            }
            System.out.println("Deseja fazer novamente (Sim/Não) ?");
            respFinal = sc.nextLine();
        }while (respFinal.equalsIgnoreCase("Sim"));
        System.out.println("Sistema encerrando...");
        sc.close();

    }
    public static String conversorParaFahrenheit(double temp){
        double Fahrenheit = (temp * 9/5) + 32;
        return String.format("A temperatura em Fahrenheit foi: %.2f°F" ,Fahrenheit);
    }
    public static String conversorParaCelcius(double temp){
        double Celcius = (temp - 32) * 5/9;
        return String.format("A temperatura em Celcius foi: %.2f°F" ,Celcius);
    }
}