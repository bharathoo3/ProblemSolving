package leSuccess_Assignment.Assignment6;

public class maximumSubarray {
    public static void main(String[] args) {
        int[] arr={-2 ,1 ,-3 ,4 ,-1, 2 ,1 ,-5 ,4};
        System.out.println(findSubArray(arr));
    }
    static int findSubArray(int[] arr){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(sum>=0){
                sum+=arr[i];
            }else{
                sum=arr[i];
            }
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
