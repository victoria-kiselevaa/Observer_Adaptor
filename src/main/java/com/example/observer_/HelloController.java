package com.example.observer_;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import model.ComponentCircle;
import model.TimeServer;

public class HelloController {
    private TimeServer timeServer=new TimeServer();
    private ComponentCircle componentCircle=new ComponentCircle();; // Компонент, который будет анимироваться
    @FXML
    private Pane pane;

    public void OnStartClick(ActionEvent actionEvent) {

        timeServer.start(); // Запускаем отсчет времени
        timeServer.attach(componentCircle);
        pane.getChildren().remove(componentCircle);
        pane.getChildren().add(componentCircle);
    }

    public void OnStopClick(ActionEvent actionEvent) {
        timeServer.stop(); // Останавливаем счет
    }
}