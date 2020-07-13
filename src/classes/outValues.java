package classes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class outValues {
    protected ArrayList<Integer> day;
    protected ArrayList<Integer> invInc;
    protected ArrayList<Integer> demand;
    protected ArrayList<Integer> finalInv;
    protected ArrayList<Float> invProm;
    protected ArrayList<Integer> remain;
    protected ArrayList<Integer> orderNo;
    protected ArrayList<Integer> deliverTime;
    protected ArrayList<Integer> w8Time;
    protected ArrayList<Integer> demandRandom;
    protected ArrayList<Integer> deliverRandom;
    protected ArrayList<Integer> w8TimeRandom;
    protected int Qvalue;
    protected int Rvalue;

    protected int totalCostInv;
    protected int totalOrderCost;
    protected int totalPurchaseCost;
    protected int totalRemainCost;
    protected int totalCost;

    protected int w8RemainCost;
    protected int noW8RemainCost;



    //------------------------------------------------------------------------------------------------------------------
                                                    //Constructores


    public outValues() {
    }

    public outValues(ArrayList<Integer> day, ArrayList<Integer> invInc, ArrayList<Integer> demand, ArrayList<Integer> finalInv, ArrayList<Float> invProm, ArrayList<Integer> remain, ArrayList<Integer> orderNo, ArrayList<Integer> deliverTime, ArrayList<Integer> w8Time, ArrayList<Integer> demandRandom, ArrayList<Integer> deliverRandom, ArrayList<Integer> w8TimeRandom, int qvalue, int rvalue, int totalCostInv, int totalOrderCost, int totalPurchaseCost, int totalRemainCost, int w8RemainCost, int noW8RemainCost) {
        this.day = day;
        this.invInc = invInc;
        this.demand = demand;
        this.finalInv = finalInv;
        this.invProm = invProm;
        this.remain = remain;
        this.orderNo = orderNo;
        this.deliverTime = deliverTime;
        this.w8Time = w8Time;
        this.demandRandom = demandRandom;
        this.deliverRandom = deliverRandom;
        this.w8TimeRandom = w8TimeRandom;
        Qvalue = qvalue;
        Rvalue = rvalue;
        this.totalCostInv = totalCostInv;
        this.totalOrderCost = totalOrderCost;
        this.totalPurchaseCost = totalPurchaseCost;
        this.totalRemainCost = totalRemainCost;
        this.w8RemainCost = w8RemainCost;
        this.noW8RemainCost = noW8RemainCost;
    }

    //------------------------------------------------------------------------------------------------------------------
                                                    //Setters & Getters


    public ArrayList getDay() {
        return day;
    }

    public void setDay(ArrayList day) {
        this.day = day;
    }

    public ArrayList getInvInc() {
        return invInc;
    }

    public void setInvInc(ArrayList invInc) {
        this.invInc = invInc;
    }


    public ArrayList getDemand() {
        return demand;
    }

    public void setDemand(ArrayList demand) {
        this.demand = demand;
    }

    public ArrayList getFinalInv() {
        return finalInv;
    }

    public void setFinalInv(ArrayList finalInv) {
        this.finalInv = finalInv;
    }

    public ArrayList getInvProm() {
        return invProm;
    }

    public void setInvProm(ArrayList invProm) {
        this.invProm = invProm;
    }

    public ArrayList getRemain() {
        return remain;
    }

    public void setRemain(ArrayList remain) {
        this.remain = remain;
    }

    public ArrayList getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(ArrayList orderNo) {
        this.orderNo = orderNo;
    }


    public ArrayList getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(ArrayList deliverTime) {
        this.deliverTime = deliverTime;
    }


    public ArrayList getW8Time() {
        return w8Time;
    }

    public void setW8Time(ArrayList w8Time) {
        this.w8Time = w8Time;
    }

    public int getQvalue() {
        return Qvalue;
    }

    public void setQvalue(int qvalue) {
        Qvalue = qvalue;
    }

    public int getRvalue() {
        return Rvalue;
    }

    public void setRvalue(int rvalue) {
        Rvalue = rvalue;
    }
}
