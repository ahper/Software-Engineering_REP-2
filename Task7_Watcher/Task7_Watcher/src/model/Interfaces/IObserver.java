package model.Interfaces;

public interface IObserver {
    Subject subject = null;
    void update(Subject subject);
}
