package Atividades_Listas_Senai.Modularização.ContadorDePalavras;

public class ContadorPalavras {
    String fraseUsuario;

    public int conversor() {
        String[] frase = fraseUsuario.trim().split("[\\s!,?]+");

        int contador = 0;
        int index = 0;
        while (index < frase.length) {
            for (int i = 1; i < frase.length; i++) {
                if (Character.isLetter(frase[index].charAt(i))) {
                    contador++;
                    break;

                }
            }
            index++;
        }
        return contador;
    }
}