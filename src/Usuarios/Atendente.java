package Usuarios;
import Tickets.Ticket;
import Repositories.TicketRepository;

import java.util.Map;
import java.util.Scanner;

public class Atendente extends Usuario{

    TicketRepository ticketRepository = new TicketRepository();
    Scanner scan = new Scanner(System.in);
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

    public void pegatickets(int idTicket,int prioridade){
            ticketRepository.getTicket(idTicket).setResponsavel(getIdUsuario(),this.nome);
            System.out.println(ticketRepository.getTicket(idTicket));
            ticketRepository.getTicket(idTicket).setPrioridade(prioridade);

    }

}
