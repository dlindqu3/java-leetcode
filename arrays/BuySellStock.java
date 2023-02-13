package arrays;


// leetcode 121 
// return max profit
public class BuySellStock {
    public static void main(String[] args) {
        int[] arr1 = {7,1,5,3,6};
        int[] arr2 = {7,6,4,3,1};

        maxProfit(arr1); 
        maxProfit(arr2); 

    }

    public static void maxProfit(int[] prices) {

        int p1 = 0; 
        int p2 = 1; 
        int maxProfit = 0; 

        while (p2 < prices.length){
            if (prices[p1] == prices[p2]){ 
                p2 += 1; 
            } else if (prices[p1] < prices[p2]){
                maxProfit = Math.max(maxProfit, prices[p2] - prices[p1]); 
                p2 += 1; 
            } else if (prices[p1] > prices[p2]){
                p1 = p2; 
                p2 += 1; 
            }
        }
        System.out.println(maxProfit); 
    }
}
