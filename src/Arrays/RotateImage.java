package Arrays;

import java.util.Arrays;

//48
public class RotateImage {
    public static void main(String[] args) {
    int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
        for(int[] i:nums)
            System.out.println(Arrays.toString(i));
        System.out.println();
    rotate(nums);
        for(int[] i:nums)
            System.out.println(Arrays.toString(i));
    }
    static public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length-1;i++)
        {
            for(int j=i+1;j<matrix[0].length;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            int l=0,r=matrix[i].length-1;
            while(l<r)
            {
                int temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp;
                l++;
                r--;
            }
        }
    }
}
