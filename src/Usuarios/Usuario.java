package Usuarios;

import Tickets.Ticket;

public abstract class Usuario {

    private final int idUsuario;

    public String getNome() {
        return nome;
    }

    String nome;
    static int aux = 1;
    int funcao; // 0 = Atendente; 1 = cliente;

    protected Usuario(String nome) {
        this.nome = nome;
        this.idUsuario = aux;
        aux++;

    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String Sendmensagem(Ticket ticket, String mensagem){
        ticket.setMensagem(mensagem);
        return("Mensagem adicionada com sucesso ");

    }

}

