package interfaces;

import javax.swing.*;
import java.awt.*;

public class tabla extends JFrame {

    JTable tabla;

    public tabla(){
        setLayout(new FlowLayout());

        String [] columnName = {"Dia", "Inv. Inic.", "No. A Demanda","Demanda","Inv. Final","Inv. Prom","Faltante","No. Orden","No. A  tiempo de entrega",
                "Tiempo de Entrega", "No. A espera","Tiempo de Espera"};

        Object[][] data = {
                //{"1","50","20","Bill","Gates","20","Bill","Gates","20","Bill","Gates","20"},
                //{"Bill","Gates","20","Bill","Gates","20","Bill","Gates","20","Bill","Gates","20"},
                //{"Bill","Gates","20","Bill","Gates","20","Bill","Gates","20","Bill","Gates","20"},
                //{"Bill","Gates","20"},
        };

        tabla = new JTable(data,columnName);
        tabla.setPreferredScrollableViewportSize(new Dimension(1500,50));
        tabla.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(tabla);
        add(scrollPane);
    }


}
