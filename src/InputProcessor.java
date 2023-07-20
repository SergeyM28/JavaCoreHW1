import java.time.LocalDate;

public class InputProcessor {
    private String currentInput;
    private String stringToSave;

    public InputProcessor(String currentInput) {
        this.currentInput = currentInput;
    }

    public InputProcessor() {
    }

    public String getCurrentInput() {
        return currentInput;
    }

    public String getStringToSave() {
        return stringToSave;
    }

    public void setCurrentInput(String currentInput) {
        this.currentInput = currentInput;
    }

    public void setStringToSave(String stringToSave) {
        this.stringToSave = stringToSave;
    }

    public void processInput(){
        this.stringToSave = LocalDate.now() + " " + currentInput;
    }
}
