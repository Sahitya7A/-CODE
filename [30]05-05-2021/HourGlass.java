import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlass {
    static int hourglassSum(int[][] arr) {
        int sum=0;
        int max=-10000000;
            for(int i=0;i<arr.length-2;i++){
                for(int j=0;j<arr.length-2;j++){
                    sum=arr[i+0][j+0]+arr[i+0][j+1]+arr[i+0][j+2]
                                  +arr[i+1][j+1]
                         +arr[i+2][j+0]+arr[i+2][j+1]+arr[i+2][j+2];
                         max=(max>sum)? max : sum;
                 System.out.print(sum+" ");
                }
                System.out.println();
            }
            return max;

    }

    

    public static void main(String[] args)  {
        
        int[][] arr = new int[6][6];
		 Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        System.out.println(result);
    }
}
