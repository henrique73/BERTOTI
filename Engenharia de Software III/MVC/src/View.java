import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View implements ActionListener, Observer {
    private Subject model;
    private controllerInterface controller;
    private String precoGoogle = "0";
    private String precoAmazon = "0";
    private String precoFacebook = "0";

    JFrame frame;
    JPanel panelBotoes;
    JPanel panelDados;
    JPanel panelGoogle;
    JPanel panelAmazon;
    JPanel panelFacebook;
    JLabel labelGoogle;
    JLabel labelAmazon;
    JLabel labelFacebook;
    JLabel GoogleText;
    JLabel AmazonText;
    JLabel FacebookText;
    JButton conectar;
    JButton desconectar;

    public View(Subject mo, controllerInterface co) {
        this.model = mo;
        this.controller = co;
    }


    public void createView(){

        frame = new JFrame("Mercado de Acoes");
        panelBotoes = new JPanel();
        panelDados = new JPanel();
        panelGoogle = new JPanel();
        panelAmazon = new JPanel();
        panelFacebook = new JPanel();
        conectar = new JButton("Conectar Mercado");
        desconectar = new JButton("Desconectar");
        labelGoogle = new JLabel();
        labelAmazon = new JLabel();
        labelFacebook = new JLabel();
        GoogleText = new JLabel("Preco Google");
        AmazonText = new JLabel("Preco Amazon");
        FacebookText = new JLabel("Preco Facebook");


        conectar.addActionListener(this);
        desconectar.addActionListener(this);

        panelBotoes.add(conectar);
        panelBotoes.add(desconectar);
        panelGoogle.add(GoogleText);
        panelGoogle.add(labelGoogle);
        panelAmazon.add(AmazonText);
        panelAmazon.add(labelAmazon);
        panelFacebook.add(FacebookText);
        panelFacebook.add(labelFacebook);
        panelDados.add(panelGoogle);
        panelDados.add(panelAmazon);
        panelDados.add(panelFacebook);
        frame.getContentPane().add(BorderLayout.SOUTH, panelBotoes);
        frame.getContentPane().add(BorderLayout.CENTER, panelDados);

        labelGoogle.setText(precoGoogle);
        labelAmazon.setText(precoAmazon);
        labelFacebook.setText(precoFacebook);


        frame.setSize(300, 150);
        frame.setVisible(true);

    }

    public void update(String google, String amazon, String facebook) {
        precoGoogle = google;
        precoAmazon = amazon;
        precoFacebook = facebook;

        display();
    }

    public void display() {

        labelGoogle.setText(precoGoogle);
        labelAmazon.setText(precoAmazon);
        labelFacebook.setText(precoFacebook);

    }

    public void habilitarBotaoConectar(){

        conectar.setEnabled(true);

    }

    public void desabilitarBotaoConectar(){

        conectar.setEnabled(false);

    }


    public void habilitarBotaoDesconectar(){

        desconectar.setEnabled(true);

    }

    public void desabilitarBotaoDesconectar(){

        desconectar.setEnabled(false);

    }

    public void actionPerformed(ActionEvent event){
        if (event.getSource() == conectar){
            controller.conectar();
        }
        if (event.getSource() == desconectar){
            controller.desconectar();
        }
    }
}