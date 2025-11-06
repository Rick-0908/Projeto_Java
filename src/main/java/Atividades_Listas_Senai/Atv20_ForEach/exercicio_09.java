package Atividades_Listas_Senai.Atv20_ForEach;

import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os e-mails separados por vírgula: ");
        String emailUsuario = sc.nextLine();

        String [] armazenamentoEmail = emailUsuario.split(",");
        System.out.println("\nTodos os e-mails:");
        for(String email : armazenamentoEmail){
            String emailLimpo = email.trim().toLowerCase();
            System.out.println(emailLimpo);
        }
        System.out.println("Emails unicos: ");
        String [] armazenamentoEmailUnico = new  String [armazenamentoEmail.length];
        int contador = 0;
        for (String email : armazenamentoEmail){
            String emailLimpo = email.trim().toLowerCase();
            boolean jaExiste = false;
            for(int i = 0; i < contador; i++){
                if(armazenamentoEmailUnico[i].equals(emailLimpo)){
                    jaExiste = true;
                    break;
                }
            }
            if(!jaExiste){
                armazenamentoEmailUnico[contador] = email;
                contador++;
            }
        }
        for(int i = 0; i < contador; i++){
            System.out.println(armazenamentoEmailUnico[i]);
        }
        sc.close();
    }
}
