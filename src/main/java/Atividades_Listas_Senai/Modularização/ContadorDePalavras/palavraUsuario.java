package Atividades_Listas_Senai.Modularização.ContadorDePalavras;

import java.util.Scanner;

public class palavraUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContadorPalavras contar = new ContadorPalavras();

        System.out.println("Digite sua frase: ");
        contar.fraseUsuario = sc.nextLine();

        System.out.println("O total de palavras é: " + contar.conversor());
    }
}
