package ATIVIDADE_11_JAVA;
import java.util.Scanner;
public class atividade2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Qual e o estado do lote?");
        String estado= sc.next();
        if (estado=="aprovado"){
            System.out.println("O lote está aprovado");
        }
        else if (estado=="aprovado"){
            System.out.println("O lote está reprovado");
        }
        else if (estado=="retrabalhado"){
            System.out.println("O lote está retrabalho");
        }
    }
}
