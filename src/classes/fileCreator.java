package classes;
import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.*;
import java.io.*;
import java.awt.desktop.*;
import java.awt.FileDialog;
import java.util.ArrayList;

public class fileCreator {
    protected Desktop desktop = Desktop.getDesktop();
    protected String fileName;
    protected String path = "C:\\\\Simulacion de Inventarios\\\\Archivos\\\\";
    protected File directory = new File("C:\\Simulacion de Inventarios\\Archivos");
    protected File newDoc;
    protected FileWriter fOut;
    protected JFrame frame = new JFrame();


    //------------------------------------------------------------------------------------------------------------------
                                    //Metodos

    fileCreator(String fileName){
        this.fileName = fileName;
    }

    public fileCreator() {
    }

    public void createDir() {
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    public String openFile(){

        FileDialog fd = new FileDialog(frame, "Select a file",FileDialog.LOAD);
        fd.setDirectory(path);
        fd.setFile("*.txt");
        fd.setVisible(true);
        fileName = fd.getFile();
        System.out.println(fileName+"ff");
        return path+fileName;

    }

    public void createStream (){
        try {
            newDoc = new File("C://Simulacion de Inventarios/Archivos/" + fileName);
            fOut = new FileWriter(newDoc);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeFileStream() throws IOException {
        fOut.close();
    }

    public inValues readFile(String fileName) throws IOException {
        inValues result = new inValues();
        FileReader rd = new FileReader(fileName);
        System.out.print(rd.ready());
        BufferedReader buffrd = new BufferedReader(rd);
        if(rd == null){
            return null;
        }else
        {
            int fillLine = 0;
            String line;
            int intry;
            float flotry;
            while((line = buffrd.readLine()) != null && !(line.isEmpty())){
                switch (fillLine) {
                    case 0:
                        if (line.equalsIgnoreCase("d") || line.equalsIgnoreCase("s") || line.equalsIgnoreCase("m") || line.equalsIgnoreCase("b") || line.equalsIgnoreCase("t")){
                            result.setTimeUnit(line.charAt(0));
                            fillLine++;
                            break;
                        }
                        else{
                            System.out.println("Formato invalido");
                            return null;
                        }

                    case 1:
                        if(line.equals("S") || line.equals("s")){
                            result.setEventTable(true);
                            fillLine++;
                            break;
                        }else
                            if(line.equals("N") || line.equals("n")){
                                result.setEventTable(false);
                                fillLine++;
                                break;
                            }else{
                                System.out.print("Error de formato");
                                return null;
                            }
                    case 2:
                        intry = Integer.parseInt(line);
                        if(!(line.isEmpty()) && line != null){
                            result.setTimeAmount(intry);
                            fillLine++;
                            break;
                        }else{
                            System.out.println("Error de Formato");
                            return null;
                        }

                    case 3:
                        intry = Integer.parseInt(line);
                        if(!(line.isEmpty()) && line != null){
                            result.setDemandValues(intry);
                            fillLine++;
                            break;
                        }else{
                            System.out.println("Error de Formato");
                            return null;
                        }

                    case 4:
                        String[] splitted = line.split("-");
                        String[] part1 = splitted[0].split("/");
                        String[] part2 = splitted[1].split("/");
                        if((part1.length) == (part2.length)){
                            int[][] artry = new int[2][part1.length];
                            for(int i = 0; i<= 1 ; i++){
                                for(int j = 0; j<=part1.length ; j++){

                                }
                            }

                        }else{
                            System.out.println("Different Sizes in arrays");
                            return null;
                        }


                        fillLine++;
                        break;
                    case 5:
                        intry = Integer.parseInt(line);
                        if(!(line.isEmpty()) && line != null){
                            result.setDeliverTimeAmount(intry);
                            fillLine++;
                            break;
                        }else{
                            System.out.println("Error de Formato");
                            return null;
                        }
                    case 6:
                        ArrayList listtry2 = new ArrayList();
                        String[] splitted2 = line.split("/");
                        for(int i = 0; i<splitted2.length ; i++){
                            listtry2.add(Integer.parseInt(splitted2[i]));
                        }
                        result.setDeliverTimeArray((int[][]) listtry2.toArray());
                        fillLine++;
                        break;
                    case 7:
                        intry = Integer.parseInt(line);
                        if(!(line.isEmpty()) && line != null){
                            result.setW8TimeAmntClient(intry);
                            fillLine++;
                            break;
                        }else{
                            System.out.println("Error de Formato");
                            return null;
                        }
                    case 8:
                        ArrayList listtry3 = new ArrayList();
                        String[] splitted3 = line.split("/");
                        for(int i = 0; i<splitted3.length ; i++){
                            listtry3.add(Integer.parseInt(splitted3[i]));
                        }
                        result.setClientw8TimeArray((int[][]) listtry3.toArray());
                        fillLine++;
                        break;

                    case 9:
                        flotry = Float.parseFloat(line);
                        if(!(line.isEmpty()) && line != null){
                            result.setInvCost(flotry);
                            fillLine++;
                            break;
                        }else{
                            System.out.println("Error de Formato");
                            return null;
                        }
                    case 10:
                        flotry = Float.parseFloat(line);
                        if(!(line.isEmpty()) && line != null){
                            result.setPurchaseCost(flotry);
                            fillLine++;
                            break;
                        }else{
                            System.out.println("Error de Formato");
                            return null;
                        }
                    case 11:
                        flotry = Float.parseFloat(line);
                        if(!(line.isEmpty()) && line != null){
                            result.setOrderCost(flotry);
                            fillLine++;
                            break;
                        }else{
                            System.out.println("Error de Formato");
                            return null;
                        }
                    case 12:
                        flotry = Float.parseFloat(line);
                        if(!(line.isEmpty()) && line != null){
                            result.setAcumDemandCost(flotry);
                            fillLine++;
                            break;
                        }else{
                            System.out.println("Error de Formato");
                            return null;
                        }
                    case 13:
                        flotry = Float.parseFloat(line);
                        if(!(line.isEmpty()) && line != null){
                            result.setSaleLossCost(flotry);
                            fillLine++;
                            break;
                        }else{
                            System.out.println("Error de Formato");
                            return null;
                        }
                    case 14:
                        intry = Integer.parseInt(line);
                        if(!(line.isEmpty()) && line != null){
                            result.setInitialInv(intry);
                            fillLine++;
                            break;
                        }else{
                            System.out.println("Error de Formato");
                            return null;
                        }

                }


            }
        }
        return result;
    }


    //------------------------------------------------------------------------------------------------------------------
                                    //Setters y Getters


    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setDirectory(File directory) {
        this.directory = directory;
    }

    public void setNewDoc(File newDoc) {
        this.newDoc = newDoc;
    }

    public void setfOut(FileWriter fOut) {
        this.fOut = fOut;
    }

    public String getFileName() {
        return fileName;
    }

    public File getDirectory() {
        return directory;
    }

    public File getNewDoc() {
        return newDoc;
    }

    public FileWriter getfOut() {
        return fOut;
    }
}
