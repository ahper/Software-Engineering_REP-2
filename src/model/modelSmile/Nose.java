package model.modelSmile;

import javafx.scene.shape.Line;

public class Nose extends Line {

    public Nose(){
        super.setStrokeWidth(5);
//        super.setStartX(pane.getWidth() / 2);
//        super.setStartY(pane.getHeight() / 2);
//        super.setEndX(pane.getWidth() / 2);
//        super.setEndY(pane.getHeight() / 2 + 25);//
        super.setStartX(190);
        super.setStartY(120);
        super.setEndX(190);
        super.setEndY(150);
    }
}
