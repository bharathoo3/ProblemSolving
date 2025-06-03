package sort;
import java.util.*;
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0},nums2={2,5,6};
        int m=3,n=3;
        System.out.println(Arrays.toString(mergerArray(nums1,nums2,m,n)));
    }
    static int[] mergerArray(int[] nums1,int[] nums2,int m,int n)
    {
        int[] temp=new int[m+n];
        int i=0,j=0,k=0;
        while (i<m && j<n)
        {
            if(nums1[i]<nums2[j])
                temp[k++]=nums1[i++];
            else temp[k++]=nums2[j++];
        }
        while(i<m)
            temp[k++]=nums1[i++];
        while (j<n)
            temp[k++]=nums2[j++];
        for(i=0;i<nums1.length;i++)
            nums1[i]=temp[i];
        return nums1;
    }
}
