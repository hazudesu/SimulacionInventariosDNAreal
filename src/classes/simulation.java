package classes;

import java.util.Random;

public class simulation {

    //----------------------------------------------------------------------------------------------------------------------
    //Atributos (Parametros) de entrada
    protected int demandRandom;
    protected int deliverRandom;
    protected int w8TimeRandom;
    protected int minQ;
    protected int maxQ;
    protected int minR;
    protected int maxR;

//----------------------------------------------------------------------------------------------------------------------
    //Constructor de parametros de Entrada

    public simulation() {

    }
//----------------------------------------------------------------------------------------------------------------------
    //Metodo de simulacion

    public void simulate(inValues entrada) {

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

        minQ = minQ(entrada);
        maxQ = maxQ(entrada);
        minR = minR(entrada, minQ);
        maxR = maxR(entrada, maxQ);

    }

    //Metodos de inicializacion Q y R (Min-Max)
    public int minQ(inValues input) {
        float qValue = (2 * input.orderCost * input.demandsArray[0][0] * (input.invCost + input.saleLossCost) / (input.invCost * input.saleLossCost));
        qValue = (int) Math.sqrt(qValue);
        return (int) qValue;
    }

    public int maxQ(inValues input) {
        float qValue = (2 * input.orderCost * input.demandsArray[input.demandValues][0] * (input.invCost + input.acumDemandCost) / (input.invCost * input.acumDemandCost));
        qValue = (int) Math.sqrt(qValue);
        return (int) qValue;
    }

    public int minR(inValues input, int minQ) {
        int t0 = minQ / input.demandsArray[0][0];
        if (input.deliverTimeArray[0][0] < t0) {
            int pr = input.deliverTimeArray[0][0] * input.demandsArray[0][0];
            return pr;
        } else {
            int n = input.deliverTimeArray[0][0] / t0;
            int Le = input.deliverTimeArray[0][0] * (n * t0);
            int pr = Le - input.demandsArray[0][0];
            return pr;
        }
    }

    public int maxR(inValues input, int maxQ) {
        int t0 = maxQ / input.demandsArray[input.demandValues][0];
        if (input.deliverTimeArray[input.deliverTimeAmount][0] < t0) {
            int pr = input.deliverTimeArray[input.deliverTimeAmount][0] * input.demandsArray[input.demandValues][0];
            return pr;
        } else {
            int n = input.deliverTimeArray[input.deliverTimeAmount][0] / t0;
            int Le = input.deliverTimeArray[input.deliverTimeAmount][0] * (n * t0);
            int pr = Le - input.demandsArray[input.demandValues][0];
            return pr;
        }
    }
    
}


