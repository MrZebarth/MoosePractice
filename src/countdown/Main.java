package countdown;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(in.readLine());
		for (int y=0;y<N;y++) {
			int T=Integer.parseInt(in.readLine());
			for (int x=T;x>0;x--) {
				System.out.print(x+" ");
			}
			System.out.println("0!");
		}
	}

}
