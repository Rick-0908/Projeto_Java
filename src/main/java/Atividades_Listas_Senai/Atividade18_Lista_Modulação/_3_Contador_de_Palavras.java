package Atividades_Listas_Senai.Atividade18_Lista_Modulação;

import java.util.Scanner;

public class _3_Contador_de_Palavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavraUsuario,msg,resp;
        do {
            System.out.println("Digite a sua frase para saber quantas letras ela tem: ");
            palavraUsuario = sc.nextLine();
            msg = "O total de palavras foi: ";contadorPalavra(palavraUsuario);
            System.out.println("Deseja fazer novamente (Sim/Não)?");
            resp = sc.nextLine();
        }while (resp.equalsIgnoreCase("Sim"));
        System.out.println("Sistema encerrando...");
        sc.close();
    }
    public static void contadorPalavra(String palavra){
        String[] letras = palavra.split("");

        for (String letra : letras){
            System.out.println(letra);
        }
        System.out.println("Total de letras na frase: " + letras.length);
    }
}