package me.dio.Set.Model.Pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numeroTel;
    //Construtor

    public Contato(String nome, int numeroTel) {
        this.nome = nome;
        this.numeroTel = numeroTel;
    }
//    metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }
    //toString

    @Override
    public String toString() {
        return "== INFORMAÇÕES DO CONTATO ==" + "\n" +
                "Nome: " + nome + "\n" +
                "Numero de Telefone: " + numeroTel + "\n"
                + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
