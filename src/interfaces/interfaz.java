package interfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfaz {
    private JButton continuarButton;
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
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


    public interfaz() {
        continuarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, " Aguantalo Menor ");
            }
        });
    }

    public static void main(String[] args) {
        JFrame proyectoIO = new JFrame("Proyecto IO");

        proyectoIO.setContentPane(new interfaz().panel1);
        proyectoIO.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        proyectoIO.pack();
        proyectoIO.setVisible(true);
        proyectoIO.setLocationRelativeTo(null);

    }
}
