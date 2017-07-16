import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int n = Integer.parseInt(br.readLine().trim());
         String[] arr_a = br.readLine().split(" ");
         int[] a = new int[n];
         for(int i_a=0; i_a<arr_a.length; i_a++)
         {
         	a[i_a] = Integer.parseInt(arr_a[i_a]);
         }

         long out_ = solve(a);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static long solve(int[] a){
        long count=0;
        for(int i=0;i<a.length-1;i++)
        {
                while(a[i]>=a[i+1]) // = added because it wasn't checking in cases where after increment it matches an existing value in the array
            {
                a[i+1]++;
                count++;
                System.out.println("when c ="+count+"a[i]="+a[i]);
            }
        }
        return count; // count instead of count+1 compensates for absense of = in condition
    }
}
