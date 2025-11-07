package Atividades_Listas_Senai.Modularização.CalculadoraDeFatorial;

public class CalculadoraFatorial {
    int numeroUsuario;

    public int fatorialCalculo(){
        int fatorial = 1;
        int numero = numeroUsuario;
        while(numero > 0){
            fatorial = fatorial * numero;
            numero--;
        }
        return fatorial;
    }
}
