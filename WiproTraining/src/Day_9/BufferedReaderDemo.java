package Day_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter Number:");
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		int a = Integer.parseInt(br.readLine());
		System.out.println("Result:" +a);
		br.close();
		in.close();
		
		

	}

}
