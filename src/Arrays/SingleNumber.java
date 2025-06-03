package Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums={4,1,2,1,2};
        int temp=0;
        for(int i:nums)
            temp^=i;
        System.out.println(temp);
    }
}
