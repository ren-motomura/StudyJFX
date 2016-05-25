/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dance.ballroom;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

/**
 *
 * @author ren
 */
public class AppController implements Initializable {
    @FXML Button submitButton;
    @FXML Text actionTarget;

    @FXML
    public void onSubmitButtonClicked(ActionEvent event) {
        actionTarget.setFill(Color.FIREBRICK);
        actionTarget.setText("Sign in button pressed");
    }

    @Override
    public void initialize(URL url, ResourceBundle bundle) {
        System.out.println(url);
        System.out.println(bundle);
    }
}
