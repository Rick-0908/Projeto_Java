package Atividades_Listas_Senai.Modularização.CalculadoraDeMedia;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraMedia{
    int notasAluno;
    double soma = 0;

    public double notasMedia(){
        if(soma == 0){
            return 0;
        }else {
            return soma / notasAluno;
        }

    }
}