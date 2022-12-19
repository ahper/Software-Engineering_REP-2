package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Clock {
    private double width_clock = 200, height_clock = 200;
    public void draw(GraphicsContext gr, int second) {
        double clockRadius = Math.min(width_clock, height_clock) * 0.8 * 0.5;
        double centerX = width_clock / 2;
        double centerY = height_clock / 2;

        gr.strokeOval(centerX - clockRadius, centerY - clockRadius, clockRadius * 2, clockRadius * 2);
        gr.setFill(Color.WHITE);
        gr.setStroke(Color.DARKBLUE);

        gr.strokeText("12", centerX - 5 , centerY -clockRadius +12);
        gr.strokeText("9", centerX - clockRadius + 3 , centerY - 5);
        gr.strokeText("3", centerX + clockRadius - 10, centerY + 3);
        gr.strokeText("6", centerX - 3, centerY + clockRadius - 3);

        double slength = clockRadius * 0.8;
        double secondX = centerX + slength * Math.sin(second *(2 * Math.PI / 60));
        double secondY = centerX - slength * Math.cos(second *(2 * Math.PI / 60));
        gr.strokeLine(centerX, centerY, secondX, secondY);
    }
}
