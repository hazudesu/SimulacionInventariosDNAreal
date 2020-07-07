package interfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfaz {
    private JButton continuarButton;
    private JPanel panel1;


    public interfaz() {
        continuarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Hola Mundo");
            }
        });
    }

    public static void main(String[] args) {
        JFrame proyectoIO = new JFrame("Proyecto IO");

        proyectoIO.setContentPane(new interfaz().panel1);
        proyectoIO.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        proyectoIO.pack();
        proyectoIO.setVisible(true);

    }
}
