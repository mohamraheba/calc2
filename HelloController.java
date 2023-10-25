package com.example.myfirstfx;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class HelloController {
    public TextField HeightArea;
    public TextField WeightArea;
    public Button ButtonCalculate;
    public Label BmiLabel;
    public Label ResultLabel;


    public void buttonClick() {

        if (WeightArea.getText().trim().isEmpty() || HeightArea.getText().trim().isEmpty()) {
            Alert a = new Alert(AlertType.NONE);
            a.setContentText("Please enter correct height and weight");
            a.setAlertType(AlertType.ERROR);
            a.show();
        } else {

            double a = Double.parseDouble(HeightArea.getText());
            double b = Double.parseDouble(WeightArea.getText());
            double bmi = b / (a/100* a/100);
            BmiLabel.setText("" + bmi);

            if (bmi <= 18.5) {
                ResultLabel.setText("UnderWeight");
            } else if (bmi <= 24.9) {
                ResultLabel.setText("Normal Weight");
            } else if (bmi <= 29.9) {
                ResultLabel.setText("OverWeight");
            } else {
                ResultLabel.setText("obese");
            }
        }


    }
}


