package Usuarios;
import Tickets.Ticket;
import static Repositories.TicketRepository.adcionaTicketHash;

public class Cliente extends Usuario {

    public Cliente(String nome) {
        super(nome);
    }

    public void CriaTicket(String descricao,String mensagem) {

        Ticket tickets = new Ticket(this.getIdUsuario(),descricao,mensagem);
        adcionaTicketHash(tickets);
        System.out.println("CRIADO");
    }


}