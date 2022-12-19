package model.modelSmile;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Head extends Circle {
    public Head(){
        super(100);
        super.setFill(Color.RED);
        super.setStroke(Color.BLACK);
        super.setStrokeWidth(5);
//        super.setCenterX(pane.getWidth() / 2);
//        super.setCenterY(pane.getHeight() / 2);
        super.setCenterX(190);
        super.setCenterY(120);
    }
}
