package Tickets;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ticket {
    int idTicket;
    int requisitante;
    int prioridade;
    String descricao;
    ArrayList<String> mensagens = new ArrayList<>();
    LocalDate dataCriacao;
    String situacao;
    int aux = 1;
    int responsavel;

    public Ticket(int requisitante, int prioridade, String descricao, String mensagem) {
        this.requisitante = requisitante;
        this.prioridade = prioridade;
        this.descricao = descricao;
        mensagens.add(mensagem);
        this.idTicket = aux;
        aux+=1;
        this.dataCriacao = LocalDate.now();

    }

    public int getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(int responsavel) {
        if(this.responsavel != 0){
            //System.out.printf("O %S já é responsável por esse chamado",);
            return;
        }
        this.responsavel = responsavel;
    }

    public int getId() {
        return idTicket;
    }

    public int getRequisitante() {
        return requisitante;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public ArrayList<String> getMensagem() {
        return mensagens;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setRequisitante(int requisitante) {
        this.requisitante = requisitante;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public void setDescrição(String descricao) {
        this.descricao = descricao;
    }

    public void setMensagem(String mensagem) {
        mensagens.add(mensagem);
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}
