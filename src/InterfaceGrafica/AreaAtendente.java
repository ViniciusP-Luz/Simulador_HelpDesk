package InterfaceGrafica;

import Usuarios.Atendente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaAtendente {

    Atendente a1 = new Atendente("Vinicius");

    public AreaAtendente(){

        JFrame janela = new JFrame();

        janela.setLayout(new GridLayout(2,1));

        JPanel painelcima = new JPanel(new GridBagLayout());
        JPanel painelbaixo = new JPanel(new GridBagLayout());

        JButton OpenTickets = new JButton("CHAMADOS ABERTOS");
        OpenTickets.setPreferredSize(new Dimension(20,400));

        painelcima.add(OpenTickets);

        JButton GetTickets = new JButton("Pega Tickets");
        painelbaixo.add(GetTickets);
        JPanel interno = new JPanel(new GridBagLayout());

        JTextField idTicket = new JTextField();
        idTicket.setPreferredSize(new Dimension(150,20));
        JTextField prioridade  = new JTextField();
        prioridade.setPreferredSize(new Dimension(150,20));

        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(0,10,20,0);

        interno.add(new JLabel("ID: "),c);
        c.gridx =1;
        interno.add(idTicket,c);
        c.gridx =0;
        c.gridy =1;
        interno.add(new JLabel("PRIORIDADE: "),c);
        c.gridx =1;
        interno.add(prioridade,c);
        painelbaixo.add(interno);

        OpenTickets.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a1.OpenTickets();
            }
        });

        GetTickets.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a1.pegatickets(Integer.parseInt(idTicket.getText()),Integer.parseInt(prioridade.getText()));
            }
        });

        janela.add(painelcima);
        janela.add(painelbaixo);
        janela.setBounds(500,0,500,500);
        janela.setVisible(true);
    }
}
