package classes;


public class main {


    public static void main(String[] args) {
        fileCreator creator = new fileCreator("Caso.txt");
        creator.createDir();
        creator.createStream();

        //InterfaceThread interfaz = new InterfaceThread();
        //interfaz.start();
    }
}

