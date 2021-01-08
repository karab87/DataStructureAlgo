package com.atak.arrays;

public class StockByAndSell {
    public static int naiveMaxProfit(int price[], int start, int end){
        if(end <= start)
            return 0;
        int profit = 0;
        for (int i = start; i < end; i++) {
            for (int j = i+1; j <= end; j++) {
                if(price[j] > price[i]){
                    int curr_profit = price[j] - price[i]+
                            naiveMaxProfit(price, start, i-1) +
                            naiveMaxProfit(price, j+1, end);

                    profit = Math.max(profit, curr_profit);
                }
            }
        }
        return profit;
    }

    public static int maxProfit(int price[], int start, int end){
        int profit = 0;
        for (int i = 1; i < price.length; i++) {
            if(price[i]>price[i-1])
                profit+=(price[i]-price[i-1]);

        }
        return profit;
    }

    }
