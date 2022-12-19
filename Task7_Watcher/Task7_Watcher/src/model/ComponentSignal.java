package model;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import model.Interfaces.IObserver;
import model.Interfaces.Subject;

import java.io.File;

public class ComponentSignal implements IObserver {
    Subject subject;
    int count, start;
    String file;
    Media sound;
    MediaPlayer mediaPlayer;
    Boolean state;

    public ComponentSignal(Subject subject){
        this.count = 0;
        this.subject = subject;
        this.state = false;
        this.start = subject.getState();
        this.file = "vivo.mp3";
        this.sound = new Media(new File(file).toURI().toString());
        this.mediaPlayer = new MediaPlayer(sound);
        this.subject.attach(this); //  Добавляем слушателя
    }

    public void onComp(int count){
        this.count = count;
        this.start = subject.getState();
        this.state = true;
    }

    public void offComp(){
        this.state = false;
        mediaPlayer.stop();
    }

    public void delComo(Subject st){
        mediaPlayer.stop();
        st.detach(this); // Удаляем слушателя
    }
    @Override
    public void update(Subject st) {
        if (state) {
            if (st.getState() == start + count) {
                mediaPlayer.play();
                start += count;
            }
            if (st.getState() == start + 2)
                mediaPlayer.stop();
            }
    }
}
