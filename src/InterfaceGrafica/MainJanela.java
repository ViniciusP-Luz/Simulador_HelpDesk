package InterfaceGrafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainJanela {

    JFrame janela = new JFrame();

    public MainJanela(){

        janela.setLayout(new GridLayout(2,1));

        JPanel painelTopo = new JPanel(new GridBagLayout());
        painelTopo.setBackground(Color.pink);

        JPanel painelbaixo = new JPanel(new GridBagLayout());
        painelbaixo.setBackground(Color.blue);

        //cria botões
        JButton botaocli = new JButton("Area do cliente");
        painelTopo.add(botaocli);
        botaocli.setPreferredSize(new Dimension(200,40));

        JButton botaoatd = new JButton("Area do Atendente");
        painelbaixo.add(botaoatd);
        botaoatd.setPreferredSize(new Dimension(200,40));


        janela.add(painelTopo);
        janela.add(painelbaixo);




        botaoatd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AreaAtendente();
            }
        });

        botaocli.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { new AreaCliente();}
        });

        //Encerra ao fechar
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setBounds(0,0,500,500);
        janela.setVisible(true);


    }


}
