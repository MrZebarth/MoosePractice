package missingMissiles;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		double[] dir= {0,0,0,0}; //U,D,L,R
		int N=Integer.parseInt(in.readLine());
		for (int x=0;x<N;x++) {
			String input=in.readLine();
			if (input.equals("U"))	dir[0]++;
			if (input.equals("D"))	dir[1]++;
			if (input.equals("L"))	dir[2]++;
			if (input.equals("R"))	dir[3]++;	
		}
		
		//Calculate the X direction
		double avgX=dir[2]/(dir[2]+dir[3]);
		//Calculate the Y direction
		double avgY=dir[0]/(dir[0]+dir[1]);
		System.out.println(avgX*200-100);
		System.out.println(100-avgY*200);
	}

}
