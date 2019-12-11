package P1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String output="";
		//Read one number. This is how many strings we will read
		int N=Integer.parseInt(in.readLine());
		for (int counter=0;counter<N;counter++) {
			String[] tokens=in.readLine().split(" ");
			String opponent=tokens[0]; //get a string from the input
			int power=Integer.parseInt(tokens[1]); //get an integer from the input
			if (power>9001) {
				output+=opponent+"\n";
			}
		}
		System.out.println(output);
	}

}
