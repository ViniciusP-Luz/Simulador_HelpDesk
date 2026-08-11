package Repositories;
import Tickets.Ticket;

import java.util.HashMap;
import java.util.Map;

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
