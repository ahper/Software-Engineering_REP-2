package model.Interfaces;

public interface Subject {
        void notifyAllObserver(); // Уведомляет
        void attach(IObserver obs);// Добавляет слушателя
        void detach(IObserver obs);// Удаляем слушателя
        int getState();
}
