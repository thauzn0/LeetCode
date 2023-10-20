package leetCode_1475_finalPricesWithASpeacilDiscountInAShop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class finalPricesWASDIAS {
    //You are given an integer array prices where prices[i] is the price of the ith item in a shop.
    //
    //There is a special discount for items in the shop.
    // If you buy the ith item, then you will receive a discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i].
    // Otherwise, you will not receive any discount at all.



    //Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop, considering the special discount.
    public static int[] finalPrices(int[] prices) {

        int j;
        for (int i = 0; i < prices.length;i++){
            j  = i + 1;
            while (j < prices.length && prices[i] < prices[j]){
                j++;
            }//secondPointer < prices.length && secondPointer > i && prices[i] >= prices[secondPointer]
            if ( j < prices.length &&  j > i && prices[j] <= prices[i]){
                prices[i] = prices[i] - prices[j];
            }
        }
        return prices;
    }

    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};
        System.out.println(Arrays.toString(finalPrices(prices)));
    }
}
