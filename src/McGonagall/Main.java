package McGonagall;
import java.io.*;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(in.readLine());
		int[] marks=new int[N];
		for (int x=0;x<marks.length;x++) {
			marks[x]=Integer.parseInt(in.readLine());
		}
		
		Arrays.sort(marks);
		int count=0;
		int max=0;
		int current=marks[0];
		int cheat=marks[0];
		for (int x=0;x<marks.length;x++) {
			if (marks[x]==current) {
				count++;
				if (count>max) {
					max=count;
					cheat=marks[x];
				}
			}else {
				current=marks[x];
				count=1;
			}
		}
		System.out.println(cheat);
	}

}
