package sample;

import javafx.fxml.FXML;

import java.awt.*;


public class Controller {

    //kobler XML med java
    @FXML
    private TextArea tekst1;

    public void knapKlikket(){
        System.out.println("Knappen blev klikket på");
        tekst1.append("Det virker");
    }

}
