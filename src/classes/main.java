package classes;


import java.io.IOException;

public class main {


    public static void main(String[] args) {
       fileCreator creator = new fileCreator();
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
        }


        System.out.println("PENSASDASDAS");
        inValues enter = new inValues('d', false, 5, 4, 3, 3, 50, 25, 5, 10, 15, 2);

        for (int i=0; i<enter.demandValues-1;i++){
            System.out.println(enter.demandsArray[i][0]);
            System.out.println(enter.demandsArray[i][1]);
        }

        enter.demandsArray[0][0]= 0;
        enter.bubbleSort();

       /* System.out.println(enter.timeUnit);
        simulation sim = new simulation();
        sim.simulate(enter);
        System.out.println("pene");*/
        //inValues enter = new inValues('d',false,5,4,3,3,50,25,5,10,15,2);
        //enter.bubbleSort();
        //System.out.println(enter.timeUnit);
        //simulation sim = new simulation();
        //sim.simulate(enter);
       /* enter.setDemandTime();
        enter.setDeliverTime();
        enter.setW8Time();
        System.out.println(enter.demandRandom);
        System.out.println(enter.deliverRandom);
        System.out.println(enter.w8TimeRandom);*/

        //InterfaceThread interfaz = new InterfaceThread();
        //interfaz.start();
    }

}

