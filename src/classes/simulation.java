package classes;

import java.util.Random;

public class simulation {

    //----------------------------------------------------------------------------------------------------------------------
    //Atributos (Parametros) de entrada

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

        minQ = minQ(entrada);
        maxQ = maxQ(entrada);
        minR = minR(entrada, minQ);
        maxR = maxR(entrada, maxQ);
        boolean orderup = false;
        int currentOrders = 0;
        int remainingOrderTime = 0;

        //Inicio de Simulacion
        outValues salida = new outValues();
        //Ciclo de simulacion hasta cantidadTiempo
        for (int i=0; i< entrada.timeAmount; i++){
            salida.day.add(i);
            salida.invInc.add(entrada.initialInv);
            randomDemand(entrada, salida);
            randomDeliverT(entrada, salida);
            randomW8Time(entrada, salida);
            salida.finalInv.add((salida.invInc.get(i)) - salida.demand.get(i));
            salida.invProm.add((float)(salida.invInc.get(i)+salida.finalInv.get(i))/2);
            if (salida.invInc.get(i)-salida.finalInv.get(i) < 0)
                salida.remain.add((int)salida.invInc.get(i)-(int)salida.finalInv.get(i)*-1);
            else
                salida.remain.add(0);
            //

            if((orderup == false) && (salida.invInc.get(i)<=salida.getRvalue())){
                currentOrders++;
                salida.orderNo.add(currentOrders);
                orderup = true;
            }else
                if((orderup == true) && (remainingOrderTime == 0)){
                    orderup = false;
                    salida.invInc.add(salida.invInc.get(i-1)+salida.getQvalue());

                }else
                    if((orderup == true) && (remainingOrderTime != 0))
                        remainingOrderTime--;



        }

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
            return input.deliverTimeArray[0][0] * input.demandsArray[0][0];
        } else {
            int n = input.deliverTimeArray[0][0] / t0;
            int Le = input.deliverTimeArray[0][0] * (n * t0);
            return Le - input.demandsArray[0][0];
        }
    }

    public int maxR(inValues input, int maxQ) {
        int t0 = maxQ / input.demandsArray[input.demandValues][0];
        if (input.deliverTimeArray[input.deliverTimeAmount][0] < t0) {
            return input.deliverTimeArray[input.deliverTimeAmount][0] * input.demandsArray[input.demandValues][0];
        } else {
            int n = input.deliverTimeArray[input.deliverTimeAmount][0] / t0;
            int Le = input.deliverTimeArray[input.deliverTimeAmount][0] * (n * t0);
            return Le - input.demandsArray[input.demandValues][0];
        }
    }

    //RECORDAR MULTIPLICAR LOS VALORES DE LOS RANDOM POR 100 Y CASTEAR


    //Metodos de seleccion de prob
    public void randomDemand(inValues entrada, outValues salida){
        int VarRandom = new Random().nextInt(100);
        System.out.println(VarRandom);
        salida.demandRandom.add(VarRandom);
        int Sum = 0;
        //cambiar tipo de array a floats??
        for (int i = 0; i < entrada.demandsArray.length; i++) {
            if (VarRandom < (entrada.demandsArray[i][1] + Sum)) {
                salida.demand.add(entrada.demandsArray[i][0]);
                return;
            }
            Sum = Sum + entrada.demandsArray[i][1];
        }
    }

    public void randomDeliverT(inValues entrada, outValues salida){
        int VarRandom = new Random().nextInt(100);
        System.out.println(VarRandom);
        salida.deliverRandom.add(VarRandom);
        int Sum = 0;
        //cambiar tipo de array a floats??
        for (int i = 0; i < entrada.deliverTimeArray.length; i++) {
            if (VarRandom < (entrada.deliverTimeArray[i][1] + Sum)) {
                salida.deliverTime.add(entrada.deliverTimeArray[i][0]);
                return;
            }
            Sum = Sum + entrada.deliverTimeArray[i][1];
        }
    }

    public void randomW8Time(inValues entrada, outValues salida){
        int VarRandom = new Random().nextInt(100);
        System.out.println(VarRandom);
        salida.w8TimeRandom.add(VarRandom);
        int Sum = 0;
        //cambiar tipo de array a floats??
        for (int i = 0; i < entrada.clientw8TimeArray.length; i++) {
            if (VarRandom < (entrada.clientw8TimeArray[i][1] + Sum)) {
                salida.w8Time.add(entrada.clientw8TimeArray[i][0]);
                return;
            }
            Sum = Sum + entrada.clientw8TimeArray[i][1];
        }
    }

}


