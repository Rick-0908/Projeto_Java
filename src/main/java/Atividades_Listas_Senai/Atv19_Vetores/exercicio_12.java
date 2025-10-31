package Atividades_Listas_Senai.Atv19_Vetores;

import java.util.Arrays;

public class exercicio_12 {
    static void main(String[] args) {
        int[] vetor= {1, 2, 3, 4, 5};
        System.out.println("Vetor original: "+ Arrays.toString(vetor));

        vetor[2]= 0;
        System.out.println("Vetor alterado: "+ Arrays.toString(vetor));
    }
}
