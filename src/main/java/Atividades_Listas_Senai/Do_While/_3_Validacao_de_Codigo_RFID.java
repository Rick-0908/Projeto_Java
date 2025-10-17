package Atividades_Listas_Senai.Do_While;

import java.util.Locale;
import java.util.Scanner;

public class _3_Validacao_de_Codigo_RFID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        String alfanumerico;

        /*RFID, sigla para "Radio Frequency Identification" (Identificação por Radiofrequência)
        , é uma tecnologia que usa ondas de rádio para identificar e rastrear objetos.*/
        do {
            System.out.println("Digite seu codigo alfanúmerico");
            alfanumerico = sc.nextLine();
        }while (alfanumerico.length() != 8);
        System.out.println("Codigo aceito");
    }
}
