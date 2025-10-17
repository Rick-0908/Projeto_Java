package Desafios_Senai.Desafio.Desafio01;

import java.util.Scanner;

public class _8_Conversor_de_Base_Binaria_para_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aperte ENTER para comerçar");
        sc.nextLine();
        int n1, resto;
        char resp;
        do {
            System.out.println("Digite seu número decimal para converte-lo em bínario");
            n1 = sc.nextInt();
            String binario = ""; // variavel criada para receber um valor

            while (n1 > 0) {
                resto = n1 % 2; // aqui estásendo feito a divisão de n1 com o resto dela e por 2 logo sendo armazenada na variavel resto
                binario = resto + binario; // Adiciona o resto no início da string
                n1 = n1 / 2; //aqui n1 está sendo divido por 2
            }
            System.out.println(binario);//aparece o resultado final do calculo em binario
            sc.nextLine();
            System.out.println("Deseja converte-lo para número novamente? (s/n)?");
            String resp01 = sc.nextLine();
            if (resp01.equals("s")) {
                int decimal = 0;//variavel declarada para ser usada somente dentro do loop
                int potencia = 0;//variavel declarada para ser usada somente dentro do loop
                for (int i = binario.length() - 1; i >= 0; i--) {//aqui usamos o length para buscar letra por letra na palavra para ser alterada
                    char digitoChar = binario.charAt(i); //aqui criado um char para buscar letra por letra
                    int digito = digitoChar - '0'; // Converte '0' para 0, '1' para 1 e vai indo de '2' para 2 etc...

                    decimal += (int) (digito * Math.pow(2, potencia)); // calculo onde por receber falor double, mas transformando ele em inteiro
                                                                        //portanto multiplicando digito pela potencia logo 2, potencia que recebeu sua declaração lá encima
                    potencia++;//aqui vai somando o calculo do Math.pow e armazenando ele para terminar o calculo
                }
                System.out.println("Seu numero convertido foi: " +decimal);//Aqui mostra o numero convertido de binario para numero normal

            }
            System.out.println("Deseja fazer novamente (s/n)? ");
            resp = sc.next().charAt(0); // novamente o char resp, sendo utilizado para ver se o sistema continua ou não
        } while (resp != 'n');


    }
}
