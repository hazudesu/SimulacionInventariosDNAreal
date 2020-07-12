package classes;


import static java.lang.System.exit;
import java.util.Arrays;
import java.util.Random;

public class inValues {

//----------------------------------------------------------------------------------------------------------------------
                                            //Atributos (Parametros) de entrada

    protected char timeUnit ;
    protected boolean eventTable ;
    protected int timeAmount;
    protected int demandValues;
    protected int[][] demandsArray;
    protected int deliverTimeAmount;
    protected int[][] deliverTimeArray;
    protected int w8TimeAmntClient;
    protected int[][] clientw8TimeArray;
    protected float invCost;
    protected float purchaseCost;
    protected float orderCost;
    protected float acumDemandCost;
    protected float saleLossCost;
    protected int initialInv;
    protected int demandRandom;
    protected int deliverRandom;
    protected int w8TimeRandom;

//----------------------------------------------------------------------------------------------------------------------
                                            //Constructor de parametros de Entrada

    public inValues(char timeUnit, boolean eventTable, int timeAmount, int demandValues, int deliverTimeAmount, int w8TimeAmntClient,float invCost, float purchaseCost, float orderCost, float acumDemandCost, float saleLossCost, int initialInv) {
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
        this.purchaseCost = purchaseCost;
        this.orderCost = orderCost;
        this.acumDemandCost = acumDemandCost;
        this.saleLossCost = saleLossCost;
        this.initialInv = initialInv;
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
                ", purchaseCost=" + purchaseCost +
                ", orderCost=" + orderCost +
                ", acumDemandCost=" + acumDemandCost +
                ", saleLossCost=" + saleLossCost +
                ", initialInv=" + initialInv +
                ", demandRandom=" + demandRandom +
                ", deliverRandom=" + deliverRandom +
                ", w8TimeRandom=" + w8TimeRandom +
                '}';
    }

    public void printarray(){
        for(int i = 0; i<=1; i++)
            for(int j = 0; j<5 ; j++)
                System.out.println(demandsArray[i][j]);
    }


    //----------------------------------------------------------------------------------------------------------------------
                                                //Getters y Setters de atributos

    //Setters de arrays
    
    //
    
    //Metodo de selección por probabilidades (Set ValoresActuales Demanda, Entrega, Cliente)
    public void setDemandTime(){       
        int VarRandom = new Random().nextInt(100);    
        int Sum=0;
    //cambiar tipo de array a floats??
        for(int i=0;i<demandsArray.length;i++){
            if (VarRandom < (demandsArray[i][1]+Sum)){
                this.demandRandom= demandsArray[i][0];
                exit(0);
            }
            Sum=Sum+demandsArray[i][1];
        }
    }
    
    public void setDeliverTime(){        
        int VarRandom = new Random().nextInt(100);    
        int Sum=0;
    //cambiar tipo de array a floats??
        for(int i=0;i<demandsArray.length;i++){
            if (VarRandom < (demandsArray[i][1]+Sum)){
                this.deliverRandom= demandsArray[i][0];
                exit(0);
            }
            Sum=Sum+demandsArray[i][1];
        }
    }
    
    public void setW8Time(){ 
        int VarRandom = new Random().nextInt(100);    
        int Sum=0;
    //cambiar tipo de array a floats??
        for(int i=0;i<demandsArray.length;i++){
            if (VarRandom < (demandsArray[i][1]+Sum)){
                this.w8TimeRandom= demandsArray[i][0];
                exit(0);
            }
            Sum=Sum+demandsArray[i][1];
        }
    }
    
    //PARA MOSTRAR LA TABLA FINAL CREAR ARREGLO [I][12] PARA ALMACENAR TODAS LAS VARIABLES DE RESULTADO DE SIMULACION
   /* 12= Nro de variables en tabla, posiblemente 14 si almacenamos Q Y R, i=0 hasta timeAmount (duración de simulación)
    */
    
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
