package classes;
/*
 *  @author Lopez Daniel 26.623.586
 *          Luces Adrian 26.936.932
 *          Angeles Nestor 26.262.971
 *
 * */
public class contRemain {

    protected int amount;       //Valor de faltante
    protected int W8Time;       //Valor de Tiempo de espera
    protected boolean online;   //Valor de vigencia de faltante

    //Constructor
    public contRemain(int amount, int w8Time, boolean online) {
        this.amount = amount;
        this.W8Time = w8Time;
        this.online = online;
    }


}
