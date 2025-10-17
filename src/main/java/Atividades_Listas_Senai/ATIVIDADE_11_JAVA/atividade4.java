package ATIVIDADE_11_JAVA;
import java.util.Scanner;
public class atividade4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Qual e o seu cargo?");
        String permissao=sc.nextLine();
        if (permissao=="basico"){
            System.out.println("Acesso restrito");
        }
        else if (permissao=="supervisor"){
            System.out.println("Acesso parcial");
        }
        else if (permissao=="engenheiro"){
            System.out.println("Acesso total");
        }
        else;
        System.out.println("Cargo não reconhecido");

    }
}
