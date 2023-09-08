package me.dio.Set.Main;

import me.dio.Set.Model.OperacoesBasicas.ConjConvidados;
import me.dio.Set.Model.Ordenacao.CadastroProdutos;
import me.dio.Set.Model.Pesquisa.AgendaContatos;

public class Main {
    public static void main(String[] args) {
//        ConjConvidados conj=new ConjConvidados();
//        conj.adicionarConvidado("Junior",123);
//        conj.adicionarConvidado("Francisco",456);
//        conj.adicionarConvidado("Luke",789);
//        conj.adicionarConvidado("Amora",789);
//        conj.removerConvidadoPorCod(123);
//        System.out.println("Existem "+conj.contarConvidados()+ " convidado(s) dentro do Set");
//        conj.exibirConvidados();
//        AgendaContatos contato=new AgendaContatos();
//        contato.adicionarContato("Junior",96014906);
//        contato.adicionarContato("Francisco",91885232);
//        contato.adicionarContato("Luke",91998025);
//        contato.adicionarContato("Amora",88267043);
//        contato.adicionarContato("Amora Silvestre",4801254);
//        contato.atualizarNomeContato("Junior",98169056);
//        contato.pesquisaNome("Amora");
//        System.out.println(contato.pesquisaNome("Amora"));
//        contato.exibirContato();

        CadastroProdutos produtos=new CadastroProdutos();
        produtos.adicionarProduto(123,"Placa de vídeo",15,500.99);
        produtos.adicionarProduto(456,"SSD 480G",50,169.70);
        produtos.adicionarProduto(789,"Monitor 25",35,600);
        //Não aceita cadastro com mesmo codigo
        produtos.adicionarProduto(123,"Gabinete",20,38.85);

        System.out.println(produtos.exibirPorPreco());
//        System.out.println(produtos.exibirProdutoPorNome());


//        System.out.println(produtos.exibirProdutoPorNome());


    }
}