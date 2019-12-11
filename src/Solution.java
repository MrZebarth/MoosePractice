import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int total=Integer.parseInt(in.readLine());
        
        //loop through values
        for (int x=0;x<total;x++){
            int check=Integer.parseInt(in.readLine());
            boolean c=false;
            if (check<2){
                System.out.println("Not prime");
                continue;
            }else if (check==2){
                System.out.println("Prime");
                continue;
            }else{
                for (int y=2;y<check/2;y++){
                    if (check%y==0){
                        System.out.println("Not prime");
                        c=true;
                        break;
                    }
                }
                if (!c){
                    System.out.println("Prime");
                }
            }
        
        }
    }
}

