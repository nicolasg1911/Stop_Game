package ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import comm.Server;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Ventana_2 implements Initializable{
private Server server;
private String name;
private String animal;
private String location;
private String object;


    public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAnimal() {
	return animal;
}

public void setAnimal(String animal) {
	this.animal = animal;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getObject() {
	return object;
}

public void setObject(String object) {
	this.object = object;
}

	@FXML
    private Label title;

    @FXML
    private Button stopBtn;

    @FXML
    private TextField nameAnswer;

    @FXML
    private TextField animalAnswer;

    @FXML
    private TextField locationAnswer;

    @FXML
    private TextField objectAnswer;
    
    
    @FXML
    void Stop(ActionEvent event) throws IOException {
    	name = nameAnswer.getText();
    	animal = animalAnswer.getText();
    	location = locationAnswer.getText();
    	object = objectAnswer.getText();
    	server.gameStop();
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana_1.fxml"));
		Parent p = (Parent) loader.load();
		Scene scene = new Scene(p);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		nameAnswer.getText();
		animalAnswer.getText();
		locationAnswer.getText();
		objectAnswer.getText();
		
	}

}
