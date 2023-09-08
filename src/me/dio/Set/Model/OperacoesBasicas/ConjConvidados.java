package me.dio.Set.Model.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjConvidados {
    //Atributo
    private Set<Convidado> convidadoSet;

    //Construtor


    public ConjConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    //metodo
    public void adicionarConvidado(String nome, int codConvite){
        convidadoSet.add(new Convidado(nome,codConvite));
    }
    public void removerConvidadoPorCod(int codConvite){
        Convidado convidadoRemover=null;
        for(Convidado c:convidadoSet){
            if(c.getCodConvite()==codConvite){
                convidadoRemover=c;
                break;
            }else{
                System.out.println("Código inexistente!");
            }
        }
        convidadoSet.remove(convidadoRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
}
