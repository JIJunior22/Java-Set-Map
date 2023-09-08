package me.dio.Set.Model.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;
    //Construtor


    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        this.contatoSet.add(new Contato(nome,numero));

    }
    public void exibirContato(){
        System.out.println(contatoSet);

    }
    public Set<Contato>pesquisaNome(String nome){
        //no novo set, a baixo, serão armazenados os nomes pesquisados
        Set<Contato>contatosPorNome=new HashSet<>();
        for(Contato c:contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);

            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNomeContato(String nome, int novoNumero){
        Contato contatoAtualizado=null;
        for(Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTel(novoNumero);
                contatoAtualizado=c;
                break;
            }
        }

        return contatoAtualizado;
    }
}
