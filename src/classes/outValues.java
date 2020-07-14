package classes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class outValues {
    protected ArrayList<Integer> day = new ArrayList<Integer>();
    protected ArrayList<Integer> invInc = new ArrayList<Integer>();
    protected ArrayList<Integer> demandRandom = new ArrayList<Integer>();
    protected ArrayList<Integer> demand = new ArrayList<Integer>();
    protected ArrayList<Integer> finalInv = new ArrayList<Integer>();
    protected ArrayList<Float> invProm = new ArrayList<Float>();
    protected ArrayList<Integer> remain = new ArrayList<Integer>();
    protected ArrayList<Integer> orderNo = new ArrayList<Integer>();
    protected ArrayList<Integer> deliverRandom = new ArrayList<Integer>();
    protected ArrayList<Integer> deliverTime = new ArrayList<Integer>();
    protected ArrayList<Integer> w8TimeRandom = new ArrayList<Integer>();
    protected ArrayList<Integer> w8Time = new ArrayList<Integer>();
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
        this.Qvalue = qvalue;
        this.Rvalue = rvalue;
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


    @Override
    public String toString() {
        return "outValues{" +
                "day=" + day +
                ", invInc=" + invInc +
                ", demandRandom=" + demandRandom +
                ", demand=" + demand +
                ", finalInv=" + finalInv +
                ", invProm=" + invProm +
                ", remain=" + remain +
                ", orderNo=" + orderNo +
                ", deliverRandom=" + deliverRandom +
                ", deliverTime=" + deliverTime +
                ", w8TimeRandom=" + w8TimeRandom +
                ", w8Time=" + w8Time +
                ", Qvalue=" + Qvalue +
                ", Rvalue=" + Rvalue +
                ", totalCostInv=" + totalCostInv +
                ", totalOrderCost=" + totalOrderCost +
                ", totalPurchaseCost=" + totalPurchaseCost +
                ", totalRemainCost=" + totalRemainCost +
                ", totalCost=" + totalCost +
                ", w8RemainCost=" + w8RemainCost +
                ", noW8RemainCost=" + noW8RemainCost +
                '}';
    }

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
        this.Qvalue = qvalue;
    }

    public int getRvalue() {
        return Rvalue;
    }

    public void setRvalue(int rvalue) {
        this.Rvalue = rvalue;
    }



}
