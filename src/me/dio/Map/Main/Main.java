package me.dio.Map.Main;

import me.dio.Map.OperacoesBasicas.AgendaContatos;
import me.dio.Map.OperacoesBasicas.AgendarEvento;
import me.dio.Map.OperacoesBasicas.EstoqueProdutos;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
//        AgendaContatos agenda=new AgendaContatos();
//        agenda.adicionarContato("Junior",34801254);
//
//        System.out.println(agenda.pesquisarPorNome("Luke"));
//        agenda.exibirContato();
//        agenda.removerContato("Junior");
//        agenda.exibirContato();

//        EstoqueProdutos produto=new EstoqueProdutos();
//        produto.adicionarProduto(25,"Computador",5,3.690);
//        produto.adicionarProduto(22,"Cadeira Gamer",5,799.99);
////        produto.exibirProdutos();
//        System.out.println(produto.obterProdutoMaisCaro());
        AgendarEvento evento=new AgendarEvento();
        evento.adicionarEvento(LocalDate.of(
                2023,
                Month.SEPTEMBER,
                9),
                "Jogo",
                "Corinthians");
        evento.adicionarEvento(LocalDate.of(
                2023,
                12,
                22),
                "Birthday",
                "Party");

        evento.exibirEvento();


    }
}
