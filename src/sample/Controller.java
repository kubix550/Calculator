package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
    TextField display;

    String action; // przechowuje informacje o nacisnietym przycisku
    double first = 0; // po nacisniecu przycisku funkcji przechowuje tu pierwszy numer i zeruje
    double second = 0; // tu druga liczba, przechowywana po nacisnieciu =
    // wynik liczy z dwoch liczb, sprawdza ktory zostal nacisniety


    // numeric buttons
    public void ZeroClicked() {
        display.setText(display.getText() + "0");
    }
    public void OneClicked() {
        display.setText(display.getText() + "1");
    }
    public void TwoClicked() {
        display.setText(display.getText() + "2");
    }
    public void ThreeClicked() {
        display.setText(display.getText() + "3");
    }
    public void FourClicked() {
        display.setText(display.getText() + "4");
    }
    public void FiveClicked() {
        display.setText(display.getText() + "5");
    }
    public void SixClicked() {
        display.setText(display.getText() + "6");
    }
    public void SevenClicked() {
        display.setText(display.getText() + "7");
    }
    public void EightClicked() {
        display.setText(display.getText() + "8");
    }
    public void NineClicked() {
        display.setText(display.getText() + "9");
    }

    // action buttons
    public void AddClicked() {
        action = "add";

        first = Double.parseDouble(display.getText());
        display.setText("0");
    }

    public void SubtClicked() {
        action = "subt";

        first = Double.parseDouble(display.getText());
        display.setText("0");
    }

    public void MultiClicked() {
        action = "multi";

        first = Double.parseDouble(display.getText());
        display.setText("0");
    }

    public void DivClicked() {
        action = "div";

        first = Double.parseDouble(display.getText());
        display.setText("0");
    }

    public void EqualsClicked() {
        second = Double.parseDouble(display.getText());

        switch (action) {
            case "add":
                display.setText(String.valueOf(first + second));
                break;
            case "subt":
                display.setText(String.valueOf(first - second));
                break;
            case "multi":
                display.setText(String.valueOf(first * second));
                break;
            case "div":
                display.setText(String.valueOf(first / second));    // wstepnie bez uwzglednienia 0
                break;
        }
    }

    public void ClearClicked() {
        display.setText("0");
    }
}

// bardziej zaawnsowana wersja z wykorzystaniem stosu i notacji BNF np.
//    2 2 + 5 -
//    4 5 -
//    -1