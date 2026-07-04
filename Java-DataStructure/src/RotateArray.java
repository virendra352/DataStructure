import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {   //[2, 6, 9, 7, 1, 5]
        int[] arr={7,1,5,2,6,9};    //9,6,2,5,1,7  // 2,6,9,7,1,5
        int k=3; //anti clock wise
        int n=arr.length-1;
        for (int i = 0; i <3; i++) {
            int a=arr[arr.length-1];
            for (int j =arr.length-1; j>=1; j--) {
                 arr[j]=arr[j-1];
            }
            arr[0]=a;
        }
        System.out.println(Arrays.toString(arr));
        int[] arr1={7,1,5,2,6,9};

        reverseArray(arr1,0,arr1.length-1);
        reverseArray(arr1,0,k-1);
        reverseArray(arr1,k,arr1.length-1);

        System.out.println("After sorting"+Arrays.toString(arr1));
    }

    private static void reverseArray(int[] arr,int first,int last) {

        while (first<last) {   //window sliding approach
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }
}
