package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    Button button0;
    @FXML
    Button button1;
    @FXML
    Button button2;
    @FXML
    Button button3;
    @FXML
    Button button4;
    @FXML
    Button button5;
    @FXML
    Button button6;
    @FXML
    Button button7;
    @FXML
    Button button8;
    @FXML
    Button button9;


    @FXML
    Button buttonAdd;
    @FXML
    Button buttonSubt;
    @FXML
    Button buttonMulti;
    @FXML
    Button buttonDiv;
    @FXML
    Button buttonEquals;
    @FXML
    Button buttonClr;


    @FXML
    Label currentNumber;
    @FXML
    Label storedNumber;

    // numeric buttons
    public void ZeroClicked() {
        String number = "0";
        String currentValue = currentNumber.getText();
        currentNumber.setText(currentValue + number);
    }
    public void OneClicked() {
        String number = "1";
        String currentValue = currentNumber.getText();
        currentNumber.setText(currentValue + number);
    }
    public void TwoClicked() {
        String number = "2";
        String currentValue = currentNumber.getText();
        currentNumber.setText(currentValue + number);
    }
    public void ThreeClicked() {
        String number = "3";
        String currentValue = currentNumber.getText();
        currentNumber.setText(currentValue + number);
    }
    public void FourClicked() {
        String number = "4";
        String currentValue = currentNumber.getText();
        currentNumber.setText(currentValue + number);
    }
    public void FiveClicked() {
        String number = "5";
        String currentValue = currentNumber.getText();
        currentNumber.setText(currentValue + number);
    }
    public void SixClicked() {
        String number = "6";
        String currentValue = currentNumber.getText();
        currentNumber.setText(currentValue + number);
    }
    public void SevenClicked() {
        String number = "7";
        String currentValue = currentNumber.getText();
        currentNumber.setText(currentValue + number);
    }
    public void EightClicked() {
        String number = "8";
        String currentValue = currentNumber.getText();
        currentNumber.setText(currentValue + number);
    }
    public void NineClicked() {
        String number = "9";
        String currentValue = currentNumber.getText();
        currentNumber.setText(currentValue + number);
    }

    // action buttons
    // todo dziala ale konsola wywala bledy
    public void AddClicked() {
        String currentValue = currentNumber.getText();
        String storedValue = storedNumber.getText();

        // przekazuje wyzej
        storedNumber.setText(currentValue);

        // zeruje labelCurrent
        currentNumber.setText("");

        // dodaje to co mamy
        storedNumber.setText(String.valueOf(Integer.parseInt(storedValue) + Integer.parseInt(currentValue)));
    }

    public void SubtClicked() {
        String currentValue = currentNumber.getText();
        String storedValue = storedNumber.getText();

        // przekazuje wyzej
        storedNumber.setText(currentValue);

        // zeruje labelCurrent
        currentNumber.setText("");

        // odejmuje to co mamy
        storedNumber.setText(String.valueOf(Integer.parseInt(storedValue) - Integer.parseInt(currentValue)));
    }

    public void MultiClicked() {
        String currentValue = currentNumber.getText();
        String storedValue = storedNumber.getText();

        // przekazuje wyzej
        storedNumber.setText(currentValue);

        // zeruje labelCurrent
        currentNumber.setText("");

        // mnozy to co mamy
        storedNumber.setText(String.valueOf(Integer.parseInt(storedValue) * Integer.parseInt(currentValue)));
    }

    public void DivClicked() {
        String currentValue = currentNumber.getText();
        String storedValue = storedNumber.getText();

        // przekazuje wyzej
        storedNumber.setText(currentValue);

        // zeruje labelCurrent
        currentNumber.setText("");

        // dzieli to co mamy
        // todo dodac wyjatek dzielenia przez 0
        storedNumber.setText(String.valueOf(Integer.parseInt(storedValue) / Integer.parseInt(currentValue)));
    }

    public void EqualsClicked() {
        // todo przeniesc wszystkie dzialania do equals zeby liczylo po kliknieciu, bo sa bledy
        // po dwukrotnym nacisnieciu = wynik sie nie pokazuje
        // = wyswietla poprzednią liczbe zamiast wyniku
        currentNumber.setText(storedNumber.getText());
        storedNumber.setText("");
    }

    public void ClearClicked() {
        storedNumber.setText("");
        currentNumber.setText("");
    }
}