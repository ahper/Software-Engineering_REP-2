package controller;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import model.*;

public class MainWindowController {
    @FXML Pane myPane;
    Director direct = new Director();
    Smile currentSmiley;

    public void OnBtnGoody() {
        myPane.getChildren().clear();
        currentSmiley = direct.construct(new GoodySmileBuilder());
        myPane.getChildren().add(currentSmiley);
    }

    public void OnBtnBad() {
        myPane.getChildren().clear();
        currentSmiley = direct.construct(new BadSmileBuilder());
        myPane.getChildren().add(currentSmiley);
    }

    public void OnBtnNeutral() {
        myPane.getChildren().clear();
        currentSmiley = direct.construct(new SurprisedSmileBuilder());
        myPane.getChildren().add(currentSmiley);
    }

    public void OnBtnClear() {
        this.myPane.getChildren().remove(currentSmiley);
    }
}
