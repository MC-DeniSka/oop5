import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        model model = new checkingCalculatorModel();
        view view = new checkingCalculatorView(new Scanner(System.in));
        presenter presenter = new checkingCalculatorPresenter(model,view);
        presenter.onButtonClicked();
    }
}
