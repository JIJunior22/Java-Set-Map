package me.dio.Map.OperacoesBasicas;

public class Evento {
    private String nome;
    private String atracao;


    //Construtor

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    //Metodos especiais - getters


    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    //toString

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }
}
