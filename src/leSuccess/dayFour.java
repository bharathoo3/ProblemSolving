package leSuccess;

import java.util.Arrays;
import java.util.Scanner;

public class dayFour {
    public static void main(String[] args) {

//        int[] customre={30,30,120};
//        int flag=0;
//        if(customre[0]==30) {
//            int keep=customre[0];
//            for (int i = 1; i < customre.length; i++) {
//                keep = keep+30;
//                keep=keep-(customre[i]-30);
//                if(keep<0) {
//                    System.out.println("failed Transaction");
//                    System.out.println("We want extra amount to give change to user "+(i+1)+": "+Math.abs(keep));
//                    flag++;
//                    break;
//                }
//            }
//            if(flag==0) {
//                System.out.println("successfull Transaction");
//                System.out.println("Profit amount in that day is " + customre.length*30);
//            }
//        }else{
//            System.out.println("transaction failed");
//        }

//        String str1="Hello to the Class";
//        String str2="Welcome ";
//        int target=6;
//        String temp=str1.substring(0,target)+str2+str1.substring(target,str1.length()-1);
//
//        System.out.println(temp);

//        int energy,vrnuber;
//        Scanner sc=new Scanner(System.in);
//        int energyLose=0,i=0,flag=0;
//        energy=sc.nextInt();vrnuber= sc.nextInt();;
//        int[] Ve=new int[vrnuber];
//        for(int j=0;j<vrnuber;j++)Ve[j]= sc.nextInt();
//        Arrays.sort(Ve);
////        System.out.println(Arrays.toString(Ve));
//        for(i=0;i<vrnuber;i++)
//        {
//            energyLose=((Ve[i]%2)+(Ve[i]/2));
//            if(energyLose>energy) {
//                System.out.println("failed");
//                flag++;
//
//                break;
//            }
//            energy=energy-energyLose;
//        }
//        if(flag==0)
//            System.out.println("successfully completed");
//        System.out.println("varients killed: "+i);

        String str="4523EF58EF";
        System.out.println(str);
        StringBuilder ch=new StringBuilder(str);

        for(int i=0;i<ch.length();i++)
        {
            if(ch.charAt(i)=='E')
            {
                if(ch.charAt(i+1)=='F')
                    ch.delete(i,i+2);
                    ch.append("  ");
            }
            if(ch.charAt(i)=='G')
                ch.delete(i,i+1);
        }
        System.out.println(ch);

    }
}
