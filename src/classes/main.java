package classes;


import java.io.IOException;

public class main {


    public static void main(String[] args) {
      /* fileCreator creator = new fileCreator();
        creator.createDir();
        //creator.createStream();
        try {
            inValues test = creator.readFile(creator.openFile());
            //System.out.println(test.toString());
            //test.printarray();

            System.out.println("PENE");
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        System.out.println("PENSASDASDAS");
        inValues enter = new inValues('d', false, 10, 4, 3, 3, 50, 25, 5, 10, 15, 20);



        enter.demandsArray[0][0]= 29;
        enter.demandsArray[1][0]= 26;
        enter.demandsArray[2][0]= 27;
        enter.demandsArray[3][0]= 28;
        enter.demandsArray[0][1]= 20;
        enter.demandsArray[1][1]= 20;
        enter.demandsArray[2][1]= 30;
        enter.demandsArray[3][1]= 30;
        enter.deliverTimeArray[0][0]= 1;
        enter.deliverTimeArray[1][0]= 2;
        enter.deliverTimeArray[2][0]= 3;
        enter.deliverTimeArray[0][1]= 20;
        enter.deliverTimeArray[1][1]= 30;
        enter.deliverTimeArray[2][1]= 50;
        enter.clientw8TimeArray[0][0]= 0;
        enter.clientw8TimeArray[1][0]= 1;
        enter.clientw8TimeArray[2][0]= 2;
        enter.clientw8TimeArray[0][1]= 30;
        enter.clientw8TimeArray[1][1]= 40;
        enter.clientw8TimeArray[2][1]= 30;



        enter.bubbleSort();
     /*   System.out.println("Demandas");
        for(int i=0; i< enter.demandValues; i++){
            System.out.println(enter.demandsArray[i][0]);
            System.out.println(enter.demandsArray[i][1]);
        }
        System.out.println("Entregas");
        for(int i=0; i< enter.deliverTimeAmount; i++){
            System.out.println(enter.deliverTimeArray[i][0]);
            System.out.println(enter.deliverTimeArray[i][1]);
        }
        System.out.println("Esperas");
        for(int i=0; i< enter.w8TimeAmntClient; i++){
            System.out.println(enter.clientw8TimeArray[i][0]);
            System.out.println(enter.clientw8TimeArray[i][1]);
        }*/

       System.out.println(enter.timeUnit);
        simulation sim = new simulation();
        sim.simulate(enter);
        System.out.println("pene");



        //InterfaceThread interfaz = new InterfaceThread();
        //interfaz.start();
    }

}

