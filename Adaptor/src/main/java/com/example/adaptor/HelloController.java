package com.example.adaptor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import model.Adaptor;

import javax.swing.*;

public class HelloController {

    public ListView demolist;
    public TextArea addtext;
    public TextArea mintext;
    public Adaptor adaptor=new Adaptor(10);

    public void AddButton(ActionEvent actionEvent) {
        mintext.setText("");
        adaptor.AddElement(Long.parseLong(addtext.getText()));
        Display();
        addtext.setText("");
    }

    public void Display(){
        demolist.getItems().clear();
        String input=adaptor.DisplayEl();
        String delimiter=" ";
        String[] result=input.split(delimiter);
        for(String word: result){
            demolist.getItems().add(word);
        }
    }

    public void DeleteButton(ActionEvent actionEvent) {
        adaptor.deleteElement();
        Display();
        mintext.setText("");
    }

    public void SearchButton(ActionEvent actionEvent) {
        mintext.setText(Long.toString(adaptor.SeachMinEl()));
    }
    public void CheckButton(ActionEvent actionEvent) {
        if(adaptor.CheckElement()!=null){
            JOptionPane.showMessageDialog(null,
                    adaptor.CheckElement(),
                    "Состояние очереди",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

}