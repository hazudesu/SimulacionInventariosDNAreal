package classes;


import java.io.IOException;

public class main {


    public static void main(String[] args) {
        fileCreator creator = new fileCreator("Caso.txt");
        creator.createDir();
        creator.createStream();
        try {
            inValues test = creator.readFile("Caso.txt");
            System.out.println(test.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        inValues enter = new inValues('d',false,5,4,3,3,50,25,5,10,15,2);
        System.out.println(enter.timeUnit);
        
        for (int i=0; i< enter.demandsArray.length; i++){
           System.out.println(enter.demandsArray[i][0]);  
           System.out.println(enter.demandsArray[i][1]);  
        }
        

        //InterfaceThread interfaz = new InterfaceThread();
        //interfaz.start();
    }
    
}

