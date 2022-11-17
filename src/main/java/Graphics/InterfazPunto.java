package Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazPunto extends JFrame implements ActionListener {

    //Ventana
    InterfazPunto ventana = new InterfazPunto();

    //Panel Norte
    JPanel panelNorte = new JPanel();

    JLabel coorX1 = new JLabel("Coordenada X");
    JLabel coorX2 = new JLabel("Coordenada X");
    JLabel coorY1 = new JLabel("Coordenada Y");
    JLabel coorY2 = new JLabel("Coordenada Y");

    JTextField fieldX1 = new JTextField();
    JTextField fieldX2 = new JTextField();
    JTextField fieldY1 = new JTextField();
    JTextField fieldY2 = new JTextField();

    //Panel Central
    JPanel panelCentral = new JPanel();
    JTextField texto = new JTextField();


    //Panel Sur
    JPanel panelSur = new JPanel();
    JButton botonCalcular = new JButton("Calcular");
    JButton botonLimpiar = new JButton("Limpiar");

    //Puntos
    Punto p1 = new Punto();
    Punto p2 = new Punto();


    //añadiendo elementos y estableciendo layouts
    InterfazPunto(){
        setLayout(new BorderLayout());
        add(panelNorte, BorderLayout.NORTH);
        add(panelCentral, BorderLayout.CENTER);
        add(panelSur, BorderLayout.SOUTH);
        setLayout(new GridLayout(2,4));
        ventana.setSize(500,500);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelNorte.setLayout(new GridLayout(2,4));
        panelSur.setLayout(new GridLayout(1, 2));
        panelCentral.setBackground(Color.white);

        panelNorte.add(coorX1);
        panelNorte.add(fieldX1);
        panelNorte.add(coorY1);
        panelNorte.add(fieldY1);
        panelNorte.add(coorX2);
        panelNorte.add(fieldX2);
        panelNorte.add(coorY2);
        panelNorte.add(fieldY2);

        panelSur.add(botonCalcular);
        panelSur.add(botonLimpiar);

        //ActionEvent
        botonCalcular.addActionListener(new calcularDistanciaAction());

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public class calcularDistanciaAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Punto p1 = new Punto(coorX1.getX(), coorY1.getY());
            Punto p2 = new Punto(coorX2.getX(), coorY2.getY());
            p1.calcularDistancia(p2);
            texto.setText(String.valueOf(p1.calcularDistancia(p2)));
        }
    }

}
