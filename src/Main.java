import Usuarios.Atendente;
import Usuarios.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Luiza");
        Atendente a1 = new Atendente("Vinicius");

        c1.CriaTicket("Problema pra acessar", "Não estou conseguido acessar o sistema pois está caino toda hora");

        a1.OpenTickets();

        a1.pegatickets(1);





    }
}
