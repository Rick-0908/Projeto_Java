package Atividades_Listas_Senai.Atividade18_Lista_Modulação;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _6_Calculadora_de_Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notaAluno = new ArrayList<Double>();
        double nota;
        String resp;
        do {
            System.out.println("Digite sua nota");
            nota = sc.nextInt();
            if (nota <= 0){
                System.out.println("Não pode ter nota -0 ou 0");
            }else {
                notaAluno.add(nota);
            }
            System.out.println("Deseja adiciona mais alguma nota ?");
            sc.nextLine();
            resp = sc.nextLine();
        }while (resp.equalsIgnoreCase("Sim"));
        System.out.println(calculadoraMedia(notaAluno));
    }
    public static String calculadoraMedia(List<Double> notaAluno){
        int size = notaAluno.size();
        String msg;
        double soma = 0;
        for (int i = 0; i < size; i++){
            soma += notaAluno.get(i);
        }
        double media = soma / size;
       msg = "A média deu: " +media;
       return msg;
    }
}
