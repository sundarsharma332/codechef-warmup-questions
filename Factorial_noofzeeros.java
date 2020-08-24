import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

class FactorialCodechef {

	public static void main(String[] args) throws IOException {
		try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
            	long num = sc.nextLong();
            	long count = 0;
            	while(num > 0) {
            		count += num / 5;
            		num/=5;
            		
            	}
            	System.out.println(count);
            	
            }
                
        }
            catch (Exception e){
        	return;
            }

	}

}
