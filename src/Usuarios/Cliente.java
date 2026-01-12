package Usuarios;
import Tickets.Ticket;

public class Cliente extends Usuario {

    public Cliente(String nome) {
        super(nome);
    }

    private void CriaTicket(int prioridade,String descricao,String mensagem) {

        Ticket tickets = new Ticket(this.idUsuario,prioridade,descricao,mensagem);
    }

}