package Usuarios;

import Tickets.Ticket;

public abstract class Usuario {

    private final int idUsuario;
    String nome;
    int aux = 1;
    int funcao; // 0 = Atendente; 1 = cliente;

    protected Usuario(String nome) {
        this.nome = nome;
        this.idUsuario = aux;
        aux+=1;

    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String Sendmensagem(Ticket ticket, String mensagem){
        ticket.setMensagem(mensagem);
        return("Mensagem adicionada com sucesso ");

    }

}
