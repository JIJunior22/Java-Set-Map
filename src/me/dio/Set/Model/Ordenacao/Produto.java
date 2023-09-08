package me.dio.Set.Model.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    //Atributos
    private long codigo;
    private String nomeProduto;
    private double preco;
    private int quantidade;

    //Construtor

    public Produto(long codigo, String nomeProduto, double preco, int quantidade) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    //Comparable
    @Override
    public int compareTo(Produto p) {
        return nomeProduto.compareToIgnoreCase(p.getNomeProduto());
    }
    //Metodos especiais

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
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

    @Override
    public String toString() {
            return "== INFORMAÇÕES DO PRODUTO ==" +"\n"+
                "Codigo: " + codigo +"\n"+
                "Nome do Produto: " + nomeProduto +"\n"+
                "Preço: " + preco +"\n"+
                "Quantidade: " + quantidade+"\n"+
                    "==".repeat(15)+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo == produto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }



}
class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(),p2.getPreco());
    }
    //Para comparar com outros dados, seria necessario criar novas classes
}
