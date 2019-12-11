import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		String[] tokens=in.readLine().split(" ");
		int A=Integer.parseInt(tokens[0]); //get an integer from the input
		String B=tokens[1]; //get a string from the input
		
		System.out.println(A);
		System.out.println(B);
	}

}
