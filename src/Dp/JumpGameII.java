package Dp;
//45
public class JumpGameII {
    public static void main(String[] args) {
        int[] arr={4,1,1,1,4};
        System.out.println(findMini(arr,0));
        System.out.println(findMini2(arr));
    }
    //recursion apprach
    static int findMini(int[] arr,int ind)
    {
        if(ind >= arr.length-1)
            return 0;
        int minCount=Integer.MAX_VALUE;

       for(int i=1;i <= arr[ind];i++)
       {
           int jump=findMini(arr,ind+i);
           if(jump != Integer.MAX_VALUE)
               minCount=Math.min(minCount,1+jump);
       }
       return minCount;
    }
    //optimal approach just manage range of the value which we have in recurrsion
    static int findMini2(int[] nums)
    {
        int jump=0,left=0,right=0;
        while (right < nums.length-1)
        {
            int fartherst=0;
            for(int i=left;i<=right;i++)
                fartherst=Math.max(fartherst,left+nums[left]);
            left=right+1;
            right=fartherst;
            jump++;
        }
        return jump;
    }
}
