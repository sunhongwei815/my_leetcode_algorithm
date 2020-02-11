/**
 * @author:Sun Hongwei
 * @2020/2/11 下午7:41
 * File Description：买卖股票的最佳时机II
 *
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *
 *
 * 尽可能的多赚钱，就是只要后一天比前一天多，那么就进行一次买卖
 *
 */
public class demo122 {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                maxprofit+=(prices[i]-prices[i-1]);
            }
        }
        return maxprofit;

    }
}
