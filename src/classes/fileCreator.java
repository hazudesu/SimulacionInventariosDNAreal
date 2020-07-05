package classes;
import java.io.*;

public class fileCreator {
    public String fileName;
    public File directory = new File("C://Simulacion de Inventarios/Archivos/");
    public File newDoc;
    public FileWriter fOut;


    //------------------------------------------------------------------------------------------------------------------
                                    //Metodos

    fileCreator(String fileName){
        this.fileName = fileName;
    }

    public void createDir() {
        if (!directory.exists()) {
            directory.mkdirs();
        }
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
        inValues result;
        FileReader rd = new FileReader("C://Simulacion de Inventarios/Archivos/" + fileName);
        BufferedReader buffrd = new BufferedReader(rd);
        if(rd == null){
            return null;
        }else
        {
            String line = buffrd.readLine();
            while(line != null){
                
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
