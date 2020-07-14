package classes;


import java.io.IOException;

public class main {


    public static void main(String[] args) {
        fileCreator creator = new fileCreator();
        creator.createDir();
        //creator.createStream();
        try {
            inValues test = creator.readFile("Caso.txt");
            System.out.println(test.toString());
            test.printarray();
            creator.modifyinFile("moded.txt",test);

        } catch (IOException e) {
            e.printStackTrace();
        }

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

        System.out.println(enter.toString());



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
        //sim.simulate(enter);
        //outValues[] salidaFinalArray = sim.getSalidaFinal().toArray(new outValues[sim.getSalidaFinal().size()]);
        //creator.writeResult( salidaFinalArray , sim.getSalidaOptima() , "resultadoSim.txt");




    }

}

