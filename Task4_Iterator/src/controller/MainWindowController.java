package controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import model.ImageCollections;
import model.Iterator;


public class MainWindowController {
    @FXML ImageView imageCurrent;
    private ImageCollections imgs = new ImageCollections("image");
    private Iterator iter_main;
    public Timeline timeline;
    private Image name;
    public static final double TIME = 500;

    public MainWindowController() {
        this.iter_main = this.imgs.getIterator();
        this.timeline = new Timeline();
    }

    public void OnBtnStart() {
        timeline.getKeyFrames().add(new KeyFrame(new Duration(TIME), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (iter_main.hasNext()) {
                    onNext();
                }
                else{
                    onPreview();
                }
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    public void onNext() {
        if (iter_main.hasNext()) {
            name = (Image) iter_main.next();
            imageCurrent.setImage(name);
        }
    }

    public void onPreview() {
        if (!iter_main.hasNext()) {
            name = (Image) iter_main.preview();
            imageCurrent.setImage(name);
        }
    }

    public void OnBtnStop() {
        timeline.stop();
    }
}
