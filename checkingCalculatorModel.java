public class checkingCalculatorModel extends calculatorModel{
    @Override
    public void div(double number1,double number2){
        if (number2 != 0){
            super.div(number1, number2);
        }
        else{
            throw new IllegalArgumentException("На нуль делить нельзя!");
        }
    }
    
}
