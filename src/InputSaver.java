import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InputSaver {
    private File file = new File("outData.txt");

    public InputSaver(String currentString, File file) {
        this.file = file;
    }

    public InputSaver() {
    }


    public void saveData(String currentData){
        try (FileWriter fw = new FileWriter(file, true)){
            fw.append(currentData + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
