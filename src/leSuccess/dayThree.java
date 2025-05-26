package leSuccess;

import java.util.Arrays;
import java.util.Scanner;

public class dayThree {
    public static void main(String[] args) {
        //bulb sum
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=0;
        for(int j=1;j<=arr.length;j++) {
            for (int i = 0; i < arr.length; i++) {
                if ( (i+1) % j == 0) {
                    arr[i] = arr[i] == 1 ? 0 : 1;
                    if(arr[i]==0)
                        count--;
                    else count++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("the On Bulbs are "+count);
        System.out.println((int)Math.sqrt(n));
    }
}
