package classes;

import static java.lang.System.exit;

import java.util.Arrays;
import java.util.Random;
/*
 *  @author Lopez Daniel 26.623.586
 *          Luces Adrian 26.936.932
 *          Angeles Nestor 26.262.971
 *
 * */
public class inValues {

//----------------------------------------------------------------------------------------------------------------------
    //Atributos (Parametros) de entrada

    protected char timeUnit;
    protected boolean eventTable;
    protected int timeAmount;
    protected int demandValues;
    public int[][] demandsArray;
    protected int deliverTimeAmount;
    protected int[][] deliverTimeArray;
    protected int w8TimeAmntClient;
    protected int[][] clientw8TimeArray;
    protected float invCost;
    protected float invCostUnit;
    protected float purchaseCost;
    protected float orderCost;
    protected float acumDemandCost;
    protected float saleLossCost;
    protected int initialInv;

//----------------------------------------------------------------------------------------------------------------------
    //Constructor de parametros de Entrada

    public inValues(char timeUnit, boolean eventTable, int timeAmount, int demandValues, int deliverTimeAmount, int w8TimeAmntClient, float invCost, float purchaseCost, float orderCost, float acumDemandCost, float saleLossCost, int initialInv) {
        this.timeUnit = timeUnit;
        this.eventTable = eventTable;
        this.timeAmount = timeAmount;
        this.demandValues = demandValues;
        this.demandsArray = new int[demandValues][2];
        this.deliverTimeAmount = deliverTimeAmount;
        this.deliverTimeArray = new int[deliverTimeAmount][2];
        this.w8TimeAmntClient = w8TimeAmntClient;
        this.clientw8TimeArray = new int[w8TimeAmntClient][2];
        this.invCost = invCost;
        this.invCostUnit = (float) 0.20;
        this.purchaseCost = purchaseCost;
        this.orderCost = orderCost;
        this.acumDemandCost = acumDemandCost;
        this.saleLossCost = saleLossCost;
        this.initialInv = initialInv;
        System.out.println("inValues Creado con exito");
    }


    public inValues() {
    }
    //----------------------------------------------------------------------------------------------------------------------
    //Metodos


    @Override
    public String toString() {
        return "inValues{" +
                "timeUnit=" + timeUnit +
                ", eventTable=" + eventTable +
                ", timeAmount=" + timeAmount +
                ", demandValues=" + demandValues +
                ", demandsArray=" + Arrays.toString(demandsArray) +
                ", deliverTimeAmount=" + deliverTimeAmount +
                ", deliverTimeArray=" + Arrays.toString(deliverTimeArray) +
                ", w8TimeAmntClient=" + w8TimeAmntClient +
                ", clientw8TimeArray=" + Arrays.toString(clientw8TimeArray) +
                ", invCost=" + invCost +
                ", invCostUnit=" + invCostUnit +
                ", purchaseCost=" + purchaseCost +
                ", orderCost=" + orderCost +
                ", acumDemandCost=" + acumDemandCost +
                ", saleLossCost=" + saleLossCost +
                ", initialInv=" + initialInv +
                '}';
    }




    public void printarray(){
        for(int i = 0; i<5; i++)
            for(int j = 0; j<2 ; j++)
                System.out.println(clientw8TimeArray[i][j]);
    }


    //----------------------------------------------------------------------------------------------------------------------
    //Sort de arrays (Menor a Mayor)
    public void bubbleSort() {
        int n = this.demandsArray.length;
        int n1 = this.deliverTimeArray.length;
        int n2 = this.clientw8TimeArray.length;

        //Sort para demandas
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (this.demandsArray[j][0] > this.demandsArray[j+1][0])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = this.demandsArray[j][0];
                    int temp2 = this.demandsArray[j][1];
                    this.demandsArray[j][0] = this.demandsArray[j+1][0];
                    this.demandsArray[j][1] = this.demandsArray[j+1][1];
                    this.demandsArray[j+1][0] = temp;
                    this.demandsArray[j+1][1] = temp2;

                }
            }
        }

        //Sort para tiempos de entrega
        for (int i = 0; i < n1-1; i++) {
            for (int j = 0; j < n1-i-1; j++) {
                if (this.deliverTimeArray[j][0] > this.deliverTimeArray[j+1][0])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = this.deliverTimeArray[j][0];
                    int temp2 = this.deliverTimeArray[j][1];
                    this.deliverTimeArray[j][0] = this.deliverTimeArray[j+1][0];
                    this.deliverTimeArray[j][1] = this.deliverTimeArray[j+1][1];
                    this.deliverTimeArray[j+1][0] = temp;
                    this.deliverTimeArray[j+1][1] = temp2;
                }
            }
        }

        //Sort para tiempos de espera
        for (int i = 0; i < n2-1; i++) {
            for (int j = 0; j < n2-i-1; j++) {
                if (this.clientw8TimeArray[j][0] > this.clientw8TimeArray[j+1][0])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = this.clientw8TimeArray[j][0];
                    int temp2 = this.clientw8TimeArray[j][1];
                    this.clientw8TimeArray[j][0] = this.clientw8TimeArray[j+1][0];
                    this.clientw8TimeArray[j][1] = this.clientw8TimeArray[j+1][1];
                    this.clientw8TimeArray[j+1][0] = temp;
                    this.clientw8TimeArray[j+1][1] = temp2;
                }
            }
        }
    }

    public void calcInvCostUnit(){
        switch (this.timeUnit){
            case 'd':
                this.invCostUnit=this.invCost/360;
                break;
            case 's':
                this.invCostUnit=this.invCost/52;
                break;
            case 'm':
                this.invCostUnit=this.invCost/12;
                break;
            case 'b':
                this.invCostUnit=this.invCost/6;
                break;
            case 't':
                this.invCostUnit=this.invCost/4;
                break;
            default:
                break;

        }
    }



    //Getters y Setters de atributos

    public char getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(char timeUnit) {
        this.timeUnit = timeUnit;
    }

    public boolean isEventTable() {
        return eventTable;
    }

    public void setEventTable(boolean eventTable) {
        this.eventTable = eventTable;
    }

    public int getTimeAmount() {
        return timeAmount;
    }

    public void setTimeAmount(int timeAmount) {
        this.timeAmount = timeAmount;
    }

    public int getDemandValues() {
        return demandValues;
    }

    public void setDemandValues(int demandValues) {
        this.demandValues = demandValues;
    }

    public int[][] getDemandsArray() {
        return demandsArray;
    }

    public void setDemandsArray(int[][] demandsArray) {
        this.demandsArray = demandsArray;
    }

    public int getDeliverTimeAmount() {
        return deliverTimeAmount;
    }

    public void setDeliverTimeAmount(int deliverTimeAmount) {
        this.deliverTimeAmount = deliverTimeAmount;
    }

    public int[][] getDeliverTimeArray() {
        return deliverTimeArray;
    }

    public void setDeliverTimeArray(int[][] deliverTimeArray) {
        this.deliverTimeArray = deliverTimeArray;
    }

    public int getW8TimeAmntClient() {
        return w8TimeAmntClient;
    }

    public void setW8TimeAmntClient(int w8TimeAmntClient) {
        this.w8TimeAmntClient = w8TimeAmntClient;
    }

    public int[][] getClientw8TimeArray() {
        return clientw8TimeArray;
    }

    public void setClientw8TimeArray(int[][] clientw8TimeArray) {
        this.clientw8TimeArray = clientw8TimeArray;
    }

    public float getInvCost() {
        return invCost;
    }

    public void setInvCost(float invCost) {
        this.invCost = invCost;
    }

    public float getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(float purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public float getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(float orderCost) {
        this.orderCost = orderCost;
    }

    public float getAcumDemandCost() {
        return acumDemandCost;
    }

    public void setAcumDemandCost(float acumDemandCost) {
        this.acumDemandCost = acumDemandCost;
    }

    public float getSaleLossCost() {
        return saleLossCost;
    }

    public void setSaleLossCost(float saleLossCost) {
        this.saleLossCost = saleLossCost;
    }

    public int getInitialInv() {
        return initialInv;
    }

    public void setInitialInv(int initialInv) {
        this.initialInv = initialInv;
    }


}
