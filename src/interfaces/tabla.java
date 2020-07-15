package interfaces;

import classes.outValues;
import javax.swing.*;
import java.awt.*;

public class tabla extends JFrame {

    JTable tabla;
    protected Object[][] data;
    protected String[] columnName = {"Dia", "Inv. Inic.", "No. A Demanda","Demanda","Inv. Final","Inv. Prom","Faltante","No. Orden","No. A  tiempo de entrega",
                "Tiempo de Entrega", "No. A espera","Tiempo de Espera"};
    protected int totalFilas=0;
    protected int conteoFilas=0; 
    
    public tabla(int timeAmount, int salidaLenght){
        setLayout(new FlowLayout());
        
        conteoFilas = 0;
        
        totalFilas = (timeAmount*salidaLenght)+(salidaLenght*4);
        System.out.println("num filas"+totalFilas);

        this.data = new Object[totalFilas][12];
        
                //{"1","50","20","40","60","20","80","70","20","40","80","20"},
                //{"Bill","Gates","20","Bill","Gates","20","Bill","Gates","20","Bill","Gates","20"},
                //{"Bill","Gates","20","Bill","Gates","20","Bill","Gates","20","Bill","Gates","20"},
                //{"Bill","Gates","20"},
        //};
        //System.out.println(data[0][2]);
    }
    
    public void vaciarOutValues(outValues salida){
            System.out.println(conteoFilas);
            
            
            //System.out.println(salida.toString());
            for(int i=0; i< salida.getDay().size(); i++){
                //System.out.println(salida.getInvInc().get(i));
                    //System.out.println(salida.toString());
                    this.data[conteoFilas][0] = salida.getDay().get(i);
                    this.data[conteoFilas][1] = salida.getInvInc().get(i);
                    this.data[conteoFilas][2] = salida.getDemandRandom().get(i);
                    this.data[conteoFilas][3] = salida.getDemand().get(i);
                    this.data[conteoFilas][4] = salida.getFinalInv().get(i);
                    this.data[conteoFilas][5] = salida.getInvProm().get(i);
                    this.data[conteoFilas][6] = salida.getRemain().get(i);
                    this.data[conteoFilas][7] = salida.getOrderNo().get(i);
                    this.data[conteoFilas][8] = salida.getDeliverRandom().get(i);
                    this.data[conteoFilas][9] = salida.getDeliverTime().get(i);
                    this.data[conteoFilas][10] = salida.getW8TimeRandom().get(i);
                    this.data[conteoFilas][11] = salida.getW8Time().get(i); 
                    conteoFilas++;
            }
            
            this.data[conteoFilas][0] = "QValue ="+salida.getQvalue();
            this.data[conteoFilas][1] = " ";
            this.data[conteoFilas][2] = " ";
            this.data[conteoFilas][3] = " ";
            this.data[conteoFilas][4] = " ";
            this.data[conteoFilas][5] = " ";
            this.data[conteoFilas][6] = " ";
            this.data[conteoFilas][7] = " ";
            this.data[conteoFilas][8] = " ";
            this.data[conteoFilas][9] = " ";
            this.data[conteoFilas][10] = " ";
            this.data[conteoFilas][11] = " ";
            
            conteoFilas++;
            this.data[conteoFilas][0] = "RValue ="+salida.getRvalue();
            this.data[conteoFilas][1] = " ";
            this.data[conteoFilas][2] = " ";
            this.data[conteoFilas][3] = " ";
            this.data[conteoFilas][4] = " ";
            this.data[conteoFilas][5] = " ";
            this.data[conteoFilas][6] = " ";
            this.data[conteoFilas][7] = " ";
            this.data[conteoFilas][8] = " ";
            this.data[conteoFilas][9] = " ";
            this.data[conteoFilas][10] = " ";
            this.data[conteoFilas][11] = " ";
            
            conteoFilas++;
            this.data[conteoFilas][0] = " ";
            this.data[conteoFilas][1] = " ";
            this.data[conteoFilas][2] = " ";
            this.data[conteoFilas][3] = " ";
            this.data[conteoFilas][4] = " ";
            this.data[conteoFilas][5] = " ";
            this.data[conteoFilas][6] = " ";
            this.data[conteoFilas][7] = " ";
            this.data[conteoFilas][8] = " ";
            this.data[conteoFilas][9] = " ";
            this.data[conteoFilas][10] = " ";
            this.data[conteoFilas][11] = " ";
            
            conteoFilas++;
            
    }
    
    public void imprimirTabla(){
                
        this.tabla = new JTable(this.data,this.columnName);
        this.tabla.setPreferredScrollableViewportSize(new Dimension(1500,1000));
        this.tabla.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(this.tabla);
        add(scrollPane);
    }

    public Object[][] getData() {
        return data;
    }

    public String[] getColumnName() {
        return columnName;
    }

    
    

}
