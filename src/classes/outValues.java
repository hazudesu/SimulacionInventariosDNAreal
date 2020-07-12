package classes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class outValues {
    protected ArrayList day;
    protected ArrayList invInc;
    protected ArrayList randomDemandNo;
    protected ArrayList demand;
    protected ArrayList finalInv;
    protected ArrayList invProm;
    protected ArrayList remain;
    protected ArrayList orderNo;
    protected ArrayList randomDeliverNo;
    protected ArrayList deliverTime;
    protected ArrayList randomW8timeNo;
    protected ArrayList w8Time;
    protected ArrayList demandRandom;
    protected ArrayList deliverRandom;
    protected ArrayList w8TimeRandom;


    //------------------------------------------------------------------------------------------------------------------
                                                    //Constructores


    public outValues() {
    }

    public outValues(ArrayList day, ArrayList invInc, ArrayList randomDemandNo, ArrayList demand, ArrayList finalInv, ArrayList invProm, ArrayList remain, ArrayList orderNo, ArrayList randomDeliverNo, ArrayList deliverTime, ArrayList randomW8timeNo, ArrayList w8Time) {
        this.day = day;
        this.invInc = invInc;
        this.randomDemandNo = randomDemandNo;
        this.demand = demand;
        this.finalInv = finalInv;
        this.invProm = invProm;
        this.remain = remain;
        this.orderNo = orderNo;
        this.randomDeliverNo = randomDeliverNo;
        this.deliverTime = deliverTime;
        this.randomW8timeNo = randomW8timeNo;
        this.w8Time = w8Time;
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

    public ArrayList getRandomDemandNo() {
        return randomDemandNo;
    }

    public void setRandomDemandNo(ArrayList randomDemandNo) {
        this.randomDemandNo = randomDemandNo;
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

    public ArrayList getRandomDeliverNo() {
        return randomDeliverNo;
    }

    public void setRandomDeliverNo(ArrayList randomDeliverNo) {
        this.randomDeliverNo = randomDeliverNo;
    }

    public ArrayList getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(ArrayList deliverTime) {
        this.deliverTime = deliverTime;
    }

    public ArrayList getRandomW8timeNo() {
        return randomW8timeNo;
    }

    public void setRandomW8timeNo(ArrayList randomW8timeNo) {
        this.randomW8timeNo = randomW8timeNo;
    }

    public ArrayList getW8Time() {
        return w8Time;
    }

    public void setW8Time(ArrayList w8Time) {
        this.w8Time = w8Time;
    }
}
