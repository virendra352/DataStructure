public class MaxProfitBuySell {
    public static void main(String[] args) {
        int[] arr={7,1,5,2,6,9};
        int buy=Integer.MAX_VALUE;
        int profit=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
             if(arr[i]<buy){
                buy=arr[i];
             } else if (arr[i]-buy>profit) {
                 profit=arr[i];
             }
        }

        System.out.println("Stock buying "+buy);
        System.out.println("Stock profit "+(profit));
    }
}
