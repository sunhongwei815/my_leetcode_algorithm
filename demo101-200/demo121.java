/**
 * @author:Sun Hongwei
 * @2020/2/11 下午7:32
 * File Description：买卖股票的最佳时机
 *
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 *
 *
 * 动态规划：设置两个变量储存之前的最小价格minprice和当前最大利润maxprofit,遍历即可
 */
public class demo121 {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int maxprofit=0,minprice=prices[0];
        for(int p:prices){
            if(minprice>p){
                minprice=p;  //若当前价格是最小，更新minprice
            }else if(p-minprice>maxprofit){
                maxprofit=p-minprice; //若当前价格不是最小，判断是否需要更新maxprofit
            }
        }
        return maxprofit;
    }
}
