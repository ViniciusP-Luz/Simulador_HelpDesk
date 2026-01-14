package InterfaceGrafica;


import Usuarios.Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaCliente {

    Cliente c1 = new Cliente("Luiza");

    public AreaCliente(){

        JFrame janela = new JFrame();
        janela.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(0,10,20,0);


        JTextField descricao  = new JTextField();
        descricao.setPreferredSize(new Dimension(150,20));

        JTextField mensagem  = new JTextField();
        mensagem.setPreferredSize(new Dimension(300,200));

        c.gridx = 0;
        c.gridy = 0;
        janela.add(new JLabel("Descrição"), c);

        c.gridx = 1;
        c.gridy = 0;
        janela.add(descricao, c);

        c.gridx = 0;
        c.gridy = 1;
        janela.add(new JLabel("Mensagem"), c);

        c.gridx = 1;
        c.gridy = 1;
        janela.add(mensagem, c);

        JButton registra = new JButton("Registra chamado");

        c.gridx = 0;
        c.gridy = 3;
        janela.add(registra,c);

        registra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c1.CriaTicket(descricao.getText(),mensagem.getText());
            }
        });

        janela.setBounds(500,0,500,500);
        janela.setVisible(true);

    }
}
