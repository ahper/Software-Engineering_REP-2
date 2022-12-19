package model;

import javafx.scene.layout.Pane;
import model.modelSmile.Eyes;
import model.modelSmile.Head;
import model.modelSmile.Mouth;
import model.modelSmile.Nose;

public class Smile extends Pane {
    public void setHead(Head head) {this.getChildren().add(head);}
    public void setEyes(Eyes[] eyes) {
        for (Eyes eye : eyes) this.getChildren().add(eye);
    }
    public void setNose(Nose nose) {this.getChildren().add(nose);}
    public void setMouth(Mouth mouth) {this.getChildren().add(mouth);}
}
