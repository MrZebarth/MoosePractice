package P2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int total=0;
		int N=Integer.parseInt(in.readLine());
		for (int x=0;x<N;x++) {
			String[] tokens=in.readLine().split(" ");
			int H=Integer.parseInt(tokens[0]);
			int T=Integer.parseInt(tokens[1]);
			total+=H*T;
		}
		System.out.println(total);

	}

}
