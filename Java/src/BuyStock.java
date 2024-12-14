import java.util.logging.Logger;

public class BuyStock {

    public static final Logger log = Logger.getLogger(BuyStock.class.getSimpleName());

    public static int maxProfit(int[] prices) {

        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }



    public static void main(String[] args) {
        log.info(String.valueOf(maxProfit(new int[]{7, 1, 5, 3, 6, 4})));
    }
}
