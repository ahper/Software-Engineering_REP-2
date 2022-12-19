package model;

import javafx.scene.control.TextField;
import model.Interfaces.IObserver;
import model.Interfaces.Subject;

public class ComponentTextTime implements IObserver {
    Subject subject;
    public TextField countingTime;
    Boolean state;
    String strTime;

    public ComponentTextTime(Subject subject, TextField countingTime){
        this.subject = subject;
        this.countingTime = countingTime;
        this.state = false;
        this.subject.attach(this);
    }

    public void onComp(){this.state = true;}

    public void offComp(){this.state = false;}

    public void delComo(Subject st){st.detach(this);}

    @Override
    public void update(Subject st) {
        if(state){
            strTime = st.getState() + " seconds";
            countingTime.setText(strTime);
        }
    }
}
