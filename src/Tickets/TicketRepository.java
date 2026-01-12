package Tickets;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TicketRepository {

    static Map<Integer, Ticket> HashTickets = new HashMap<>();

    public static void adcionaTicketHash(Ticket ticket){
        HashTickets.put(ticket.getId(),ticket);
    }

    public Ticket getTicket(int idTicket){
        return(HashTickets.get(idTicket));
    }

    public  Map<Integer, Ticket> getHash(){
        return HashTickets;
    }
}
