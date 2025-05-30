package prefixsufix;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int pos=1,pre=1;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)ans[i]=1;
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=ans[i]*pre;
            pre=pre*nums[i];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            ans[i]=ans[i]*pos;
            pos=pos*nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
