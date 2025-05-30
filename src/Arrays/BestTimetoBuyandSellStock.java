package Arrays;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] prices={7,1,3,5,6,4};
        System.out.println(findprofit(prices));
    }
    public static int findprofit(int[] prices)
    {
        int curretPrize=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++)
        {
            curretPrize=Math.min(curretPrize,prices[i]);
            int currprofit=prices[i]- curretPrize;
            maxProfit=Math.max(maxProfit,currprofit);
        }
        return maxProfit;
    }
}
