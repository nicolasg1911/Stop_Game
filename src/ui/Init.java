package ui;

import java.io.IOException;

import comm.Server;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Init implements Server.OnMessageListener{

private Server connection;
	
	public Init() {
		connection = new Server();
		connection.setPuerto(6000);
		connection.setListener(this);
	}

	public void init() throws IOException {
		connection.start();
		
	}

	@Override
	public void time(String msg) {
		System.out.println(msg);
	}
}
