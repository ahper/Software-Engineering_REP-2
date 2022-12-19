package controller;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.ComponentClock;
import model.ComponentSignal;
import model.ComponentTextTime;
import model.TimeServer;

public class MainWindowController {
    @FXML public TextField timer, repeat, countingTime, signal;
    @FXML public Label labelTimer;
    @FXML GraphicsContext gr; @FXML public Canvas myCanvas;
    TimeServer timeServer = new TimeServer();
    ComponentTextTime componentTextTime;
    ComponentSignal componentSignal;
    ComponentClock componentClock;

    @FXML
    public void initialize(){
        gr = myCanvas.getGraphicsContext2D();
        addObservers();
//        MyClock myClock = new MyClock();
//        myClock.draw(gr, 0);
    }

    public void OnBtnTimerStart(){
        try{
            timeServer.start(Integer.parseInt(timer.getText()), Integer.parseInt(repeat.getText()));
            labelTimer.setText("ТАЙМЕР АКТИВЕН");
        }catch (Exception ex){
            System.err.print(ex.getMessage());
        }
    }
    public void OnBtnTimerStop(){
        try{
            timeServer.stop();
            labelTimer.setText("ТАЙМЕР ОСТАНОВЛЕН");
        }catch (Exception ex){
            System.err.print(ex.getMessage());
        }
    }
    public void OnBtnTimerClean(){
        try{
            timeServer.clean();
            labelTimer.setText("ТАЙМЕР НЕАКТИВЕН");
            timer.setText("");
            repeat.setText("");
            countingTime.setText("");
            signal.setText("");
            removeObservers();
            addObservers();
        }catch (Exception ex){
            System.err.print(ex.getMessage());
        }
    }
    public void OnBtnCountTimeStart(){componentTextTime.onComp();}
    public void OnBtnCountTimeStop(){componentTextTime.offComp();}
    public void OnBtnSignalStart(){componentSignal.onComp(Integer.parseInt(signal.getText()));}
    public void OnBtnSignalStop(){componentSignal.offComp();}
    public void OnBtnAnimStart(){componentClock.onComp();}
    public void OnBtnAnimStop(){componentClock.offComp();}
    public void addObservers(){
        componentTextTime = new ComponentTextTime(timeServer, countingTime);
        componentSignal = new ComponentSignal(timeServer);
        componentClock = new ComponentClock(timeServer, gr);
    }
    public void removeObservers(){
        componentTextTime.delComo(timeServer);
        componentSignal.delComo(timeServer);
        componentClock.delComo(timeServer);
    }
}
