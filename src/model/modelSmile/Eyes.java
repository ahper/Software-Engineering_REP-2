package model.modelSmile;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Eyes extends Circle {
    public Eyes(){
        super(15, Color.BLACK);
    }

    public void LeftEye(){
//        super.setCenterX(pane.getWidth() / 2 - 40);
//        super.setCenterY(pane.getHeight() / 2 - 20);
        super.setCenterX(150);
        super.setCenterY(100);
    }

    public void RightEye(){
//        super.setCenterX(pane.getWidth() / 2 + 40);
//        super.setCenterY(pane.getHeight() / 2 - 20);
        super.setCenterX(230);
        super.setCenterY(100);
    }
}
