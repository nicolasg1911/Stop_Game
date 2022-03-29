package ui;

import java.net.URL;
import java.util.ResourceBundle;
import ui.Ventana_2;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Ventana_1 implements Initializable{
	private Ventana_2 vent2;

    @FXML
    private Label ownNameResult;

    @FXML
    private Label opponentNameResult;

    @FXML
    private Label ownAnimalResult;

    @FXML
    private Label opponentAnimalResult;

    @FXML
    private Label ownLocationResult;

    @FXML
    private Label opponentLocationResult;

    @FXML
    private Label ownObjectResult;

    @FXML
    private Label opponentObjectResult;

    @FXML
    private Button finishBtn;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ownNameResult.setText(vent2.getName());
		  
		
	}

}
