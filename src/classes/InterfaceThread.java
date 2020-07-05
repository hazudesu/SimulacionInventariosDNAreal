package classes;

import java.lang.reflect.Array;

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
