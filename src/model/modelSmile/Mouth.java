package model.modelSmile;

import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class Mouth extends Arc {
    public Mouth(){
        super.setFill(Color.TRANSPARENT);
        super.setStrokeWidth(4);
        super.setStroke(Color.BLACK);
        super.setType(ArcType.OPEN);
    }
    public void GoodySmileyMouth(){
//        super.setCenterX(pane.getWidth() / 2);
//        super.setCenterY(pane.getHeight() / 2 + 60);
        super.setCenterX(190);
        super.setCenterY(180);
        super.setRadiusX(50);
        super.setRadiusY(20);
        super.setStartAngle(180);
        super.setLength(180);
    }
    public void BadSmileyMouth(){
//        super.setCenterX(pane.getWidth() / 2);
//        super.setCenterY(pane.getHeight() / 2 + 65);
        super.setCenterX(190);
        super.setCenterY(185);
        super.setRadiusX(50);
        super.setRadiusY(20);
        super.setStartAngle(360);
        super.setLength(180);
    }

    public void SurprisedSmileyMouth(){
        super.setFill(Color.BLACK);
//        super.setCenterX(pane.getWidth() / 2);
//        super.setCenterY(pane.getHeight() / 2 + 60);
        super.setCenterX(190);
        super.setCenterY(180);
        super.setRadiusX(50);
        super.setRadiusY(20);
        super.setStartAngle(360);
        super.setLength(360);
    }
}
