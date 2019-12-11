package characteristicCharacters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String[] vals=in.readLine().split(" ");
		int N=Integer.parseInt(vals[0]);
		int K=Integer.parseInt(vals[1]);
		String input=in.readLine();
		char toFind=input.charAt(K);
		int pos=-1;
		for (int x=1;x<=N;x++) {
			pos=input.indexOf(toFind, pos+1);
		}
		System.out.println(pos);
	}

}
