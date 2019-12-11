package prices;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(in.readLine());
		long counter=1;
		int count=1;
		while (counter<N) {
			count++;
			if (primeFactor(count)) {
				counter++;
			}
		}
		System.out.println(count);
	}

	public static boolean primeFactor(int count){
		while (count>1) {
			if (count%3!=0 && count%2!=0) {
				return false;
			}else {
				if (count%3==0) {
					return (primeFactor(count/3));
				}
				else if (count%2==0) {
					return (primeFactor(count/2));
				}
			}
		}
		if (count==1) {
			return true;
		}else {
			return false;
		}
	}
}
