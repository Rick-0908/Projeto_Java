package Atividades_Listas_Senai.Modularização.ClassificadorDeidade;

import java.util.Scanner;

public class idadeUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClassificadorIdade classe = new ClassificadorIdade();

        System.out.println("Digite sua idade");
        classe.idadeUsuario = sc.nextInt();

        System.out.println("Sua idade é: " + classe.idadeUsuario + " logo: " +classe.VerificarIdade());
    }
}
