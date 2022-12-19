package model;

import model.Interfaces.IObserver;
import model.Interfaces.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class TimeServer implements Subject {
    private List<IObserver> observers = new ArrayList<>();
    private Timer timer;
    private TimerTask task;
    private int timeState, delay, period;

    public TimeServer(){
        this.timeState = 0;
        this.delay = 0;
        this.period = 0;
    }

    @Override
    public void notifyAllObserver() {
        for (IObserver observer : observers)
            observer.update(this);
    }

    @Override
    public void attach(IObserver obs) {observers.add(obs);}

    @Override
    public void detach(IObserver obs) {observers.remove(obs);}

    @Override
    public int getState() {return this.timeState;}

//    public void tick(){
//        timeState++;
//        notifyAllObserver();
//    }

    public void tick(){
        if(timeState == 0)
            this.timeState += delay;
        else
            this.timeState += period;
        notifyAllObserver();
    }

    public void start(int delay, int period){
        try {
            this.delay = delay;
            this.period = period;
            timer = new Timer();
            task = new TimerTask(){
                @Override
                public void run() {
                    tick();
                }
            };
            timer.schedule(task, delay * 1000, period* 1000);
        }
        catch (Exception ex){
            System.err.print(ex.getMessage());
        }
    }

    public void stop(){timer.cancel();}

    public void clean(){
        timeState = 0;
        stop();
    }
}
