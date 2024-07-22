import java.util.Arrays;

public class bubble {
public static void main(String[] args) {
	
	int[] ar= {4,6,33,67,8,10,65};
	
	//Arrays.sort(ar);
	//Arrays.stream(ar).forEach(System.out::println);
	System.out.println("--------------------------------------");
	for (int i = 0; i < ar.length; i++) {
		for (int j = i; j < ar.length-1; j++) {
			if(ar[i]>ar[j+1]) {
				int tem=ar[i];
				ar[i]=ar[j+1];
				ar[j+1]=tem;
			}
		}
	}
	Arrays.stream(ar).forEach(System.out::println);
	System.out.println(Arrays.toString(ar));
	int[] array = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
	for(int i=0;i<array.length;i++){
        for(int j=i;j<array.length;j++){
        if(array[i]<array[j]){
            int temp=array[i];
            array[j]=array[i];
            array[j]=temp;
        }
      }
    }
	System.out.println(Arrays.toString(array));
	Arrays.to
}
}
