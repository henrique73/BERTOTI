import Singleton.User;
import Singleton.UserObserver;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View implements ActionListener, UserObserver {
    private controllerInterface controller;
    private User user;
    private String precoGoogle = "8";
    private String precoAmazon = "9";
    private String precoFacebook = "6";

    private double userAmmount = 0;
    private double userLimit= 0;

    JFrame frame;
    JPanel panelBotoes;
    JPanel panelDados;
    JPanel panelComprar;
    JPanel panelMetodoPagamento;
    JPanel userAmmountPanel;
    JPanel panelGoogle;
    JPanel panelAmazon;
    JPanel panelFacebook;
    JLabel labelGoogle;
    JLabel labelAmazon;
    JLabel labelFacebook;
    JLabel GoogleText;
    JLabel AmazonText;
    JLabel labelAmmount;
    JLabel labelLimit;
    JLabel FacebookText;
    JLabel labelAmmountText;
    JLabel labelLimitText;

    JButton comprarGoogle;
    JButton comprarAmazon;
    JButton comprarFacebook;

    JButton selectDebit;
    JButton selectCredit;

    public View(User user,controllerInterface co) {
        this.user = user;
        this.controller = co;
    }

    public void createView(){
        frame = new JFrame("Mercado de Acoes");
        panelBotoes = new JPanel();
        panelComprar = new JPanel();
        panelMetodoPagamento = new JPanel();
        userAmmountPanel = new JPanel();
        panelDados = new JPanel();
        panelGoogle = new JPanel();
        panelAmazon = new JPanel();
        panelFacebook = new JPanel();
        labelGoogle = new JLabel();
        labelAmazon = new JLabel();
        labelFacebook = new JLabel();
        GoogleText = new JLabel("Preco Google");
        AmazonText = new JLabel("Preco Amazon");
        FacebookText = new JLabel("Preco Facebook");

        labelAmmountText = new JLabel("Debito:");
        labelLimitText = new JLabel("Limite:");
        labelAmmount = new JLabel();
        labelLimit = new JLabel();

        comprarGoogle = new JButton("Comprar Acoes da Google");
        comprarAmazon = new JButton("Comprar Acoes da Amazon");
        comprarFacebook = new JButton("Comprar Acoes da Facebook");

        selectDebit = new JButton("Selecionar Debito");
        selectCredit = new JButton("Selecionar Credito");

        comprarGoogle.addActionListener(this);
        comprarAmazon.addActionListener(this);
        comprarFacebook.addActionListener(this);
        selectDebit.addActionListener(this);
        selectCredit.addActionListener(this);

        panelGoogle.add(GoogleText);
        panelGoogle.add(labelGoogle);
        panelAmazon.add(AmazonText);
        panelAmazon.add(labelAmazon);
        panelFacebook.add(FacebookText);
        panelFacebook.add(labelFacebook);

        userAmmountPanel.add(labelAmmountText);
        userAmmountPanel.add(labelAmmount);
        userAmmountPanel.add(labelLimitText);
        userAmmountPanel.add(labelLimit);

        panelDados.add(panelGoogle);
        panelDados.add(panelAmazon);
        panelDados.add(panelFacebook);

        panelComprar.add(comprarGoogle);
        panelComprar.add(comprarAmazon);
        panelComprar.add(comprarFacebook);

        panelMetodoPagamento.add(selectCredit);
        panelMetodoPagamento.add(selectDebit);
        panelMetodoPagamento.add(userAmmountPanel);

        frame.getContentPane().add(BorderLayout.EAST, panelMetodoPagamento);
        frame.getContentPane().add(BorderLayout.NORTH, panelComprar);
        frame.getContentPane().add(BorderLayout.SOUTH, panelBotoes);
        frame.getContentPane().add(BorderLayout.CENTER, panelDados);


        labelGoogle.setText(precoGoogle);
        labelAmazon.setText(precoAmazon);
        labelFacebook.setText(precoFacebook);

        labelAmmount.setText(String.valueOf(userAmmount));
        labelLimit.setText(String.valueOf(userLimit));


        frame.setSize(900, 150);
        frame.setVisible(true);
        updateUser(user.getAmmount(), user.getLimit());
    }

    public void updateUser(double saldo, double limit) {
        labelAmmount.setText(String.valueOf(saldo));
        labelLimit.setText(String.valueOf(limit));
    }


    public void desabilitarBotaoDebito(){
        selectDebit.setEnabled(false);
    }

    public void desabilitarBotaoCredito(){
        selectCredit.setEnabled(false);
    }

    public void habilitarBotaoDebito(){
        selectDebit.setEnabled(true);
    }

    public void habilitarBotaoCredito(){
        selectCredit.setEnabled(true);
    }

    public void actionPerformed(ActionEvent event){
        if (event.getSource() == comprarGoogle){
            controller.comprarGoogle(Double.parseDouble(precoGoogle));
        }
        if (event.getSource() == comprarAmazon){
            controller.comprarAmazon(Double.parseDouble(precoAmazon));
        }
        if (event.getSource() == comprarFacebook){
            controller.comprarFacebook(Double.parseDouble(precoFacebook));
        }
        if (event.getSource() == selectDebit){
            controller.selectDebit();
        }
        if (event.getSource() == selectCredit){
            controller.selectCredit();
        }
    }
}