import java.util.Scanner;

public class calculatorView implements view {
    private Scanner scanner;
    public calculatorView(Scanner scanner){
        this.scanner = scanner;
    }
    public void displayResult(double result){
        System.out.printf("Результат: %.2f", result );
    }
    public double getUserValue(){
        System.out.print("Введите число:  ");
        return scanner.nextDouble();
    }
    public String getUserOperation(){
        System.out.print("Введите операцию (+,-,* или /):  ");
        return scanner.next();
    }
}
