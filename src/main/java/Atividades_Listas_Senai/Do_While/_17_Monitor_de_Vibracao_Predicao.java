package Atividades_Listas_Senai.Do_While;

import java.util.Scanner;

public class _17_Monitor_de_Vibracao_Predicao {
    static void main() {
        Scanner sc = new Scanner(System.in);


        /*RMS significa Raiz Média Quadrada e tem diferentes significados dependendo do contexto,
        sendo mais comum para indicar a potência contínua de um equipamento de som (potência real).*/
        System.out.println("Aperte ENTER para começar");
        sc.nextLine();

        double RMS;
        int leituras = 0, somaRMS = 0;
        do {
            System.out.println("Digite a leitura RMS: ");
            RMS = sc.nextDouble(); //armazenando o RMS logo o que o usuario digita

            if (RMS < 2.5){ // caso o usuario digite menor que 2.5 ele entrara neste if e somará o valor
                somaRMS++;
            }while (RMS < 2.5){ // logo entrará em um loop while para novamente ter um digito do usuario
                System.out.println("Digite o a leitura RMS: ");
                RMS = sc.nextDouble();
                somaRMS++; //Aqui será somado novamente o RMS
                leituras++; // aqui será contado uma leitura do RMS

                if (RMS >= 2.5){
                    somaRMS++; // caso for maior que 2.5 ele entrará neste IF para somar também
                } else if (somaRMS == 3) { // e se for igual a 3 ele para o sistema logo dando erro
                    break;
                }
            }
            leituras++;//aqui somando novamente cada leitura do usuario
        }while (somaRMS != 3); //se for diferente de 3 ele encerra o sistema
        System.out.println("Leituras TOTAS: " +leituras);
    }
}
