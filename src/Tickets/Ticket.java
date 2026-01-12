package Tickets;

import Usuarios.UsuarioRepository;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ticket {
    final int idTicket;
    int requisitante;
    int prioridade;
    String descricao;
    ArrayList<String> mensagens = new ArrayList<>();
    UsuarioRepository usuarioRepository = new UsuarioRepository();
    LocalDate dataCriacao;
    String situacao;
    static int aux = 1;
    int responsavel;

    public Ticket(int requisitante, String descricao, String mensagem) {
        this.requisitante = requisitante;
        this.descricao = descricao;
        this.responsavel = 0;
        mensagens.add(mensagem);
        this.idTicket = aux;
        aux++;
        this.dataCriacao = LocalDate.now();

    }

    public int getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(int responsavel, String nome) {
        if(this.responsavel== 0) {
            this.responsavel = responsavel;
            System.out.printf("Agora o ticket %d, pertence ao atendente %s",this.idTicket,nome);
        }
        else System.out.println("Ticket pertence à outro atendente");

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
