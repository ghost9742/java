public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 100, 0.86);
    stockList.addStock(temp);

    temp = new StockItem("cake", 7, 1.10);
    stockList.addStock(temp);

        temp = new StockItem("car", 2, 12.50);
        stockList.addStock(temp);

        temp = new StockItem("chair", 4, 0.50);
        stockList.addStock(temp);
        temp = new StockItem("chair", 3, 0.20);
        stockList.addStock(temp);

        temp = new StockItem("apple", 43, 0.10);
        stockList.addStock(temp);


        System.out.println(stockList);

        for(String s: stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket timsBasket = new Basket("Tim");
        sellItem(timsBasket, "car", 1);
        System.out.println(timsBasket);


        sellItem(timsBasket, "spanner", 5);
        System.out.println(timsBasket);

        stockList.Items().get("car").adjustStock(2000);
        stockList.Items().get("car").adjustStock(-2000);
        System.out.println(stockList);

        sellItem(timsBasket, "car", 1);
        System.out.println(timsBasket);

    }
    public static int sellItem(Basket basket, String item, int quantity) {
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
