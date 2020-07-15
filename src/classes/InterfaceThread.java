package classes;

import java.lang.reflect.Array;
/*
 *  @author Lopez Daniel 26.623.586
 *          Luces Adrian 26.936.932
 *          Angeles Nestor 26.262.971
 *
 * */
public class InterfaceThread implements Runnable{
    public Thread interThread;
    public String threadName = "Interface thread";



    public void run(){

    }

    public void start(){
        if(interThread == null){
            interThread = new Thread(this, threadName);
            interThread.start();
        }

    }


}
