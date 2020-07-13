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
       // for(int i=minQ; i<=maxQ;i++){
       //     for(int j=minR; j<=maxR;j++){
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
                    if (salida.invInc.get(k)-salida.finalInv.get(k) < 0)
                        salida.remain.add((int)salida.invInc.get(k)-(int)salida.finalInv.get(k)*-1);
                    else
                        salida.remain.add(0);
                    //Inicializacion N# Orden
                    if((orderup == false) && (salida.invInc.get(k)<=salida.getRvalue())){
                        currentOrders++;
                        salida.orderNo.add(currentOrders);
                        orderup = true;
                    }else
                    if((orderup == true) && (remainingOrderTime == 0)){
                        orderup = false;
                        salida.invInc.add(salida.invInc.get(k-1)+salida.getQvalue());
                    }else
                    if((orderup == true) && (remainingOrderTime != 0))
                        remainingOrderTime--;
                }
            //}
      //  }


return;

    }

    //Metodos de inicializacion Q y R (Min-Max)
    public int minQ(inValues input) {
        float qValue = (2 * input.orderCost * input.demandsArray[0][0] * (input.invCost + input.saleLossCost) / (input.invCost * input.saleLossCost));
        qValue = (int) Math.sqrt(qValue);
        return (int) qValue;
    }

    public int maxQ(inValues input) {
        float qValue = (2 * input.orderCost * input.demandsArray[input.demandValues-1][0] * (input.invCost + input.acumDemandCost) / (input.invCost * input.acumDemandCost));
        qValue = (int) Math.sqrt(qValue);
        return (int) qValue;
    }

    public int minR(inValues input, int minQ) {
        System.out.println(minQ);
        System.out.println(input.demandsArray[0][0]);
        float t0 =((float)minQ / (float)input.demandsArray[0][0]);
        System.out.println(t0);
        if (input.deliverTimeArray[0][0] < t0) {
            return input.deliverTimeArray[0][0] * input.demandsArray[0][0];
        } else {
            int n = (int) (input.deliverTimeArray[0][0] / t0);
            int Le = (int) (input.deliverTimeArray[0][0] * (n * t0));
            return Le - input.demandsArray[0][0];
        }
    }

    public int maxR(inValues input, int maxQ) {
        float t0 = ((float)maxQ / (float)input.demandsArray[input.demandValues-1][0]);
        if (input.deliverTimeArray[input.deliverTimeAmount-1][0] < t0) {
            return input.deliverTimeArray[input.deliverTimeAmount-1][0] * input.demandsArray[input.demandValues-1][0];
        } else {
            int n = (int) (input.deliverTimeArray[input.deliverTimeAmount-1][0] / t0);
            int Le = (int) (input.deliverTimeArray[input.deliverTimeAmount-1][0] * (n * t0));
            return Le - input.demandsArray[input.demandValues-1][0];
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
        System.out.println("MAMALO GIO");
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


