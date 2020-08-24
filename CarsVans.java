import java.util.*;
import java.lang.*;
import java.io.*;

class CarsVans
{
	public static void main (String[] args) throws IOException
	{
	    try {
            Scanner sc = new Scanner(System.in);
            byte T = sc.nextByte();
            int max;
            while (T-- > 0) {
                int N = sc.nextInt();
                int num = sc.nextInt();
                int count = 0;
                max = num;
                N--;
                while (N-- > 0) {
                    num = sc.nextInt();
                    if (max >= num) {
                        count++;
                        max = num;
                    }
                }
                System.out.println(count + 1);
            }
        }catch (Exception e){
        	return;
        }
	    
	}
}
