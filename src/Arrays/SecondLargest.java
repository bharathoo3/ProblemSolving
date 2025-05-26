package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {4,8,1,3,6};
        int n =secondLargest(arr);
        System.out.println(n);
    }
    static int secondLargest(int [] arr){
        int largest = arr[0];
        int second = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(largest < arr[i]){
                second = largest;
                largest = arr[i];
            } else if (arr[i] < largest && largest > second) {
                second = arr[i];
            }
        }
        return second;
    }
}
