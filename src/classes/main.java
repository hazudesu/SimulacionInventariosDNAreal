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


        //InterfaceThread interfaz = new InterfaceThread();
        //interfaz.start();
    }
}

