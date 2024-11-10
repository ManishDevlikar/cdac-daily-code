package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	public static void main(String[] args) throws IOException {
		System.out.println("waiting for clients...");
		ServerSocket socketSerever = new ServerSocket(9806);
		Socket server = socketSerever.accept();
		System.out.println("connection established");
		// now to get that number which is send by client
		BufferedReader in = new BufferedReader(new InputStreamReader(server.getInputStream()));
		// we read that number
		int number = Integer.parseInt(in.readLine());
		// now to send the sum of that number to the client
		PrintWriter writer = new PrintWriter(server.getOutputStream());
		writer.println("Sum of number :"+number+" is "+ calculateSum(number));
		writer.flush();
	}
	
	static int calculateSum(int number) {
		int sum=0;
		for(int i=0;i<number;++i) {
			sum+=i;
		}
		return sum;
	}
}
