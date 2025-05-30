package leSuccess_Assignment.Assignment6;

public class majorityelement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 3, 3, 3};
        System.out.println(majority(arr));
    }
    static int majority(int[] arr){
        int maj=arr[0];
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(maj==arr[i]){
                count++;
            }else{
                count--;
            }if(count==0){
                maj=arr[i];
                count=1;
            }
        }
        return maj;
    }
}
