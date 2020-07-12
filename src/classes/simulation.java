package classes;

import java.util.Random;

public class simulation {

//----------------------------------------------------------------------------------------------------------------------
    //Atributos (Parametros) de entrada
    protected int demandRandom;
    protected int deliverRandom;
    protected int w8TimeRandom;

//----------------------------------------------------------------------------------------------------------------------
    //Constructor de parametros de Entrada

    public simulation(){

    }
//----------------------------------------------------------------------------------------------------------------------
    //Metodo de simulacion

    public void simulate(inValues entrada){

            int VarRandom = new Random().nextInt(100);
            System.out.println(VarRandom);
            int Sum = 0;
            //cambiar tipo de array a floats??
            for (int i = 0; i < entrada.demandsArray.length; i++) {
                if (VarRandom < (entrada.demandsArray[i][1] + Sum)) {
                    this.demandRandom = entrada.demandsArray[i][0];
                    return;
                }
                Sum = Sum + entrada.demandsArray[i][1];
            }

            VarRandom = new Random().nextInt(100);
            Sum = 0;
            System.out.println(VarRandom);
            //cambiar tipo de array a floats??
            for (int i = 0; i < entrada.deliverTimeArray.length; i++) {
                if (VarRandom < (entrada.deliverTimeArray[i][1] + Sum)) {
                    this.deliverRandom = entrada.deliverTimeArray[i][0];
                    return;
                }
                Sum = Sum + entrada.deliverTimeArray[i][1];
            }

            VarRandom = new Random().nextInt(100);
            Sum = 0;
            System.out.println(VarRandom);
            //cambiar tipo de array a floats??
            for (int i = 0; i < entrada.clientw8TimeArray.length; i++) {
                if (VarRandom < (entrada.clientw8TimeArray[i][1] + Sum)) {
                    this.w8TimeRandom = entrada.clientw8TimeArray[i][0];
                    return;
                }
                Sum = Sum + entrada.clientw8TimeArray[i][1];
            }

    }

}


