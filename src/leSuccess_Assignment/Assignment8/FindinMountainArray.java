package leSuccess_Assignment.Assignment8;

public class FindinMountainArray {
    public static void main(String[] args) {
        int[] mountainArr={1,2,3,4,5,3,1};
        int target=3;
       int peak=findPeak(mountainArr);
       int index=binarySearch(mountainArr,target,0,peak);
       if(index!=-1)
           System.out.println(index);
       else
           System.out.println(binarySearch(mountainArr,target,peak,mountainArr.length-1));
    }
    static int findPeak(int[] mountainArr)
    {
        int left=0,right=mountainArr.length-1;
        while (left<right)
        {
            int mid=left+(right-left)/2;
            if(mountainArr[mid]>mountainArr[mid+1])
                right=mid;
            else
                left=mid+1;
        }
        return left;
    }
    static int binarySearch(int[] mountainArr,int target,int left,int right)
    {
        boolean ascending=mountainArr[left]<mountainArr[right];
        while (left<=right)
        {
            int mid=left+(right-left)/2;
            if(mountainArr[mid]==target)
                return mid;
            if(ascending)
            {
                if(target>mountainArr[mid])
                 left=mid+1;
                else
                    right=mid-1;
            }
            else
            {
                if(target>mountainArr[mid])
                    right=mid-1;
                else
                    left=mid+1;
            }

        }
        return -1;
    }
}
