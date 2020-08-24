import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
        Arrays.sort(arr);
        long max = 0;
        for(int i=0; i<n; i++) {
            long c = arr[i] * (n-i);
            if(c > max)
                max = c;
        }
        System.out.println(max);
    }
}
