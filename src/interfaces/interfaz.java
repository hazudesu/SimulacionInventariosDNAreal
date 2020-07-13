package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class interfaz {

    private JButton continuarButton;
    private JPanel panel1;

    //Casillas del formulario
    private JTextField d1;
    private JTextField d2;
    private JTextField d4;
    private JTextField d3;
    private JTextField d5;
    private JTextField d6;
    private JTextField d7;
    private JTextField d8;
    private JTextField d9;
    private JTextField d10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JTextField textField16;
    private JTextField textField17;
    private JTextField textField18;
    private JTextField textField19;
    private JTextField textField20;
    private JTextField textField21;
    private JTextField textField22;
    private JTextField textField23;
    private JTextField textField24;
    private JTextField textField25;
    private JTextField textField26;
    private JTextField textField27;
    private JTextField textField28;
    private JTextField textField29;
    private JTextField textField30;
    private JTextField textField31;
    private JTextField textField32;
    private JTextField textField33;
    private JTextField textField34;
    private JTextField textField35;
    private JTextField textField36;
    private JTextField textField37;
    private JTextField textField38;
    private JTextField textField39;
    private JTextField textField40;
    private JTextField textField41;
    private JTextField textField42;
    private JTextField textField43;
    private JTextField textField44;

    int arrayd[];
    String hola;

    public interfaz() {

        continuarButton.setEnabled(false);

        continuarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //arrayd[0] = 1;
                //arrayd[1] = 2;
                tabla tablas = new tabla();

                tablas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                tablas.setSize(3000,500);
                tablas.setVisible(true);
                tablas.setLocationRelativeTo(null);
                tablas.setTitle("My first java table");

                //JOptionPane.showMessageDialog(null, " Aguantalo Menor ");

                //System.out.println(arrayd);


            }
        });

        d1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9')
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar(d1);
            }
        });
        d2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9')
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar(d2);
            }
        });
        d3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9')
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar(d3);
            }
        });
        d4.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9')
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar(d4);
            }
        });
        d5.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9')
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar(d5);
            }
        });
        d6.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9')
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar(d6);
            }
        });
        d7.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9')
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar(d7);
            }
        });
        d8.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9')
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar(d8);
            }
        });
        d9.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9')
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar(d9);
            }
        });
        d10.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if ( c < '0' || c >'9')
                    e.consume();
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                validar(d10);
            }
        });

    }


    public void validar(JTextField d){
        if(d.getText().isEmpty()) {
            d.setBackground(Color.white);
        }else
            d.setBackground(Color.green);

        if(!(d1.getText().isEmpty() || d2.getText().isEmpty() || d3.getText().isEmpty() || d4.getText().isEmpty() || d5.getText().isEmpty() ||
                d6.getText().isEmpty() || d7.getText().isEmpty() || d8.getText().isEmpty() || d9.getText().isEmpty() || d10.getText().isEmpty()))
            continuarButton.setEnabled(true);
    }


    public static void main(String[] args) {
        int array1[];

        JFrame proyectoIO = new JFrame("Proyecto IO");

        proyectoIO.setContentPane(new interfaz().panel1);
        proyectoIO.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        proyectoIO.pack();
        proyectoIO.setVisible(true);
        proyectoIO.setLocationRelativeTo(null);
        System.out.println('a');


    }
}
