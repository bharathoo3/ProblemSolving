package leSuccess_Assignment.Assignment3;

public class rotateArrayDplaces {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int k=2;
        generate(arr,k);
        for(int i:arr){
            System.out.println(i+" ");
        }
    }
    static void generate(int[] arr,int k){
        k=k%arr.length;
        rotate(arr,0,k-1);
        rotate(arr,k,arr.length-1);
        rotate(arr,0,arr.length-1);
    }
    static void rotate(int[] arr,int l,int r){
        while(l<r){
            swap(arr,l,r);
            l++;
            r--;
        }
    }
    static void swap(int[] arr,int l,int r){
        int temp=arr[r];
        arr[r]=arr[l];
        arr[l]=temp;
    }
}
