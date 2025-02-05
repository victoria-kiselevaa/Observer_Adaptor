package model;

public interface Subject {
    public void notifyAllObserver(); //уведомление
    public void attach(IObserver obs);//добавление слушателя
    public void detach(IObserver obs);//удалить слушателя
}
