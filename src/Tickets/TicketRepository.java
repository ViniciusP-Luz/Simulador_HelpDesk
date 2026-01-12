package Tickets;
import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    Map<Integer, Ticket> HashTickets = new HashMap<>();

    public void adcionaTicketHash(Ticket ticket){
        HashTickets.put(ticket.getId(),ticket);
    }

    public Ticket getTicket(int idTicket){
        return(HashTickets.get(idTicket));
    }
}
