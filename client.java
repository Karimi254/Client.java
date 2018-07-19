import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
	public static void main(String args[]) throws IOException {
//		declare variables
		int number;
		String temp;
			
//		accept input from user
		Scanner sc = new Scanner(System.in);
//		create socket with parameters(server and port no)
		Socket s = new Socket("127.0.0.1", 1306);
//		accept result from server
		Scanner sc1 = new Scanner(s.getInputStream());
//		accept no from user and store in number variable
		System.out.println("Enter Unit Code");
		number = sc.nextInt();
//		pass number to server
		PrintStream p = new PrintStream(s.getOutputStream());
//		pass the number
		p.println(number);
//		accept output from server
		temp = sc1.toString();
//		print result
		System.out.println(temp);

	}
}
