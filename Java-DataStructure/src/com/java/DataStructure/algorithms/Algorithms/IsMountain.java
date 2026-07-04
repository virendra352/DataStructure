package com.java.DataStructure.algorithms.Algorithms;

public class IsMountain {
    public static void main(String[] args) {
        int[] ar={1,4,6,13,10,12};
        int left=0;
        int right=ar.length-1;
        //int mx=ar[0];
        boolean flag = false;
        for (int i = 0; i < ar.length-1; i++) {

            if(right==ar.length-1 &&ar[i]<ar[i+1]){
                left++;
            }
            else if (ar[i] > ar[i + 1]) {
                right--;
            }
           /* if(ar[i]>ar[i+1]){
                right--;
            }
            else if(right<=ar.length) {
                if (ar[i] < ar[i + 1]) {
                    left++;
                }
            }*/
              /*else if(ar[i]>ar[i+1]){
                 right--;
             }*/
        }
      /*  if(flag==false){
            System.out.println(false);
        }
        else
            System.out.println(true);*/
        System.out.println("Peak element : "+ ar[left]);
       /* for (int i =ar.length-1; i>=0; i--) {
             if(ar[i]<ar[i-1]){
                 right--;
             }else {
                 break;
             }
        }*/
        boolean result=(ar[right]==ar[left])?true:false;
        System.out.println(result);

    }
}
