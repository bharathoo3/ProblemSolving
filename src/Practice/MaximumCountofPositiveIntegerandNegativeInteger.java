package Practice;

public class MaximumCountofPositiveIntegerandNegativeInteger {
    public static void main(String[] args) {

    }
    public int maximumCount(int[] nums) {
        int pos=0,neg=0;
        for(int i:nums)
        {
            if(i>0)pos++;
            else if(i<0)neg++;
        }
        return Math.max(pos,neg);
    }
}
