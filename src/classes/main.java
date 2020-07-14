package classes;
import java.io.IOException;
/*
 *  UCAB Guayana
 *  Ing. Informática
 *  8vo Semestre
 *  Investigación de Operaciones
 *  Prof. Luz Medina
 *  Ciudad Guayana, 14 de Julio 2020
 *  @author Lopez Daniel 26.623.586
 *          Luces Adrian 26.936.932
 *          Angeles Nestor 26.262.971
 *
 * */
public class main {


    public static void main(String[] args) {
        fileCreator creator = new fileCreator();
        creator.createDir();
        //creator.createStream();
        /*try {
            inValues test = creator.readFile("Caso.txt");
            //test.setEventTable(false);
            //test.toString();
            //inValues test = creator.readFile(creator.openFile());
            //creator.modifyinFile("Caso.txt",test);
            //System.out.println(test.toString());
            //test.printarray();

            return;
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        inValues enter = new inValues('d', false, 14, 8, 3, 3, 50, 25, 260, 30, 60, 10);

        enter.demandsArray[0][0]= 20;
        enter.demandsArray[1][0]= 22;
        enter.demandsArray[2][0]= 24;
        enter.demandsArray[3][0]= 26;
        enter.demandsArray[4][0]= 28;
        enter.demandsArray[5][0]= 30;
        enter.demandsArray[6][0]= 32;
        enter.demandsArray[7][0]= 34;
        enter.demandsArray[0][1]= 5;
        enter.demandsArray[1][1]= 5;
        enter.demandsArray[2][1]= 10;
        enter.demandsArray[3][1]= 10;
        enter.demandsArray[4][1]= 20;
        enter.demandsArray[5][1]= 30;
        enter.demandsArray[6][1]= 15;
        enter.demandsArray[7][1]= 5;

        enter.deliverTimeArray[0][0]= 1;
        enter.deliverTimeArray[1][0]= 2;
        enter.deliverTimeArray[2][0]= 3;
        enter.deliverTimeArray[0][1]= 40;
        enter.deliverTimeArray[1][1]= 30;
        enter.deliverTimeArray[2][1]= 30;

        enter.clientw8TimeArray[0][0]= 0;
        enter.clientw8TimeArray[1][0]= 1;
        enter.clientw8TimeArray[2][0]= 2;
        enter.clientw8TimeArray[0][1]= 50;
        enter.clientw8TimeArray[1][1]= 35;
        enter.clientw8TimeArray[2][1]= 15;

        enter.bubbleSort();

       System.out.println(enter.timeUnit);
       simulation sim = new simulation();
       sim.simulate(enter);
       outValues[] salidaFinalArray = sim.getSalidaFinal().toArray(new outValues[sim.getSalidaFinal().size()]);
       creator.writeResult( salidaFinalArray , sim.getSalidaOptima() , "resultadoSim.txt");




    }

}

