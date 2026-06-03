import java.util.Scanner;

class Stock {
    private String stockName;
    private double price;

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    public String getStockName() {
        return stockName;
    }

    public double getPrice() {
        return price;
    }
}

class Portfolio {
    private double balance;
    private int sharesOwned;

    public Portfolio(double balance) {
        this.balance = balance;
        this.sharesOwned = 0;
    }

    public void buyStock(Stock stock, int quantity) {
        double totalCost = stock.getPrice() * quantity;

        if (balance >= totalCost) {
            balance -= totalCost;
            sharesOwned += quantity;

            System.out.println("Successfully bought " +
                    quantity + " shares of " +
                    stock.getStockName());
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void sellStock(Stock stock, int quantity) {

        if (sharesOwned >= quantity) {
            double totalValue = stock.getPrice() * quantity;

            balance += totalValue;
            sharesOwned -= quantity;

            System.out.println("Successfully sold " +
                    quantity + " shares of " +
                    stock.getStockName());
        } else {
            System.out.println("Not enough shares to sell.");
        }
    }

    public void displayPortfolio() {
        System.out.println("\n----- Portfolio -----");
        System.out.println("Available Balance: ₹" + balance);
        System.out.println("Shares Owned: " + sharesOwned);
        System.out.println("Portfolio Value: ₹" + balance);
    }
}

public class StockTradingPlatform {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Stock stock = new Stock("TCS", 3500);
        Portfolio portfolio = new Portfolio(50000);

        int choice;

        do {
            System.out.println("\n=================================");
            System.out.println("      STOCK TRADING PLATFORM");
            System.out.println("=================================");
            System.out.println("1. View Market Data");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nMarket Data");
                    System.out.println("Stock Name : " + stock.getStockName());
                    System.out.println("Current Price : ₹" + stock.getPrice());
                    break;

                case 2:
                    System.out.print("Enter quantity to buy: ");
                    int buyQty = scanner.nextInt();
                    portfolio.buyStock(stock, buyQty);
                    break;

                case 3:
                    System.out.print("Enter quantity to sell: ");
                    int sellQty = scanner.nextInt();
                    portfolio.sellStock(stock, sellQty);
                    break;

                case 4:
                    portfolio.displayPortfolio();
                    break;

                case 5:
                    System.out.println("Thank You for using Stock Trading Platform!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        scanner.close();
    }
}