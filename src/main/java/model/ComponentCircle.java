package model;

import javafx.animation.TranslateTransition;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class ComponentCircle extends Circle implements IObserver {
    public ComponentCircle() {
        super(20); // Радиус круга
        this.setTranslateX(20);// Позиция по оси Х
        this.setTranslateY(100); // Позиция по оси Y
        //проверка
    }

    @Override
    public void update() {
        animate();
    }

    private void animate() {
        // Параметры анимации
        TranslateTransition transition = new TranslateTransition(Duration.seconds(1), this);
        transition.setByX(100); // Двигаем круг на 100 пикселей по оси X
        transition.setCycleCount(1);
        transition.play();
    }

}
