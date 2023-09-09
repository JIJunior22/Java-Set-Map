package me.dio.Map.OperacoesBasicas;

public class Produto {
    //Atributos
    public String nome;
    private double preco;
    private int quantidade;

    //Construtor


    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    //Metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    //toString

    @Override
    public String toString() {
        return "Produto:" +"\n" +
                "Nome: " + nome + "\n" +
                "Preco: " + preco + "\n" +
                "Quantidade: " + quantidade + "\n";
    }
}
