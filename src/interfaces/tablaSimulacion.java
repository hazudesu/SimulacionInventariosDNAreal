package interfaces;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class tablaSimulacion{

    DefaultTableModel model = new DefaultTableModel();

    private JPanel panel1;
    private JTable table1;


    public tablaSimulacion(){

        model.addColumn("Dia");
        model.addColumn("Inv. Inic.");
        model.addColumn("No. Aleatorio para Demanda");
      //  model.addColumn("Demanda");
       // model.addColumn("Inv. Final");
      //  model.addColumn("Inv. Prom");
     //   model.addColumn("Faltante");
      //  model.addColumn("No. Orden");
      //  model.addColumn("No. Aleatorio para tiempo de entrega");
     //   model.addColumn("Tiempo de Entrega");
       // model.addColumn("No. Aleatorio para tiempo de espera");
       // model.addColumn("Tiempo de Espera");
        this.table1.setModel(model);

    }

    public static void main(String[] args) {

        JFrame proyectoIO = new JFrame("Proyecto IO");

        proyectoIO.setContentPane(new tablaSimulacion().panel1);
        proyectoIO.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        proyectoIO.pack();
        proyectoIO.setVisible(true);
        proyectoIO.setLocationRelativeTo(null);
        System.out.println('a');

    }

}
