package classes;


public class inValues {
//Atributos (Parametros) de entrada
    char timeUnit;
    boolean eventTable;
    int timeAmount;
    int demandValues;
    int[][] demandsArray;
    int deliverTimeAmount;
    int[][] deliverTimeArray;
    int deliverTime;
    int deliverTimeProb;
    int w8TimeAmntClient;
    int[][] clientw8TimeArray;
    float invCost;
    float purchaseCost;
    float orderCost;
    float acumDemandCost;
    float saleLossCost;
    int initialInv;

    //Constructor de parametros de Entrada
    public inValues(char timeUnit, boolean eventTable, int timeAmount, int demandValues, int demand, int demandProb, int deliverTimeAmount, int deliverTime, int deliverTimeProb, int w8TimeAmntClient, int clientW8TimeArt, int w8TimeClientProb, float invCost, float purchaseCost, float orderCost, float acumDemandCost, float saleLossCost, int initialInv) {
        this.timeUnit = timeUnit;
        this.eventTable = eventTable;
        this.timeAmount = timeAmount;
        this.demandValues = demandValues;
        this.demandsArray = new int[demandValues][1];
        this.deliverTimeAmount = deliverTimeAmount;
        this.deliverTimeArray = new int[deliverTimeAmount][1];
        this.w8TimeAmntClient = w8TimeAmntClient;
        this.clientw8TimeArray = new int[w8TimeAmntClient][1];
        this.invCost = invCost;
        this.purchaseCost = purchaseCost;
        this.orderCost = orderCost;
        this.acumDemandCost = acumDemandCost;
        this.saleLossCost = saleLossCost;
        this.initialInv = initialInv;
    }

    
    //Setters de arrays
    
    //
    
    //Metodo de selección por probabilidades (Set ValoresActuales Demanda, Entrega, Cliente)
    /*int VarRandom = Nro Random;
    int Sum=0;
    int ValorReal=0;
    
    for(i=0;i<demandsArray.length;i++){
        if (VarRandom < (demandsArray[i][0]+Sum)){
            ValorReal=demandsArray[i];
            exit() or break();
        }
        Sum=Sum+demandsArray[i][0];
    }
    
    //PARA MOSTRAR LA TABLA FINAL CREAR ARREGLO [I][12] PARA ALMACENAR TODAS LAS VARIABLES DE RESULTADO DE SIMULACION
    12= Nro de variables en tabla, posiblemente 14 si almacenamos Q Y R, i=0 hasta timeAmount (duración de simulación)
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

    public int getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(int deliverTime) {
        this.deliverTime = deliverTime;
    }

    public int getDeliverTimeProb() {
        return deliverTimeProb;
    }

    public void setDeliverTimeProb(int deliverTimeProb) {
        this.deliverTimeProb = deliverTimeProb;
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
