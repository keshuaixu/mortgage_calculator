package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    public TextField interest;

    @FXML
    public TextField compound;

    @FXML
    public TextField years;

    @FXML
    public TextField result;

    @FXML
    public void perform_calculation() {
        result.setText(String.valueOf(MortgageCalculator.calc(new Double(interest.getText()), new Double(compound.getText()), new Double(years.getText()))));
    }
}
