package Atividades_Listas_Senai.Modularização.ValidadorDeSenha;

import java.util.Scanner;

public class senhaUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidadorSenha validarSenha = new ValidadorSenha();

        System.out.println("Digite sua senha: ");
        validarSenha.senhaUsuario = sc.nextLine();

        System.out.println(validarSenha.ValidadorSenha());
    }
}
