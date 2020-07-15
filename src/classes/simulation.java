package classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/*
 *  @author Lopez Daniel 26.623.586
 *          Luces Adrian 26.936.932
 *          Angeles Nestor 26.262.971
 *
 * */

public class simulation {

    //----------------------------------------------------------------------------------------------------------------------
    //Atributos (Parametros) de entrada

    protected int minQ; //Q minima
    protected int maxQ; //Q maxima
    protected int minR; //R minima
    protected int maxR; //R maxima
    protected ArrayList<outValues> salidaFinal = new ArrayList<outValues>(); //Lista para almacenar Salidas
    protected outValues salidaOptima; //Variable para almacenar salida optima
   /* protected ArrayList<Integer> arrayDemands = new ArrayList<Integer>();
    protected ArrayList<Integer> arrayDeliverT= new ArrayList<Integer>();
    protected ArrayList<Integer> arrayW8Time =new ArrayList<Integer>();;
    protected ArrayList<Integer> arrayDemandsRnd = new ArrayList<Integer>();
    protected ArrayList<Integer> arrayDeliverTRnd= new ArrayList<Integer>();
    protected ArrayList<Integer> arrayW8TimeRnd =new ArrayList<Integer>();;*/

//----------------------------------------------------------------------------------------------------------------------
    //Constructor de parametros de Entrada

    public simulation() {

    }

//----------------------------------------------------------------------------------------------------------------------
    //Setters y Getters

    public ArrayList<outValues> getSalidaFinal() {
        return salidaFinal;
    }

    public void setSalidaFinal(ArrayList<outValues> salidaFinal) {
        this.salidaFinal = salidaFinal;
    }

    public outValues getSalidaOptima() {
        return salidaOptima;
    }

    public void setSalidaOptima(outValues salidaOptima) {
        this.salidaOptima = salidaOptima;
    }


//----------------------------------------------------------------------------------------------------------------------
    //Metodo de simulacion

    public void simulate(inValues entrada) {
        //Inicializacion de Q y R (min y max)
        entrada.calcInvCostUnit();
        minQ = minQ(entrada);
        maxQ = maxQ(entrada);
        minR = minR(entrada, minQ);
        maxR = maxR(entrada, maxQ);
        outValues iniCost = new outValues();

        System.out.println("Q min = "+minQ);
        System.out.println("Q max = "+maxQ);
        System.out.println("R min = "+minR);
        System.out.println("R max = "+maxR);
        salidaOptima = new outValues();
        iniCost.setTotalCost(99999999);
        salidaOptima = iniCost;


        //Inicio de Simulacion
        for (int i = minQ; i <= maxQ; i++) {
            for (int j = minR; j <= maxR; j++) {
                boolean orderup = false;
                int currentOrders = 0;
                int remainingOrderTime = 0;
                outValues salida = new outValues();
                ArrayList<contRemain> remainList = new ArrayList<contRemain>();
                salida.setQvalue(i);
                salida.setRvalue(j);
                //Ciclo de simulacion hasta cantidadTiempo
                for (int k = 0; k < entrada.timeAmount; k++) {
                    salida.day.add(k+1);
                    payRemain(remainList, entrada, salida);
                    if (k == 0)
                        salida.invInc.add(entrada.initialInv);
                        //Chequear si existe una orden pendiente
                    else if ((orderup == true) && (remainingOrderTime == 0) && (k > 0)) {
                        // System.out.println("uwu");
                        orderup = false;
                        int invTemp = (salida.finalInv.get(k - 1)) + salida.getQvalue();

                        //Chequeo faltantes vigentes y pago si es posible

                        for (int x = 0; x < remainList.size(); x++) {
                            if (remainList.get(x).online && remainList.get(x).W8Time > 0) {
                                if (invTemp - remainList.get(x).amount >= 0) {
                                    invTemp = invTemp - remainList.get(x).amount;
                                    salida.acumW8RemainCost((int) (remainList.get(x).amount * entrada.acumDemandCost));
                                    remainList.remove(x);
                                } else if (invTemp - remainList.get(x).amount < 0) {
                                    int amountTemp = remainList.get(x).amount - invTemp;
                                    int W8TimeTemp = remainList.get(x).W8Time;
                                    salida.acumW8RemainCost((int) (invTemp * entrada.acumDemandCost));
                                    contRemain remainTemp = new contRemain(amountTemp, W8TimeTemp, true);
                                    remainList.remove(x);
                                    remainList.add(x, remainTemp);
                                    invTemp = 0;
                                }
                            }
                        }

                        salida.invInc.add(invTemp);
                    } else {
                        salida.invInc.add(salida.finalInv.get(k - 1));
                    }

                    //Inicializar variables N# Random y Valor (Demanda, TEntrega, TEspera)
                    randomDemand(entrada, salida);
                    //Inicializacion Inv. Final
                    if (((salida.invInc.get(k)) - salida.demand.get(k)) < 0)
                        salida.finalInv.add(0);
                    else
                        salida.finalInv.add((salida.invInc.get(k)) - salida.demand.get(k));
                    //Inicializacion Inv. prom
                    salida.invProm.add((float) (salida.invInc.get(k) + salida.finalInv.get(k)) / 2);
                    //Inicializacion Faltante
                    if ((salida.invInc.get(k) - salida.demand.get(k)) < 0) {
                        salida.remain.add((salida.invInc.get(k) - salida.demand.get(k)) * -1);
                        randomW8Time(entrada, salida);
                        if (salida.w8Time.get(k) > 0)
                            remainList.add(new contRemain(salida.remain.get(k), salida.w8Time.get(k), true));
                    } else {
                        salida.remain.add(0);
                        salida.w8Time.add(-1);
                        salida.w8TimeRandom.add(0);
                    }
                    //Inicializacion N# Orden

                    if ((orderup == false) && (salida.finalInv.get(k) <= salida.getRvalue())) {
                        currentOrders++;
                        salida.orderNo.add(currentOrders);
                        orderup = true;
                        randomDeliverT(entrada, salida);
                        remainingOrderTime = salida.deliverTime.get(k);
                    } else if ((orderup == true) && (remainingOrderTime != 0)) {
                        remainingOrderTime--;
                        salida.orderNo.add(0);
                        salida.deliverTime.add(0);
                        salida.deliverRandom.add(0);
                    } else if ((!orderup) && (salida.finalInv.get(k) > salida.getRvalue())) {
                        salida.orderNo.add(0);
                        salida.deliverTime.add(0);
                        salida.deliverRandom.add(0);
                    }
                    salida.acumTotalRemainCost();
                    salida.acumTotalInvCost(salida.invProm.get(k));
                }
                salida.setTotalPurchaseCost(((int) (entrada.purchaseCost * salida.getQvalue() * currentOrders)));
                salida.setTotalOrderCost((int) (entrada.orderCost * currentOrders));
                salida.setTotalCostInv(salida.totalCostInv * entrada.invCostUnit);
                salida.acumTotalCost();
                salidaFinal.add(salida);
                //Pregunta para almacenar la simulacion optima más actual
                if(salida.totalCost <= salidaOptima.totalCost)
                    salidaOptima = salida;
                System.out.println(salida.toString());
            }
        }
    }

    //Metodos de inicializacion Q y R (Min-Max)
    public int minQ(inValues input) {
        float qValue = (2 * input.orderCost * input.demandsArray[0][0] * (input.invCost + input.saleLossCost) * 360 / (input.invCost * input.saleLossCost));
        qValue = Math.round(Math.sqrt(qValue));
        return (int) qValue;
    }

    public int maxQ(inValues input) {
        float qValue = (2 * input.orderCost * input.demandsArray[input.demandValues - 1][0] * (input.invCost + input.acumDemandCost) * 360 / (input.invCost * input.acumDemandCost));
        qValue = Math.round(Math.sqrt(qValue));
        return (int) qValue;
    }

    public int minR(inValues input, int minQ) {
        float t0 = ((float) minQ / (float) input.demandsArray[0][0]);
        //Para L<t0
        if (input.deliverTimeArray[0][0] < t0) {
            return input.deliverTimeArray[0][0] * input.demandsArray[0][0];
        } else {
            //Para L>0
            int n = (int) (input.deliverTimeArray[0][0] / t0);
            // System.out.println(n);
            float Le = (input.deliverTimeArray[0][0] - (n * t0));
            // System.out.println(Le);
            return Math.round(Le * input.demandsArray[0][0]);
        }
    }

    public int maxR(inValues input, int maxQ) {
        float t0 = ((float) maxQ / (float) input.demandsArray[input.demandValues - 1][0]);
        //Para L<t0
        if (input.deliverTimeArray[input.deliverTimeAmount - 1][0] < t0) {
            return input.deliverTimeArray[input.deliverTimeAmount - 1][0] * input.demandsArray[input.demandValues - 1][0];
        } else {
            //Para L>0
            int n = (int) (input.deliverTimeArray[input.deliverTimeAmount - 1][0] / t0);
            // System.out.println(n);
            float Le = (input.deliverTimeArray[input.deliverTimeAmount - 1][0] - (n * t0));
            // System.out.println(Le);
            return Math.round(Le * input.demandsArray[input.demandValues - 1][0]);
        }
    }

    //Metodos de seleccion de prob

    //Calcular numero aleatorio y valor correspondiente para demanda
    public void randomDemand(inValues entrada, outValues salida) {
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

    //Calcular numero aleatorio y valor correspondiente para tiempo de entrega
    //PARA QUE LOS VALORES SEAN LOS MISMOS PARA CADA Q Y R CAMBIAR EL PARAMETRO DE SALIDA POR EL ARRAYLIST CORRESPONDIENTE
    //LUEGO EN SIMULATION EN VEZ DE EJECUTAR ESTAS FUNCIONES SE RECORREN LOS ARRAYLIST YA INICIALIZADOS
    public void randomDeliverT(inValues entrada, outValues salida) {
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

    //Calcular numero aleatorio y valor correspondiente para tiempo de espera
    public void randomW8Time(inValues entrada, outValues salida) {
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

    //Metodo de chequeo faltantes pendientes
    public void payRemain(ArrayList<contRemain> remainList, inValues entrada, outValues salida) {
        for (int i = 0; i < remainList.size(); i++) {
            if (remainList.get(i).online && remainList.get(i).W8Time == 0) {
                salida.noacumW8RemainCost((int) (remainList.get(i).amount * entrada.saleLossCost));
                remainList.remove(i);
            } else if (remainList.get(i).online && remainList.get(i).W8Time > 0) {
                int amountTemp = remainList.get(i).amount;
                int W8TimeTemp = remainList.get(i).W8Time - 1;
                contRemain crTemp = new contRemain(amountTemp, W8TimeTemp, true);
                remainList.remove(i);
                remainList.add(i, crTemp);
            }
        }
    }
}