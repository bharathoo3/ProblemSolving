package leSuccess_Assignment.Assignment3;

public class printTheElementFoundOrNot {
    public static void main(String[] args) {
        int[] arr={3,5,6,7,8};
        int target=7;
        System.out.println(findTheElement(arr,target));
    }
    static int findTheElement(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
