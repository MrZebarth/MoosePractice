package oddVeryOdd;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		//Read in a number
		int N=Integer.parseInt(in.readLine());
		//if even, print out even
		if (N%2==0) {
			System.out.println("even");
		}
		//if odd with even digits, print odd
		else {
			String x=String.valueOf(N);
			if (x.length()%2==0) {
				System.out.println("odd");
			}else {
				//if odd with odd digits, print very odd
				System.out.println("very odd");
			}
		}
		in.close();
	}

}
