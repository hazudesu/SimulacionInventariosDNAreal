package classes;


import java.io.IOException;

public class main {


    public static void main(String[] args) {
        fileCreator creator = new fileCreator();
        creator.createDir();
        //creator.createStream();
        try {
            inValues test = creator.readFile(creator.openFile());
            System.out.println(test.toString());
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }


        //InterfaceThread interfaz = new InterfaceThread();
        //interfaz.start();
    }
}

