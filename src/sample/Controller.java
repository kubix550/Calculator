package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    Button buttonBinary;
    @FXML
    Button buttonOctal;
    @FXML
    Button buttonHexadecimal;
    @FXML
    Button buttonDot;

    @FXML
    TextField display;



    String action;               // przechowuje informacje o nacisnietym przycisku
    double firstNumber = 0;      // po nacisniecu przycisku funkcji przechowuje tu pierwszy numer i zeruje display
    double secondNumber = 0;     // tu druga liczba, przechowywana po nacisnieciu =
                                 // wynik liczy z dwoch liczb, sprawdza ktory przycisk zostal nacisniety do wykonania dzialania


    // checks for letters in display
    private void checkForLetters() {
        if (display.getText().matches("[A-Za-z]+") || display.getText().contains(" ")){
            display.setText("0");
        }

        // tymczasowe rozwiazanie zeby znalezc bledy w regex
//        if (display.getText().startsWith("D")) {
//            display.setText("0");
//        }
    }

    // numeric buttons
    public void ZeroClicked() {
        checkForLetters();                                          // sprawdza czy w display nie ma liter

        if (display.getText().equals("0")) {                        // jak jest domyslne zero, to wstawia nacisnieta liczbe
            display.setText("0");
        }
        else display.setText(display.getText() + "0");              // jak jest cos innego to dodaje nacisnieta liczbe do wczesniejszego tekstu
        }

    public void OneClicked() {
        checkForLetters();

        if (display.getText().equals("0")) {
            display.setText("1");
        }
        else {
            display.setText(display.getText() + "1");
        }
    }

    public void TwoClicked() {
        checkForLetters();

        if (display.getText().equals("0")) {
            display.setText("2");
        }
        else display.setText(display.getText() + "2");
    }
    public void ThreeClicked() {
        checkForLetters();

        if (display.getText().equals("0")) {
            display.setText("3");
        }
        else display.setText(display.getText() + "3");
    }
    public void FourClicked() {
        checkForLetters();

        if (display.getText().equals("0")) {
            display.setText("4");
        }
        else display.setText(display.getText() + "4");
    }
    public void FiveClicked() {
        checkForLetters();

        if (display.getText().equals("0")) {
            display.setText("5");
        }
        else display.setText(display.getText() + "5");
    }
    public void SixClicked() {
        checkForLetters();

        if (display.getText().equals("0")) {
            display.setText("6");
        }
        else display.setText(display.getText() + "6");
    }
    public void SevenClicked() {
        checkForLetters();

        if (display.getText().equals("0")) {
            display.setText("7");
        }
        else display.setText(display.getText() + "7");
    }
    public void EightClicked() {
        checkForLetters();

        if (display.getText().equals("0")) {
            display.setText("8");
        }
        else display.setText(display.getText() + "8");
    }
    public void NineClicked() {
        checkForLetters();

        if (display.getText().equals("0")) {
            display.setText("9");
        }
        else display.setText(display.getText() + "9");
    }

    // action buttons
    public void AddClicked() {
        action = "add";
        checkForLetters();

        firstNumber = Double.parseDouble(display.getText());
        display.setText("0");
    }

    public void SubtClicked() {
        action = "subt";
        checkForLetters();

        firstNumber = Double.parseDouble(display.getText());
        display.setText("0");
    }

    public void MultiClicked() {
        action = "multi";
        checkForLetters();

        firstNumber = Double.parseDouble(display.getText());
        display.setText("0");
    }

    public void DivClicked() {
        action = "div";
        checkForLetters();

        firstNumber = Double.parseDouble(display.getText());
        display.setText("0");
    }

    public void EqualsClicked() {
        checkForLetters();
        secondNumber = Double.parseDouble(display.getText());

        switch (action) {
            case "add":
                display.setText(String.valueOf(firstNumber + secondNumber));
                break;
            case "subt":
                display.setText(String.valueOf(firstNumber - secondNumber));
                break;
            case "multi":
                display.setText(String.valueOf(firstNumber * secondNumber));
                break;
            case "div":
                // wyjatek dzielenia przez 0
                if (secondNumber == 0) {
                    display.setText("Division by 0");
                    break;
                }

                display.setText(String.valueOf(firstNumber / secondNumber));
                break;
        }
    }

    public void DotClicked() {
        checkForLetters();

        // blokada przed postawieniem kolejnej kropki na koncu lub drugiej kropki w liczbie
        if (display.getText().endsWith(".") || display.getText().contains(".")) {
            display.setText(display.getText());
        }
        // jezeli nie ma kropek, to mozna ja postawic
        else display.setText(display.getText() + ".");
    }

    public void ClearClicked() {
        display.setText("0");
    }

    public void BinaryClicked() {
        checkForLetters();

        if (display.getText().contains(".")) {
            display.setText("Double not supported");
        }
        else display.setText(Integer.toBinaryString(Integer.parseInt(display.getText())));
    }

    public void OctalClicked() {
        checkForLetters();

        if (display.getText().contains(".")) {
            display.setText("Double not supported");
        }
        else display.setText(Integer.toOctalString(Integer.parseInt(display.getText())));
    }

    public void HexadecimalClicked() {
        checkForLetters();

        if (display.getText().contains(".")) {
            display.setText("Double not supported");
        }
        else display.setText(Integer.toHexString(Integer.parseInt(display.getText())));
    }
}

// bardziej zaawnsowana wersja z wykorzystaniem stosu i notacji BNF np.
//    2 2 + 5 -
//    4 5 -
//    -1