package me.dio.Set.Model.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    //Atributos
    private String nome;
    private int codConvite;

    //Construtor


    public Convidado(String nome, int codConvite) {
        this.nome = nome;
        this.codConvite = codConvite;
    }
    //metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodConvite() {
        return codConvite;
    }

    public void setCodConvite(int codConvite) {
        this.codConvite = codConvite;
    }

    @Override
    public String toString() {
        return "  CONVIDADO" + "\n" +
                "Nome: " + nome + "\n" +
                "Código do convite: " + codConvite+"\n" +
                "--".repeat(10)+"\n";


    }
//Elimina elementos, por exemplo"códigos de convite", instaciados em duplicidade.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codConvite == convidado.codConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codConvite);
    }
}
