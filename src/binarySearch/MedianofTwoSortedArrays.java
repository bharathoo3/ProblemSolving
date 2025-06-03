package binarySearch;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1={1,3,4,7,10,12};
        int[] nums2={2,3,6,15};
        System.out.println(findMedian(nums1,nums2));
    }
    static double findMedian(int[] nums1,int[] nums2)
    {
        int n1=nums1.length,n2=nums2.length;
        int n3=n1+n2;
        int ind1=n3/2;
        int ind2=ind1-1;
        int i=0,j=0,count=0;
        int indval1=-1,indval2=-1;
        while( i<n1 && j<n2 )
        {
            if(nums1[i] < nums2[j])
            {
                if(count==ind1)indval1=nums1[i];
                if(count==ind2)indval2=nums1[i];
                i++;
                count++;
            }
            else{
                if(count==ind1)indval1=nums2[j];
                if(count==ind2)indval2=nums2[j];
                j++;
                count++;
            }
            if(indval1!=-1 && indval2!=-1)
                break;
        }
        while(i<n1)
        {
            if(count==ind1)indval1=nums1[i];
            if(count==ind2)indval2=nums1[i];
            i++;
            count++;
            if(indval1!=-1 && indval2!=-1)
                break;
        }
        while (j<n2)
        {
            if(count==ind1)indval1=nums2[j];
            if(count==ind2)indval2=nums2[j];
            j++;
            count++;
            if(indval1!=-1 && indval2!=-1)
                break;
        }
        if(n3%2==1)
            return indval1;
        return (double) ((indval1+indval2)/2.0);
    }
}
