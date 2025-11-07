package Atividades_Listas_Senai.Modularização.NumeroPrimo;

public class VerificadorPrimo {

    int numeroPrimoUsuario;

    public String verificarPrimo(){


        boolean IsPrimo = false;
        if (numeroPrimoUsuario == 2){
            IsPrimo = true;
        }else {
            for (int i = 2;i < numeroPrimoUsuario;i++){
                if (numeroPrimoUsuario%i==0){
                    IsPrimo = false;
                    break;
                }else  {
                    IsPrimo = true;

                }
            }
        }
        if (IsPrimo) {
            return "Primo";
        }else {
            return "Não é primo";
        }
    }
}
