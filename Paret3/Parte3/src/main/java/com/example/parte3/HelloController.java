package com.example.parte3;

import Modelo.OperacionModelo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class HelloController implements Initializable {

        @FXML
        private TextField txtNumero1;

        @FXML
        private TextField txtNumero2;

        @FXML
        private TextField txtResultado;

        @FXML
        private Button b_sumar;

        @FXML
        private Button b_resetear;



        @FXML
        private void sumarNumeros() {
            try {
                double num1 = Double.valueOf(txtNumero1.getText());
                double num2 = Double.valueOf(txtNumero2.getText());
                double resultado = OperacionModelo.sumar(num1, num2);
                txtResultado.setText(String.valueOf(resultado));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        @FXML
        private void resetearCampos() {
            txtNumero1.clear();
            txtNumero2.clear();
            txtResultado.clear();
        }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    }
