import java.util.ArrayList;

public class stock_price {

  public static void main(String[] args) {
    // set the static and dinamyc arrays of stocks, where stock_prices is static and stoc_price_dinamyic is dinamyc
    int[] stock_prices = { 910, 920, 930, 940, 950, 960, 970, 980, 990, 1000 };
    ArrayList<Integer> stoc_price_dinamyic = new ArrayList<Integer>();
    ArrayList<Integer> stoc_price_dinamyic_cumulative;
    
    // add the values to the dinamyc array
    stoc_price_dinamyic.add(910);
    stoc_price_dinamyic.add(920);
    stoc_price_dinamyic.add(930);

    // call the functions
    calculateAveragePrice(stock_prices);
    findMaximumPrice(stock_prices);
    countOccurrences(stock_prices, 950);
    stoc_price_dinamyic_cumulative = computeCumulativeSum(stoc_price_dinamyic);
    System.out.println("The cumulative sum of the stock prices is: " + stoc_price_dinamyic_cumulative);
  }
  
  public static void calculateAveragePrice(int[] stock_prices) {
    // calculate the avarage of the stock and store in a variable call sum.
    int sum = 0;
    for (int i = 0; i < stock_prices.length; i++) {
      sum += stock_prices[i];
    }
    System.out.println("The avarage of the stock prices is: " + sum / stock_prices.length);
  }

  public static void findMaximumPrice(int[] stock_prices) {
    // the same ideia of the sum, but now i am change the value store in the variable max.
    int max = stock_prices[0];
    for (int i = 1; i < stock_prices.length; i++) {
      if (stock_prices[i] > max) {
        max = stock_prices[i];
      }
    }
    System.out.println("The maximum stock price is: " + max);
  }

  public static void countOccurrences(int[] stock_prices, int price) {
    // count the number of times that the price is in the array.
    int count = 0;
    for (int i = 0; i < stock_prices.length; i++) {
      if (stock_prices[i] == price) {
        count++;
      }
    }
    System.out.println("The price " + price + " occurred " + count + " times");
  }

  public static ArrayList<Integer> computeCumulativeSum(ArrayList<Integer> stock_prices) {
    //creat a new arraList, and add the values of the stock_prices cumulated in the new array and return.
    ArrayList<Integer> cumulativeSum = new ArrayList<>();
    int sum = 0;
    for (int price : stock_prices) {
        sum += price;
        cumulativeSum.add(sum);
    }
    return cumulativeSum;
}
}
