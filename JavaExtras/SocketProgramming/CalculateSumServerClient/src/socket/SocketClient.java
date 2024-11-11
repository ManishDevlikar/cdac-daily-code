package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("Client Started");
		Socket socket = new Socket("localhost",9806);
		// user will enter a number
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		// we are reading that number
		int number = Integer.parseInt(reader.readLine());
		// now we are sending this number to a server
		PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
		// this will send the number to the server
		writer.println(number);
		// to read the sum send by the server
		BufferedReader read = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println(read.readLine());
	}
}
