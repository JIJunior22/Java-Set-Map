package me.dio.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueMap;

    //Contrutor
    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }

    //Metodos
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueMap.put(cod, new Produto(nome, preco, quantidade));

    }

    public void exibirProdutos() {
        System.out.println(estoqueMap);
    }

    public double calcularValorEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();

            }

        }

        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                if(p.getPreco()>maiorPreco){
                    produtoMaisCaro=p;
                }

            }
        }
        return produtoMaisCaro;
    }
}

