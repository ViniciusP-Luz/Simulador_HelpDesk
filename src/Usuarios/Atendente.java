package Usuarios;

import Tickets.Ticket;
import Tickets.TicketRepository;

import java.util.Map;

public class Atendente extends Usuario{

    TicketRepository ticketRepository = new TicketRepository();

    public Atendente(String nome) {
        super(nome);
    }

    public void OpenTickets(){
            for(Map.Entry<Integer, Ticket>  ticketEntry : ticketRepository.getHash().entrySet()){
                if(ticketEntry.getValue().getResponsavel() == 0){
                    System.out.printf("Ticket %d aberto. Descrição %s \n",ticketEntry.getValue().getId(),ticketEntry.getValue().getDescricao());
                }
            }
        }

    public void pegatickets(int idTicket){
            ticketRepository.getTicket(idTicket).setResponsavel(getIdUsuario(),this.nome);
    }

}
