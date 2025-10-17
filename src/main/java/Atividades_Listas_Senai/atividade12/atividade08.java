package atividade12;
import java.util.Scanner;
public class atividade08 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Addicone o primeiro valor inteiro:");
        int numero1= sc.nextInt();
        System.out.println("Adicione o segundo valor:");
        int  numero2= sc.nextInt();
        int resultado= numero1/numero2;
        System.out.println("O resultado da divisão será:"+resultado);
        int resto= numero1%numero2;
        System.out.println("O resto da divisão será:"+resto);
}}
