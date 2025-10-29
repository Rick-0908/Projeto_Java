package Atividades_Listas_Senai.Atividade18_Lista_Modulação;

import java.util.Scanner;

public class _5_Validador_de_Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;
        System.out.println("Digite sua senha para ser validada: ");
        senha = sc.nextLine();
        validacaoSenhas(senha);
    }
    public static void validacaoSenhas (String senha){
        boolean verificarMaiuscula = false;
        boolean verificarNumero = false;
        for (char c: senha.toCharArray()){
            if (Character.isUpperCase(c)) verificarMaiuscula = true;
            if (Character.isDigit(c)) verificarNumero = true;
        }
        if (senha.length() < 8){
            System.out.println("A senha possui menos que 8");
        } else if (!verificarMaiuscula) {
            System.out.println("A senha não possui uma letra em maisculo");
        } else if (!verificarNumero) {
            System.out.println("A senha não possui um número");
        }else {
            System.out.println("A senha coincide com todas as propostas devidas");
        }
    }
}
