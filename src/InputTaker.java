
import java.util.Scanner;

public class InputTaker {
    private String currentInput;
    private Scanner sc = new Scanner(System.in);

    public InputTaker(String currentInput) {
        this.currentInput = currentInput;
    }

    public InputTaker() {
    }

    public String getCurrentInput() {
        return currentInput;
    }

    public void takeInput() {
        System.out.println("input data -> ");
        currentInput = sc.nextLine();
    }
}
