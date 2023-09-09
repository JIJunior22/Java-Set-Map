package me.dio.Map.OperacoesBasicas;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendarEvento {
    private Map<LocalDate, Evento> eventoMap;

    //Construtor


    public AgendarEvento() {
        this.eventoMap = new HashMap<>();
    }

    //Metodos
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
//        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data,new Evento(nome,atracao));
    }

    public void exibirEvento() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void proximoEvento() {
        LocalDate data = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            if (entry.getKey().equals(data)||entry.getKey().isAfter(data) ){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("Proximo evento " + proximoEvento + " Acontecerá na data " + proximaData);
                break;
            }
        }
    }
}
