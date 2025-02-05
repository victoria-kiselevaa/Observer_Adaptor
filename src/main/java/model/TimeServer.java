package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class TimeServer implements Subject{
    private List<IObserver> observers = new ArrayList<>();
    private Timer timer;
    private TimerTask task;
    private int timeState=0;
    private long delay = 1000; // 1 секунда
    private long period = 5000; // обновления каждую секунду
    private boolean running;

    private int duration=5; // Время анимации
    private int start; // Начальное состояние времени

    public TimeServer() {
        this.running = false;
    }

    public void start() {
        if (!running) {
            running = true;
            System.out.println("работает");
            timer = new Timer();
            task = new TimerTask() {
                public void run() {
                    System.out.println("работает 111");
                    tick();
                }
            };
            timer.schedule(task, delay, period);
        }
    }
    private void tick() {
        timeState++;
        notifyAllObserver();
    }

    public void stop() {
        if (running) {
            timer.cancel(); // Останавливаем таймер
            running = false;
        }
    }

    public int getState() {
        return this.timeState;
    }

    @Override
    public void attach(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }
}
