package comm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Random;

import javafx.application.Application;
import javafx.stage.Stage;

public class Server extends Thread{
	


	private ServerSocket server;
	private Socket socketReciber;
	private Socket socketSender;
	private int puerto;
	private ArrayList players = new ArrayList();
	
	public OnMessageListener listener;
	
	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}
	
	@Override
	public void run() {
		try {
			server = new ServerSocket(puerto);
			int pairs=0;
			while(true) {
			while(pairs<2) {
			socketReciber = server.accept();
			String player=socketReciber.getInetAddress().toString();
			players.add(player);
			pairs++;
			}
			pairs=0;
			InputStream is = socketReciber.getInputStream();
			BufferedReader breader = new BufferedReader(new InputStreamReader(is));
			OutputStream os = socketSender.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bwriter = new BufferedWriter(osw) ;
			Random random =new Random();
			 char randomizedCharacter = (char) (random.nextInt(26) + 'A');
			bwriter.write(randomizedCharacter);
			
			
			}
		}catch(IOException ex) {
			
		}
		
	}
public void gameStop() {
		
	}
	
	public void setListener(OnMessageListener listener) {
		this.listener = listener;
	}
	
	public interface OnMessageListener{
		public void time(String msg);
	}
	

}
