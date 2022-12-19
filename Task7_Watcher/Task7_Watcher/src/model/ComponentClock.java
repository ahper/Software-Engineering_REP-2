package model;

import javafx.scene.canvas.GraphicsContext;
import model.Interfaces.IObserver;
import model.Interfaces.Subject;

public class ComponentClock implements IObserver {
    Subject subject;
    GraphicsContext gr;
    Boolean state;
    Clock clock;
//    private int count, start;

    public ComponentClock(Subject subject, GraphicsContext gr){
        this.clock = new Clock();
        this.subject = subject;
        this.gr = gr;
        this.state = false;
        this.subject.attach(this);
//        this.count = 0; // ---
//        this.start = subject.getState(); // ---
    }
    @Override
    public void update(Subject st) {
        if(state) {
            gr.clearRect(0, 0, 200, 200);
            clock.draw(gr, st.getState());
        }
    }
    public void onComp() {
//        this.start = subject.getState();
        this.state = true;
    }

    public void offComp() {this.state = false;}

    public void delComo(Subject st) {
//        this.count = 0;
//        gr.clearRect(0, 0, 200, 200);
//        myClock.draw(gr, 0);
        st.detach(this);
    }
}
