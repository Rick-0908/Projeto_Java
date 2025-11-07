package Atividades_Listas_Senai.Modularização.ClassificadorDeidade;

public class ClassificadorIdade {

    int idadeUsuario;

    public String VerificarIdade(){
        if (idadeUsuario <=11){
            return "Infantil";
        }else if (idadeUsuario <=17){
            return "Adolescente";
        }else if (idadeUsuario <=64){
            return "Adulto";
        }else if (idadeUsuario <= 122){
            return "idoso";
        }else {
            return "Ou tu bateu o recorde, ou tu ta morto logo DEFUNTO";
        }
    }
}
