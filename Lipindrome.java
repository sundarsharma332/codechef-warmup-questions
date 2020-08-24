import java.util.*;
import java.lang.*;
import java.io.*;

class Lipindromes
{
    
    static String sortString(String str){
        char [] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
	
	public static void main(String[] args) throws IOException {
		
		try 
		{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T > 0){
			
			String input = sc.next();
			String firsthalf, remhalf;
			int inputlength = input.length();
			int inputmid = inputlength / 2;
			
			
			if(inputlength % 2 == 0){
				firsthalf = input.substring(0, inputmid);
				remhalf = input.substring(inputmid, inputlength);
			}else{
				
				firsthalf = input.substring(0, inputmid);
				remhalf = input.substring(inputmid + 1, inputlength);
			}
			
			
			firsthalf = sortString(firsthalf);
			remhalf = sortString(remhalf);
			
			if(firsthalf.equals(remhalf)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
			T--;
		}
		
		}
		catch(Exception e) {
			return ;
		}
		
	}
}
