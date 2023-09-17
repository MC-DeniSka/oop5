import java.util.Scanner;
public class checkingCalculatorView extends calculatorView{
    public checkingCalculatorView(Scanner scanner){
        super(scanner);
    }
    @Override
    public String getUserOperation(){
        String op = super.getUserOperation();
        if (op.matches("\\/|\\*|\\+|-")){
            return op;
            }
        else{
            throw new IllegalArgumentException("Знак операции выбран неверно! Выберите (+,-,*,/)");
        }
        
    }

}