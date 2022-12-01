/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package appusoselector;

import componentes_blancaadrian.SelectorDeslizamiento;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author usuario
 */
public class APPUsoSelectorController implements Initializable {

    @FXML
    private Label mensaje;
    @FXML
    private SelectorDeslizamiento selectorArriba;
    @FXML
    private SelectorDeslizamiento selectorAbajo;

    private ArrayList<String> numeros = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Collections.addAll(numeros, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        numeros.addAll(numeros);
        selectorArriba.setItems(numeros);
        selectorAbajo.setItems(numeros);
        
        selectorArriba.setOnAction(event -> {
            mensaje.setText("Pulsado el selector de arriba");
        
        });

        selectorAbajo.setOnAction(event -> {
            mensaje.setText("Pulsado el selector de abajo");
        
        });
        
    }

}
