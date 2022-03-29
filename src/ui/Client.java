package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Client extends Application{


	private Client() {

		try {

			long start = 0;

			Socket socketSender=null;
			Socket socketReciber=null;


			while(true) {
				socketSender = new Socket("127.0.0.1", 6000);
				socketReciber = new Socket("127.0.0.1", 6000);
				OutputStream os = socketSender.getOutputStream();
				BufferedWriter bwriter = new BufferedWriter(new OutputStreamWriter(os));
				InputStream is = socketReciber.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader breader = new BufferedReader(isr);
				String begin = breader.readLine();
				if(begin!=null) {
					changeScreen();	
				}


			}
		}catch(IOException ex) {

		}
	}

	public static void main(String[] args) {
		new Client();		
	}

	private void changeScreen() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana_2.fxml"));
		Parent p = (Parent) loader.load();
		Scene scene = new Scene(p);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
		Parent p = (Parent) loader.load();
		Scene scene = new Scene(p);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();

	}


}
