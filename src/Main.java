public class Main {
    public static void main(String[] args) {

        InputTaker it = new InputTaker();
        InputProcessor ip = new InputProcessor();
        InputSaver is = new InputSaver();

        it.takeInput(); //принимает ввод
        ip.setCurrentInput(it.getCurrentInput()); //передает ввод в класс InputProcessor для обработки
        ip.processInput();
        is.saveData(ip.getStringToSave()); //передает обработанные данные для сохранения
    }
}