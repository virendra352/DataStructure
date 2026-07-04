package core.java.Basic;

import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,4,4,1,2,1,2}; //
        int k=0;
        int[] newArray=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate=false;
            for (int j = 0; j < i; j++) {
                 if(arr[i]==arr[j]){
                     duplicate=true;
                     newArray[k++]=arr[i];
                     break;
                 }
            }
            if(!duplicate){
              newArray[k++]  =arr[i];
            }// world
        }


        int[] ints = Arrays.copyOf(newArray, k);
        System.out.println(Arrays.toString(ints));
    }
}
