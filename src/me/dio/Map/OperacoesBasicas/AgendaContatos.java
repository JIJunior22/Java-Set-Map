package me.dio.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String,Integer>agendaMap;

    //Construtor


    public AgendaContatos() {
        this.agendaMap = new HashMap<>();


    }
    //Metodo
    public void adicionarContato(String nome,Integer telefone){
        agendaMap.put(nome,telefone);

    }
    public void removerContato(String nome){
        if(!agendaMap.isEmpty()){
            agendaMap.remove(nome);
        }
    }
    public void exibirContato(){
        System.out.println(agendaMap);
    }
    public int pesquisarPorNome(String nome){
       Integer numeroPornome=null;
       if(!agendaMap.isEmpty()){
           numeroPornome=agendaMap.get(nome);
       }
        return numeroPornome;
    }
}
