package multiples;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(in.readLine());
		for (int x=0;x<T;x++) {
			String[] values=in.readLine().split(" ");
			int[] num1= {Integer.parseInt(values[0]),Integer.parseInt(values[1])};
			values=in.readLine().split(" ");
			int[] num2= {Integer.parseInt(values[0]),Integer.parseInt(values[1])};

			try{
				if (num2[0]/num1[0]==num2[1]/num1[1]) {

					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}catch(Exception E) {
				try {
					if (num1[0]/num2[0]==num1[1]/num2[1]) {
						System.out.println("YES");
					}else {
						System.out.println("NO");
					}
				}catch (Exception e) {
					System.out.println("NO");
				}
			}
		}
	}

}
