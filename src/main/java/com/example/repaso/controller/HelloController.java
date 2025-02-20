package com.example.repaso.controller;

import com.example.repaso.model.Palabra;
import com.example.repaso.utils.Alertas;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private TextField txtPalabra;

    @FXML
    private TextField txtUsuario;


    @FXML
    private Button btnEnviar;

    @FXML
    private ListView<?> list;

    @FXML
    public void initialize() {

        Palabra.inicializarLista();


        btnEnviar.setOnAction(event -> verificarPalabra());
    }

    public  void verificarPalabra() {

        String palabraIngresada = txtPalabra.getText().trim();

        if (palabraIngresada.isEmpty()) {
            Alertas.mostrarAlerta("Advertencia", "Por favor, ingresa una palabra.");
            return;
        }

        if (Palabra.existePalabra(palabraIngresada)) {
            Alertas.mostrarAlerta("Resultado", "La palabra '" + palabraIngresada + "' está en la lista.");
        } else {
            Alertas.mostrarAlerta("Resultado", "La palabra '" + palabraIngresada + "' NO está en la lista.");
        }
    }



}