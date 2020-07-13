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
        System.out.println(minQ);
        System.out.println(maxQ);
        System.out.println(minR);
        System.out.println(maxR);


        //Inicio de Simulacion
        for(int i=minQ; i<=maxQ;i++){
            for(int j=minR; j<=maxR;j++){
                boolean orderup = false;
                int currentOrders = 0;
                int remainingOrderTime = 0;
                outValues salida = new outValues();
                salida.setQvalue(minQ);
                salida.setRvalue(minR);
                //Ciclo de simulacion hasta cantidadTiempo
                for (int k=0; k< entrada.timeAmount; k++){
                    salida.day.add(k);
                    if(k == 0)
                        salida.invInc.add(entrada.initialInv);
                    else{
                        salida.invInc.add(salida.finalInv.get(k-1));
                    }
                    //Inicializar variables N# Random y Valor (Demanda, TEntrega, TEspera)
                    randomDemand(entrada, salida);
                    randomDeliverT(entrada, salida);
                    randomW8Time(entrada, salida);
                    //Inicializacion Inv. Final
                    if (((salida.invInc.get(k)) - salida.demand.get(k)) < 0)
                        salida.finalInv.add(0);
                    else
                        salida.finalInv.add((salida.invInc.get(k)) - salida.demand.get(k));
                    //Inicializacion Inv. prom
                    salida.invProm.add((float)(salida.invInc.get(k)+salida.finalInv.get(k))/2);
                    //Inicializacion Faltante
                    if ((salida.invInc.get(k)-salida.demand.get(k)) < 0)
                        salida.remain.add((salida.invInc.get(k)-salida.demand.get(k))*-1);
                    else
                        salida.remain.add(0);
                    //Inicializacion N# Orden
                    if((orderup == false) && (salida.invInc.get(k)<=salida.getRvalue())){
                        currentOrders++;
                        salida.orderNo.add(currentOrders);
                        orderup = true;
                        remainingOrderTime= salida.deliverTime.get(k);
                    }else
                    if((orderup == true) && (remainingOrderTime == 0 && k>1)){
                        orderup = false;
                        salida.invInc.remove(k);
                        salida.invInc.add(salida.invInc.get(k-1)+salida.getQvalue());
                    }else
                    if((orderup == true) && (remainingOrderTime != 0)){
                        remainingOrderTime--;
                        salida.orderNo.add(0);
                    }
                  //  System.out.println("MAMALO GIO");
                }
                System.out.println(salida.toString());
            }
        }
return;

    }

    //Metodos de inicializacion Q y R (Min-Max)
    public int minQ(inValues input) {
        float qValue = (2 * input.orderCost * input.demandsArray[0][0] * (input.invCost + input.saleLossCost) / (input.invCost * input.saleLossCost));
        qValue = Math.round(Math.sqrt(qValue)) ;
        return (int) qValue;
    }

    public int maxQ(inValues input) {
        float qValue = (2 * input.orderCost * input.demandsArray[input.demandValues-1][0] * (input.invCost + input.acumDemandCost) / (input.invCost * input.acumDemandCost));
        qValue = Math.round(Math.sqrt(qValue));
        return (int) qValue;
    }

    public int minR(inValues input, int minQ) {
        float t0 =((float)minQ / (float)input.demandsArray[0][0]);
        if (input.deliverTimeArray[0][0] < t0) {
            return input.deliverTimeArray[0][0] * input.demandsArray[0][0];
        } else {
            int n = (int) (input.deliverTimeArray[0][0] / t0);;
            float Le =  (input.deliverTimeArray[0][0] - (n * t0));
            return Math.round (Le * input.demandsArray[0][0]);
        }
    }

    public int maxR(inValues input, int maxQ) {
        float t0 = ((float)maxQ / (float)input.demandsArray[input.demandValues-1][0]);
        if (input.deliverTimeArray[input.deliverTimeAmount-1][0] < t0) {
            return input.deliverTimeArray[input.deliverTimeAmount-1][0] * input.demandsArray[input.demandValues-1][0];
        } else {
            int n = (int) (input.deliverTimeArray[input.deliverTimeAmount-1][0] / t0);
            float Le =  (input.deliverTimeArray[input.deliverTimeAmount-1][0] - (n * t0));
            return Math.round (Le * input.demandsArray[input.demandValues-1][0]);
        }
    }

    //RECORDAR MULTIPLICAR LOS VALORES DE LOS RANDOM POR 100 Y CASTEAR


    //Metodos de seleccion de prob
    public void randomDemand(inValues entrada, outValues salida){
        int VarRandom = new Random().nextInt(100);
        salida.demandRandom.add(VarRandom);
        int Sum = 0;
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
        salida.deliverRandom.add(VarRandom);
        int Sum = 0;
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
        salida.w8TimeRandom.add(VarRandom);
        int Sum = 0;
        for (int i = 0; i < entrada.clientw8TimeArray.length; i++) {
            if (VarRandom < (entrada.clientw8TimeArray[i][1] + Sum)) {
                salida.w8Time.add(entrada.clientw8TimeArray[i][0]);
                return;
            }
            Sum = Sum + entrada.clientw8TimeArray[i][1];
        }
    }

}


