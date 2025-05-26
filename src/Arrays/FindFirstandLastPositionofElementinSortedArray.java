package Arrays;

import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,9};
        int target=8;
        System.out.println(Arrays.toString(findIndex(arr,target)));
    }
    public static int[] findIndex(int[] arr,int target)
    {
        int[] res=new int[2];
        res[0]=res[1]=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                res[0]=i;
                while(i<arr.length-1&&arr[i+1]==target)
                    i++;
                res[1]=i;
                break;
            }
        }
        return res;
    }
}
