/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogame;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ehab
 */
public class FXMLDocumentController implements Initializable {
    
    XOGame application;
    @FXML
    private TextField m8;
    @FXML
    private TextField m7;
    @FXML
    private TextField m6;
    @FXML
    private TextField m5;
    @FXML
    private TextField m4;
    @FXML
    private TextField m3;
    @FXML
    private TextField m2;
    @FXML
    private TextField m1;
    @FXML
    private TextField m9;

    FXMLDocumentController(XOGame aThis) {
        application=aThis;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void resetGame(ActionEvent event) {
    }
    
}
