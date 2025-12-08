/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and 
choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. 
If you cannot achieve any profit, return 0. 

concept: Array, Greedy
*/

public class Buy_Sell_Stocks {
    public void buy_sell_stock(int[] arr){
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        for(int i=minIndex; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        if(minIndex == -1 || max - min < 0 || minIndex == arr.length - 1){
            System.out.println("No profit can be made");
            return;
        }
        System.out.println("Maximum profit is: " + (max - min));
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        Buy_Sell_Stocks obj = new Buy_Sell_Stocks();
        obj.buy_sell_stock(prices);
    }
}