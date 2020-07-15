package classes;
import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.*;
import java.io.*;
import java.awt.desktop.*;
import java.awt.FileDialog;
import java.util.ArrayList;
/*
 *  @author Lopez Daniel 26.623.586
 *          Luces Adrian 26.936.932
 *          Angeles Nestor 26.262.971
 *
 * */
public class fileCreator {

    protected String fileName;                                                                                          //Recibe el nombre a asignar para el archivo / nombre del archivo a abrir
    protected String path = "C:\\\\Simulacion de Inventarios\\\\Archivos\\\\";                                          //Path del directorio predeterminado del programa
    protected File directory = new File("C:\\Simulacion de Inventarios\\Archivos");                           //archivo del path al directorio predeterminado del programa
    protected File newDoc;                                                                                              //Variable tipo file empleada para la creacion de nuevos documentos txt
    protected FileWriter fOut;                                                                                          //Variable de tipo FileWriter para la creacion, apertura y escritura de Archivos


    //------------------------------------------------------------------------------------------------------------------
                                    //Constructores

    fileCreator(String fileName){
        this.fileName = fileName;
    }

    public fileCreator() {
    }

    //------------------------------------------------------------------------------------------------------------------
                                    //Metodos


    //Metodo para la creacion del directorio principal a usar en la ejecucion.

    public void createDir() {
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    /*Metodo readFile para la lectura de los archivos que contienen los datos de entrada
    * basado en un formato especifico de entrada de datos*/


    public inValues readFile(String fileName) throws IOException {
        inValues result = new inValues();
        FileReader rd = new FileReader(path + fileName);
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
                            int[][] artry = new int[part1.length][2];
                            for(int i = 0; i< part1.length ; i++){
                                for(int j = 0; j<2 ; j++){
                                    if(j == 0)
                                        artry[i][j] = Integer.parseInt(part1[i]);
                                    if(j == 1)
                                        artry[i][j] = Integer.parseInt(part2[i]);
                                }
                            }
                            result.setDemandsArray(artry);
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
                        String[] splitted2 = line.split("-");
                        String[] A = splitted2[0].split("/");
                        String[] B = splitted2[1].split("/");
                        if((A.length) == (B.length)){
                            int[][] artry = new int[A.length][2];
                            for(int i = 0; i< B.length ; i++){
                                for(int j = 0; j<2 ; j++){
                                    if(j == 0)
                                        artry[i][j] = Integer.parseInt(A[i]);
                                    if(j == 1)
                                        artry[i][j] = Integer.parseInt(B[i]);
                                }
                            }
                            result.setDeliverTimeArray(artry);
                        }else{
                            System.out.println("Different Sizes in arrays");
                            return null;
                        }
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
                        String[] splitted3 = line.split("-");
                        String[] A1 = splitted3[0].split("/");
                        String[] B1 = splitted3[1].split("/");
                        if((A1.length) == (B1.length)){
                            int[][] artry = new int[A1.length][2];
                            for(int i = 0; i< B1.length ; i++){
                                for(int j = 0; j< 2 ; j++){
                                    if(j == 0)
                                        artry[i][j] = Integer.parseInt(A1[i]);
                                    if(j == 1)
                                        artry[i][j] = Integer.parseInt(B1[i]);
                                }
                            }
                            result.setClientw8TimeArray(artry);
                        }else{
                            System.out.println("Different Sizes in arrays");
                            return null;
                        }
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

    /*Metodo writeResult, se encarga del almacenamiento de los datos de salida o resultados de la simulacion
    * una vez que esta ha terminado , estos archivos se almacenan en el directorio predeterminado*/

    public void writeResult(outValues[] salida, outValues salidaOptima, String resultFileName){
        String separator = System.getProperty("line.separator");
        String space = "          ";
        FileWriter fOut2;
        File newDoc2;
        System.out.println(resultFileName);
        try {
            System.out.println(resultFileName);
            newDoc2 = new File(path + resultFileName);
            fOut2 = new FileWriter(newDoc2);

            fOut2.write("Resultados de Simulacion" + separator);
            fOut2.write("---------------------------------------------------------------------------------------------------" + separator);
            fOut2.write("Politica Optima:" +separator);
            fOut2.write("Q = " + salidaOptima.getQvalue() +space +"R = " + salidaOptima.getRvalue()+ separator);
            fOut2.write("Costo de inventario = " + salidaOptima.getTotalCostInv() + separator);
            fOut2.write("Costo de Orden =  " + salidaOptima.getTotalOrderCost() + separator);
            fOut2.write("Costo de Compra = " + salidaOptima.getTotalPurchaseCost() + separator);
            fOut2.write("Costo de Faltante = " + salidaOptima.getTotalRemainCost() + separator);
            fOut2.write("COSTO TOTAL DE POLITICA = " + salidaOptima.getTotalCost() + separator);
            fOut2.write("---------------------------------------------------------------------------------------------------" + separator);

            for(int i = 0; i < salida.length ; i++){
                fOut2.write("Resultados de Simulacion" + separator);
                fOut2.write("---------------------------------------------------------------------------------------------------" + separator);
                //fOut.write("Tablas de Evento: " + separator);
                fOut2.write("Q = " + salida[i].getQvalue() + space +"R = " + salida[i].getRvalue() + separator);
                fOut2.write("Costo de inventario = " +salida[i].getTotalCostInv() + separator);
                fOut2.write("Costo de Orden =  " + salida[i].getTotalOrderCost() + separator);
                fOut2.write("Costo de Compra = " + salida[i].getTotalPurchaseCost() + separator);
                fOut2.write("Costo de Faltante = " + salida[i].getTotalRemainCost() + separator);
                fOut2.write("COSTO TOTAL DE POLITICA = " + salida[i].getTotalCost() + separator);

            }
            fOut2.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void modifyinFile(String fileopen, inValues inModed){
        String separator = System.getProperty("line.separator");
        File fileMod = new File(path+fileopen);
        int i = 0,j = 0;
        try {
            FileWriter fw = new FileWriter(fileMod);
            int atrCount = 0;
            while(atrCount < 15 ){
                switch (atrCount){
                    case 0 :
                        fw.write(inModed.getTimeUnit() + separator);
                        atrCount++;
                        break;
                    case 1 :
                        if(inModed.isEventTable())
                            fw.write("S" + separator);

                        else
                            fw.write("N" + separator);
                        atrCount++;
                        break;
                    case 2 :
                        fw.write(inModed.getTimeAmount() + separator);
                        atrCount++;
                        break;
                    case 3 :
                        fw.write(inModed.getDemandValues() + separator);
                        atrCount++;
                        break;
                    case 4 :
                        int [][] arr = inModed.getDemandsArray();
                        for ( i = 0 ; i<2 ; i++ ){
                            for( j = 0 ; j<inModed.getDemandValues(); j++){
                                if((j == inModed.getDemandValues() - 1) && (i == 0))
                                    fw.write(arr[j][i] + "-");
                                else
                                    if((j == inModed.getDemandValues() - 1) && (i == 1))
                                        fw.write(arr[j][i] + separator);
                                    else
                                        fw.write(arr[j][i] + "/");
                            }
                        }
                        atrCount++;
                        break;
                    case 5 :
                        fw.write(inModed.getDeliverTimeAmount() + separator);
                        atrCount++;
                        break;
                    case 6 :
                        int [][] arr2 = inModed.getDeliverTimeArray();
                        for ( i = 0 ; i<2 ; i++ ){
                            for(j = 0 ; j<inModed.getDeliverTimeAmount(); j++){
                                if((j == inModed.getDeliverTimeAmount() - 1) && (i == 0))
                                    fw.write(arr2[j][i] + "-");
                                else
                                if((j == inModed.getDeliverTimeAmount() - 1) && (i == 1))
                                    fw.write(arr2[j][i] + separator);
                                else
                                    fw.write(arr2[j][i] + "/");
                            }
                        }
                        atrCount++;
                        break;
                    case 7 :
                        fw.write(inModed.getW8TimeAmntClient() + separator);
                        atrCount++;
                        break;
                    case 8 :
                        int [][] arr3 = inModed.getClientw8TimeArray();
                        for ( i = 0 ; i<2 ; i++ ){
                            for(j = 0 ; j<inModed.getW8TimeAmntClient(); j++){
                                if((j == inModed.getW8TimeAmntClient() - 1) && (i == 0))
                                    fw.write(arr3[j][i] + "-");
                                else
                                if((j == inModed.getW8TimeAmntClient() - 1) && (i == 1))
                                    fw.write(arr3[j][i] + separator);
                                else
                                    fw.write(arr3[j][i] + "/");
                            }
                        }
                        atrCount++;
                        break;
                    case 9 :
                        fw.write(inModed.getInvCost() + separator);
                        atrCount++;
                        break;
                    case 10 :
                        fw.write(inModed.getPurchaseCost() + separator);
                        atrCount++;
                        break;
                    case 11 :
                        fw.write(inModed.getOrderCost() + separator);
                        atrCount++;
                        break;
                    case 12 :
                        fw.write(inModed.getAcumDemandCost() + separator);
                        atrCount++;
                        break;
                    case 13 :
                        fw.write(inModed.getSaleLossCost() + separator);
                        atrCount++;
                        break;
                    case 14 :
                        fw.write(inModed.getInitialInv() + separator);
                        atrCount++;
                        break;
                }

            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
