package Atividades_Listas_Senai.Modularização.ValidadorDeSenha;

public class ValidadorSenha {
    String senhaUsuario;

    public String ValidadorSenha() {

        char[] senha = senhaUsuario.toCharArray();

        if (senha.length < 8) {
            System.out.println("Senha com menos de 8 caracteres, INVALIDA !!");
        } else {

            boolean verificacaoMaiusculo = false;
            boolean verificacaoNumero = false;

            for (int i = 0; i < senha.length; i++) {
                char c = senha[i];
                if (Character.isUpperCase(c)) {
                    verificacaoMaiusculo = true;
                } else if (Character.isDigit(c)) {
                    verificacaoNumero = true;
                }

            }

            if (!verificacaoMaiusculo) {
                System.out.println("Sua senha deve contem pelo menos 1 letra maiuscula !!!");

            } else if (!verificacaoNumero) {
                System.out.println("Sua senha deve contem pelo menos 1 digito !!!!");

            }else {
                System.out.println("Sua senha coincide com os criterios !!!");
            }
        }
        return senhaUsuario;
    }
}
