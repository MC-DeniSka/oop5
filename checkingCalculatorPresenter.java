public class checkingCalculatorPresenter extends calculatorPresenter{
    public checkingCalculatorPresenter(model model,view view){
        super(model,view);
    }
    @Override
    public void onButtonClicked(){
        try{
            super.onButtonClicked();
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
